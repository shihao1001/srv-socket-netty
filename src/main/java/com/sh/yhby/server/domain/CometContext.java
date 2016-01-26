package com.sh.yhby.server.domain;

import io.netty.channel.Channel;

import com.sh.yhby.protobuf.ActionProbuf.Action;

public class CometContext {
	

	private Channel channel;
	private Action action;
	public Channel getChannel() {
		return channel;
	}
	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	public Action getAction() {
		return action;
	}
	public void setAction(Action action) {
		this.action = action;
	}
	public CometContext(Channel channel, Action action) {
		this.channel = channel;
		this.action = action;
	}
	
	
	

}
