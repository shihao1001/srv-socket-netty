package com.sh.yhby.client.main;

import com.sh.yhby.client.cache.ClientCache;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		NettyClient client = new NettyClient("127.0.0.1", 9000);
		System.out.println("客户端开始登录");
		/*if (client.getSocketChannel() != null) {
			ActionProbuf.Action.Builder actionBuilder = ActionProbuf.Action.newBuilder();
			actionBuilder.setActionType(ActionType.LOGIN);
			ActionProbuf.Action loginAction = actionBuilder.build();
			ChannelFuture future = client.getSocketChannel().writeAndFlush(loginAction).sync();
			if (future.isSuccess()) {
				System.out.println("发送成功");
			}
		}	*/
		
		boolean isLoginSuccess = client.login();
		
		//循环监听是否断线，断线重连	
		new Thread(new Runnable(){
			public void run() {
				int reConnectCount = 0;
				while(true){
					if(ClientCache.client == null){
						NettyClient client = new NettyClient("127.0.0.1", 9000);
						client.login();
					}else{
						if(ClientCache.client.isShutdown){
							NettyClient client = new NettyClient("127.0.0.1", 9000);
							client.login();
							if(client.getSocketChannel() != null){
								ClientCache.client = null;
								ClientCache.client = client;
								reConnectCount = 0;
							}else{
								reConnectCount++;
								if(reConnectCount <=5){
									try {
										System.out.println("重试："+reConnectCount+"次，等待："+(reConnectCount * 5) + "秒");
										Thread.sleep(reConnectCount * 5 * 1000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}else if(reConnectCount > 5 && reConnectCount < 10){
									try {
										System.out.println("重试："+reConnectCount+"次，等待："+(reConnectCount - 5) + "分钟");
										Thread.sleep( (reConnectCount - 5) * 60 * 1000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}else if(reConnectCount == 10){
									try {
										reConnectCount = 0;
										System.out.println("重试："+10+"次，等待半小时");
										Thread.sleep(30 * 60 * 1000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
							}
						}
					}
					
				}	
			}	
		}).start();
	}

}
