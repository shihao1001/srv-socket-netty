package com.sh.yhby.client.main;

import com.sh.yhby.client.cache.ClientCache;
import com.sh.yhby.client.netty.handler.ClientHandler;
import com.sh.yhby.protobuf.ActionProbuf;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
import io.netty.handler.timeout.IdleStateHandler;

public class NettyClient {
	private String ipAddr = "127.0.0.1";
	private Integer port = 9000; 
	private SocketChannel socketChannel;
	private EventLoopGroup group;
	public volatile boolean isShutdown = true;
	
	public String getIpAddr() {
		return ipAddr;
	}

	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public SocketChannel getSocketChannel() {
		return socketChannel;
	}

	public void setSocketChannel(SocketChannel socketChannel) {
		this.socketChannel = socketChannel;
	}
	
	public NettyClient() {
		connect();
	}
	
	public NettyClient(String ipAddr, Integer port) {
		this.ipAddr = ipAddr;
		this.port = port;
		connect();
	}
	
	public void shutdown(){
		group.shutdownGracefully();
		isShutdown = true;
        System.out.println("客户端优雅的释放了线程资源...");
	}
	
	public void connect(){
		 //配置客户端NIO线程组
	    group = new NioEventLoopGroup();
	    try {
	        //客户端辅助启动类 对客户端配置
	        Bootstrap b = new Bootstrap();
	        b.group(group).channel(NioSocketChannel.class)
	                .option(ChannelOption.TCP_NODELAY, true)
	                .option(ChannelOption.SO_KEEPALIVE,true)
	                .handler(new ChannelInitializer<SocketChannel>() {  
                        @Override  
                        public void initChannel(SocketChannel socketChannel)  
                                throws Exception {  
                        	ChannelPipeline pipeline = socketChannel.pipeline();
                        	pipeline.addLast(new IdleStateHandler(0, 5, 0));//60秒未写 就发送心跳数据
                        	pipeline.addLast("frameDecoder", new ProtobufVarint32FrameDecoder());
            				pipeline.addLast("protobufDecoder",new ProtobufDecoder(ActionProbuf.Action.getDefaultInstance()));
                        	pipeline.addLast("frameEncoder", new ProtobufVarint32LengthFieldPrepender());
                        	pipeline.addLast("protobufEncoder", new ProtobufEncoder());
                        	pipeline.addLast("clientHandler", new ClientHandler());
                        }  
                    });  
	        //异步链接服务器 同步等待链接成功
	        ChannelFuture future = b.connect(ipAddr, port).sync();
	        if(future.isSuccess()){
	        	System.out.println("客户端连接成功");
	        	socketChannel = (SocketChannel) future.channel();
	        	//ClientCache.socketChannel = socketChannel;//设置客户端socketChannel
	        	isShutdown = false;
	        	ClientCache.client = this;
	        }
	    }catch(Exception e){
	    	e.printStackTrace();
	    	System.out.println("连接出错");
	    }
	}

}
