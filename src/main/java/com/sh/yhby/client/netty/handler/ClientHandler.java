package com.sh.yhby.client.netty.handler;

import com.sh.yhby.client.srv.impl.ClientServiceImpl;
import com.sh.yhby.protobuf.ActionProbuf;
import com.sh.yhby.protobuf.ActionTypeProbuf;
import com.sh.yhby.protobuf.ActionProbuf.Action;
import com.sh.yhby.protobuf.ActionTypeProbuf.ActionType;
import com.sh.yhby.server.cache.CacheUtil;
import com.sh.yhby.server.cache.CometCache;
import com.sh.yhby.server.domain.CometContext;
import com.sh.yhby.server.domain.UserChannel;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.timeout.IdleStateEvent;

public class ClientHandler extends ChannelHandlerAdapter {
	
	//利用写空闲发送心跳检测消息
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent) {
            IdleStateEvent e = (IdleStateEvent) evt;
            switch (e.state()) {
                case WRITER_IDLE:
                	ActionProbuf.Action.Builder actionBuilder = ActionProbuf.Action.newBuilder();
			       actionBuilder.setActionType(ActionType.PING);
			       ActionProbuf.Action pingAction = actionBuilder.build();
                    ctx.writeAndFlush(pingAction);
                    System.out.println("send ping to server----------");
                    break;
                default:
                    break;
            }
        }
    }

	public void channelRead(ChannelHandlerContext ctx, Object msg)
            throws Exception {
		ActionProbuf.Action action = (ActionProbuf.Action) msg;
		
		switch(action.getActionType()){
		    case LOGIN:{//服务器要求重新登录
		    	new ClientServiceImpl().login();
		    }
		    break;
		    case RECEIVE_MESSAGE:{//服务器要求接受数据
		    	//1.接收消息
		    	//2.发送确认接受消息通知RECEIVED_MESSAGE_ACK
		    }
		    break;
		    case SENDED_MESSAGE_ACK:{//服务器 发送消息 消息投递成功 通知消息
		    	
		    }
		    break;
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