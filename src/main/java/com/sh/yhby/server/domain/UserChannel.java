package com.sh.yhby.server.domain;

import io.netty.channel.Channel;

public class UserChannel {
	
	private Long userId;
	private Channel channel;
	private long connectTime = System.currentTimeMillis();			//创建长连接时间
	private long lastHeatbeatTime = System.currentTimeMillis();		//上一次心跳时间 
	
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Channel getChannel() {
		return channel;
	}
	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	public long getConnectTime() {
		return connectTime;
	}
	public void setConnectTime(long connectTime) {
		this.connectTime = connectTime;
	}
	public long getLastHeatbeatTime() {
		return lastHeatbeatTime;
	}
	public void setLastHeatbeatTime(long lastHeatbeatTime) {
		this.lastHeatbeatTime = lastHeatbeatTime;
	}
	
	
	public void refreshHeatbeat(){
		this.lastHeatbeatTime = System.currentTimeMillis();
	}
	
	public UserChannel(){}
	
	public UserChannel(Long userId, Channel channel) {
		super();
		this.userId = userId;
		this.channel = channel;
	}
	
	
}
