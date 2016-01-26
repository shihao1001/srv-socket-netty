package com.sh.yhby.server.netty.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sh.yhby.protobuf.ActionProbuf;
import com.sh.yhby.protobuf.ActionProbuf.Action;
import com.sh.yhby.protobuf.ActionTypeProbuf;
import com.sh.yhby.protobuf.ActionTypeProbuf.ActionType;
import com.sh.yhby.server.cache.CacheUtil;
import com.sh.yhby.server.cache.CometCache;
import com.sh.yhby.server.domain.CometContext;
import com.sh.yhby.server.domain.UserChannel;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

public class ServerHandler extends ChannelHandlerAdapter {

	private final static Logger logger = LoggerFactory
			.getLogger(ServerHandler.class);

	public void channelRead(ChannelHandlerContext ctx, Object msg)
			throws Exception {
		ActionProbuf.Action action = (ActionProbuf.Action) msg;
		CometContext context = new CometContext(ctx.channel(), action);
		handlerRequest(context);
	}

	private void handlerRequest(CometContext context) {
		Channel channel = context.getChannel();
		Action action = context.getAction();

		String userToken = action.getToken();
		Long userId = CacheUtil.getUserId(userToken);

		if (action.getActionType().equals(ActionTypeProbuf.ActionType.LOGIN)) {// 长连接登录
			// 验证用户，当前直连，没有验证
			logger.info(String.format("用户id为：%l的用户通过长连接登录！", userId));
			CometCache.addConnect(new UserChannel(userId, channel));
		} else {
			UserChannel userChannel = CometCache.getConnect(userId);
			if (userChannel == null) {
				// 说明未登录，或者链接断了，向客户端发起登录请求，让客户端重新登录
				ActionProbuf.Action.Builder actionBuilder = ActionProbuf.Action
						.newBuilder();
				actionBuilder.setActionType(ActionType.LOGIN);
				ActionProbuf.Action responseLoginAction = actionBuilder.build();
				channel.writeAndFlush(responseLoginAction);
			}
		}

		switch (action.getActionType()) {
		      case PING: {
		    	  //心跳
			      UserChannel userChannel = CometCache.getConnect(userId);
			      userChannel.refreshHeatbeat();// 更新心跳时间
		      } break;
		      case SEND_MESSAGE:{
		    	  UserChannel userChannel = CometCache.getConnect(userId);
			      userChannel.refreshHeatbeat();// 更新心跳时间
		    	  //发送消息
			      
			      
		      } break;
		}

	}

	public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
		ctx.flush();

	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
			throws Exception {

	}

}
