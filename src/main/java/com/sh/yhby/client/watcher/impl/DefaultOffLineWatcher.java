package com.sh.yhby.client.watcher.impl;

import com.sh.yhby.client.cache.ClientCache;
import com.sh.yhby.client.main.NettyClient;
import com.sh.yhby.client.watcher.inter.OffLineWatcher;

public class DefaultOffLineWatcher implements OffLineWatcher {

	public void reconnect() {
		int reConnectCount = 0;		
		while(true){
			if(ClientCache.client == null){
				NettyClient client = new NettyClient("127.0.0.1", 9000);
				client.setOffLineWatcher(new DefaultOffLineWatcher());
				boolean isSussess = client.login();
				if(isSussess){
					break;
				}
			}else{
				if(ClientCache.client.isShutdown){
					NettyClient client = new NettyClient("127.0.0.1", 9000);
					client.setOffLineWatcher(new DefaultOffLineWatcher());
					client.login();
					if(client.getSocketChannel() != null){
						ClientCache.client = client;
						reConnectCount = 0;
						break;
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
}

