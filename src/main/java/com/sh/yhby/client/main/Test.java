package com.sh.yhby.client.main;

import io.netty.channel.ChannelFuture;

import com.sh.yhby.client.cache.ClientCache;
import com.sh.yhby.protobuf.ActionProbuf;
import com.sh.yhby.protobuf.ActionTypeProbuf.ActionType;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		NettyClient client = new NettyClient("127.0.0.1", 9000);
		client.connect();
		System.out.println("客户端开始登录");

		if (client.getSocketChannel() != null) {
			ActionProbuf.Action.Builder actionBuilder = ActionProbuf.Action
					.newBuilder();
			actionBuilder.setActionType(ActionType.LOGIN);
			ActionProbuf.Action loginAction = actionBuilder.build();
			ChannelFuture future = client.getSocketChannel()
					.writeAndFlush(loginAction).sync();
			if (future.isSuccess()) {
				System.out.println("发送成功");
			}
		} else {
			System.out.println("socketchannel为空");
		}
		
		new Thread(new Runnable(){

			public void run() {
				while(true){
					if(ClientCache.socketChannel.isInputShutdown()){
						System.out.println("inputShutDown");
					}
				}		
			}
			
		}).start();

	}

}
