package com.sh.yhby.server.main;



import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpRequestDecoder;
import io.netty.handler.codec.http.HttpResponseEncoder;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
import io.netty.handler.stream.ChunkedWriteHandler;

public class NettyServer {
	
	private Integer port;
	
	public void run(){
		EventLoopGroup bossGroup = new NioEventLoopGroup();
		EventLoopGroup workGroup = new NioEventLoopGroup();	
		
		try {
			ServerBootstrap bootstrap = new ServerBootstrap();
			bootstrap.group(bossGroup, workGroup)
			  .channel(NioServerSocketChannel.class)
			  .childHandler(new ChannelInitializer<SocketChannel>() {
				@Override
				protected void initChannel(SocketChannel ch) throws Exception {
					ChannelPipeline  pipeLine = ch.pipeline();
					pipeLine.addLast("frameDecoder", new ProtobufVarint32FrameDecoder());
				//	pipeLine.addLast("protobufDecoder",new ProtobufDecoder());
					pipeLine.addLast("frameEncoder", new ProtobufVarint32LengthFieldPrepender());
					pipeLine.addLast("protobufEncoder", new ProtobufEncoder());
				}
			});
			ChannelFuture future = bootstrap.bind(port);
			future.channel().close().sync();
		}catch(Exception e){
			System.out.println("启动出错");
		}finally{
			bossGroup.shutdownGracefully();
			workGroup.shutdownGracefully();
		}
	}

}
