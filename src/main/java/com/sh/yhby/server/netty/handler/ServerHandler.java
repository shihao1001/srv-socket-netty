package com.sh.yhby.server.netty.handler;

import java.io.IOError;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sh.yhby.protobuf.ActionProbuf;
import com.sh.yhby.protobuf.ActionProbuf.Action;
import com.sh.yhby.protobuf.ActionTypeProbuf;
import com.sh.yhby.protobuf.ActionTypeProbuf.ActionType;
import com.sh.yhby.protobuf.MessageProbuf;
import com.sh.yhby.server.cache.CacheUtil;
import com.sh.yhby.server.cache.CometCache;
import com.sh.yhby.server.domain.CometContext;
import com.sh.yhby.server.domain.UserChannel;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.TooLongFrameException;

public class ServerHandler extends ChannelInboundHandlerAdapter {

	private final static Logger logger = LoggerFactory.getLogger(ServerHandler.class);

	public void channelRead(ChannelHandlerContext ctx, Object msg)
			throws Exception {
		ActionProbuf.Action action = (ActionProbuf.Action) msg;
		logger.info("server读到消息类型为："+action.getActionType().getNumber());
	
		CometContext context = new CometContext(ctx.channel(), action);
		handlerRequest(context);
	}

	private void handlerRequest(CometContext context) {
		Channel channel = context.getChannel();
		Action action = context.getAction();

		String userToken = action.getToken();
		Long userId = CacheUtil.getUserId(userToken);
		
		UserChannel userChannel = null;

		if (action.getActionType().equals(ActionTypeProbuf.ActionType.LOGIN)) {// 长连接登录
			// 验证用户，当前直连，没有验证
			logger.info(String.format("用户id为：%d的用户通过长连接登录！", userId));
			CometCache.addConnect(new UserChannel(userId, channel));
		} else {
		    userChannel = CometCache.getConnect(userId);
			if (userChannel == null) {
				// 说明未登录，或者链接断了，向客户端发起登录请求，让客户端重新登录
				logger.info(String.format("用户id为：%d 的用户需要重新登录！", userId));
				System.out.println("请重新登录");
				ActionProbuf.Action.Builder actionBuilder = ActionProbuf.Action.newBuilder();
				actionBuilder.setActionType(ActionType.LOGIN);
				ActionProbuf.Action responseLoginAction = actionBuilder.build();
				channel.writeAndFlush(responseLoginAction);
				return;
			}
		}
		switch (action.getActionType()) {
		      case PING: {
		    	  //心跳
			      userChannel.refreshHeatbeat();// 更新心跳时间
		      } break;
		      case SEND_MESSAGE:{
			      userChannel.refreshHeatbeat();// 更新心跳时间
		    	  //发送消息
			      System.out.println("开始发送消息");
			      MessageProbuf.Message message = action.getMessages(0);
			      long from = message.getFrom();
			      long to = message.getTo();
			      
			      ActionProbuf.Action.Builder newBuilder = action.newBuilderForType().setActionType(ActionType.RECEIVE_MESSAGE);
			      newBuilder.addMessages(message);
			      ActionProbuf.Action newAction =  newBuilder.build();
			      
			      System.out.println("修改后action类型："+newAction.getActionType());
			    
			      UserChannel toUserChannel = CometCache.getConnect(to);
			      if(toUserChannel.getChannel().isWritable()){
			    	  toUserChannel.getChannel().writeAndFlush(newAction);
			    	  System.out.println("发送消息完成");
			      }
			      
			      
		      } break;
		}

	}


	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
			throws Exception {
		if(cause instanceof IOException || cause instanceof IOError){
			System.out.println("出错了");	
			logger.info("长连接出错", cause);
			ctx.channel().close();
		}else if (cause instanceof TooLongFrameException) {
			logger.error("TooLongFrameException, close channel: " + ctx.channel().toString() + "\n" ,cause);
		}else{
			logger.error("channel unknow exception, close channel:" ,cause);
		}
		
	}

	

}
