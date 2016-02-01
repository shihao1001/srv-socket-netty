package com.sh.yhby.server.cache;


import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.sh.yhby.server.domain.UserChannel;

public class CometCache {

	private static final Map<Long, UserChannel> userId2UserChannel = new ConcurrentHashMap<Long, UserChannel>(1024);
	//private static final Map<Integer, UserChannel> channelId2UserChannel = new ConcurrentHashMap<Integer,UserChannel>(1024);
	

	public static void addConnect(final UserChannel userChannel) {
		UserChannel uc = userId2UserChannel.remove(userChannel.getUserId());
		if (uc != null) {
			ChannelFuture future = uc.getChannel().close();
			future.addListener(new ChannelFutureListener() {
				public void operationComplete(ChannelFuture future)
						throws Exception {
					userId2UserChannel.put(userChannel.getUserId(),
							userChannel);
				}
			});
		} else {
			userId2UserChannel.put(userChannel.getUserId(), userChannel);
		}
	}

	public static UserChannel getConnect(Long userId) {
		return userId2UserChannel.get(userId);
	}

	public static void removeConnect(Long userId) {
		userId2UserChannel.remove(userId);
	}

	public static Collection<UserChannel> getAllConnect() {
		return userId2UserChannel.values();
	}

}
