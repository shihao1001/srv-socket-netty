package com.sh.yhby.server.task;

import java.util.Collection;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.sh.yhby.server.cache.CometCache;
import com.sh.yhby.server.domain.UserChannel;

public class CometChecker {
	
	private static ScheduledExecutorService timer = Executors.newScheduledThreadPool(10);
	private static final long timeOut = 5*60*1000;
	
	public static void startCheck(){
		timer.scheduleAtFixedRate(new Runnable(){
			public void run() {
				Collection<UserChannel> connects = CometCache.getAllConnect();
				if(connects != null && connects.size() > 0){
					for(UserChannel connect : connects ){
						long now = System.currentTimeMillis();
						long lastHeartbeatTime = connect.getLastHeatbeatTime();
						if(now - lastHeartbeatTime >timeOut){
							CometCache.removeConnect(connect.getUserId());
							connect.getChannel().close();
						}
					}
				}		
			}		
		}, 2*60*1000, timeOut, TimeUnit.SECONDS);
	}

}
