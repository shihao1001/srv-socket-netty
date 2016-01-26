package com.sh.yhby.client.main;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpRequestEncoder;
import io.netty.handler.codec.http.HttpResponseDecoder;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
import io.netty.handler.stream.ChunkedWriteHandler;



public class NettyClient {
	
	private String ipAddr;
	private Integer port;
	
	
	
	
	public void connect(){
		 //配置客户端NIO线程组
	    EventLoopGroup group = new NioEventLoopGroup();
	    try {
	        //客户端辅助启动类 对客户端配置
	        Bootstrap b = new Bootstrap();
	        b.group(group).channel(NioSocketChannel.class)
	                .option(ChannelOption.TCP_NODELAY, true)
	                .handler(new ChannelInitializer<SocketChannel>() {  
                        @Override  
                        public void initChannel(SocketChannel ch)  
                                throws Exception {  
                        	ChannelPipeline pipeline = ch.pipeline();
                        	pipeline.addLast("frameDecoder", new ProtobufVarint32FrameDecoder());
            				//	pipeline.addLast("protobufDecoder",new ProtobufDecoder());
                        	pipeline.addLast("frameEncoder", new ProtobufVarint32LengthFieldPrepender());
                        	pipeline.addLast("protobufEncoder", new ProtobufEncoder());
  
                        }  
                    });  
	        //异步链接服务器 同步等待链接成功
	        ChannelFuture f = b.connect(ipAddr, port).sync();
	        //等待链接关闭
	        f.channel().closeFuture().sync();
	    }catch(Exception e){
	    	System.out.println("连接出错");
	    } finally {
	        group.shutdownGracefully();
	        System.out.println("客户端优雅的释放了线程资源...");
	    }
	}
	
	 

}
