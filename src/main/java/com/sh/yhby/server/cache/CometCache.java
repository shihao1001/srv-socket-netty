package com.sh.yhby.server.cache;

import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.sh.yhby.server.domain.UserChannel;

public class CometCache {
	
	private static final Map<Long,UserChannel> connectedUserChannel = new ConcurrentHashMap<Long,UserChannel>(1024);
	
	public static void addConnect(final UserChannel userChannel){
		UserChannel uc = null;
		synchronized (connectedUserChannel) {
			uc = connectedUserChannel.remove(userChannel.getUserId());
		}
		if(uc != null){
			ChannelFuture future = uc.getChannel().close();
			future.addListener(new ChannelFutureListener() {	
				public void operationComplete(ChannelFuture future) throws Exception {
					connectedUserChannel.put(userChannel.getUserId(), userChannel);
				}
			});
		}else{
			connectedUserChannel.put(userChannel.getUserId(), userChannel);
		}
	}
	
	
	public static UserChannel getConnect(Long userId){
		return connectedUserChannel.get(userId);	
	}
	
	public static void removeConnect(Long userId){
		connectedUserChannel.remove(userId);
	}
	
	
	

}
