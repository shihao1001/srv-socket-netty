package com.sh.yhby.server.task;

import java.util.Collection;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.sh.yhby.server.cache.CometCache;
import com.sh.yhby.server.domain.UserChannel;

public class CometChecker {
	
	private static ScheduledExecutorService timer = Executors.newScheduledThreadPool(10);
	private static final long timeOut = 2*60*1000;
	
	public static void startCheck(){
		timer.scheduleAtFixedRate(new TimerTask(){
			public void run() {
				try{
					Collection<UserChannel> connects = CometCache.getAllConnect();
					if(connects != null && connects.size() > 0){
						for(UserChannel connect : connects ){
							System.out.println("遍历connects");
							long now = System.currentTimeMillis();
							long lastHeartbeatTime = connect.getLastHeatbeatTime();
							if(now - lastHeartbeatTime >timeOut){
								System.out.println("更新时间较远，删除channel");
								CometCache.removeConnect(connect.getUserId());
								if(connect.getChannel().isActive()){
									connect.getChannel().close();
								}
							}
						}
					}
				}catch(Exception e){
					e.printStackTrace();
				}
			}		
		}, 1*60*1000, timeOut, TimeUnit.MILLISECONDS);
	}

}
