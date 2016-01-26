package com.sh.yhby.client.srv.impl;

import io.netty.channel.socket.SocketChannel;

import com.sh.yhby.client.cache.ClientCache;
import com.sh.yhby.client.srv.ClientServiceInter;
import com.sh.yhby.protobuf.ActionProbuf;
import com.sh.yhby.protobuf.ActionProbuf.Action;
import com.sh.yhby.protobuf.ActionTypeProbuf.ActionType;


public class ClientServiceImpl implements ClientServiceInter {
	private SocketChannel clientChannel;
	private String token;
	
	public ClientServiceImpl(){
		this.clientChannel = ClientCache.socketChannel;
		this.token = ClientCache.token;//从android sqlite中获取
	}

	public void login() {
		ActionProbuf.Action.Builder actionBuilder = ActionProbuf.Action.newBuilder();
		actionBuilder.setActionType(ActionType.LOGIN);
		
		Action loginAction = actionBuilder.build();
		clientChannel.writeAndFlush(loginAction);
	}
	
	public void sendMessage(Action action){
		//SEND_MESSAGE  
		
		
	}

	

}
