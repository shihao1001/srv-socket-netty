package com.sh.yhby.server.main;



import java.util.Collection;

import com.sh.yhby.protobuf.ActionProbuf;
import com.sh.yhby.server.cache.CometCache;
import com.sh.yhby.server.domain.UserChannel;
import com.sh.yhby.server.netty.handler.ServerHandler;
import com.sh.yhby.server.task.CometChecker;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;

public class NettyServer {
	
	private Integer port = 9000;
	
	public NettyServer(){}
	
	public NettyServer(Integer port) {
		this.port = port;
	}

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
					pipeLine.addLast("protobufDecoder",new ProtobufDecoder(ActionProbuf.Action.getDefaultInstance()));
					pipeLine.addLast("frameEncoder", new ProtobufVarint32LengthFieldPrepender());
					pipeLine.addLast("protobufEncoder", new ProtobufEncoder());
					pipeLine.addLast("serverHandler", new ServerHandler());
				}
			});
			ChannelFuture future = bootstrap.bind(port).sync();
			if(future.isSuccess()){
				System.out.println("netty服务端启动完成！");
			}
			future.channel().closeFuture().sync();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("启动出错");
		}finally{
			bossGroup.shutdownGracefully();
			workGroup.shutdownGracefully();
		}
		
	}
	
	public static void main(String[] args) {
		new Thread(new Runnable(){
			public void run() {
				while(true){
					Collection<UserChannel> list = CometCache.getAllConnect();
					System.out.println("当前所有连接");
					for(UserChannel userChannel  : list){
						System.out.println(userChannel.getUserId());
					}
					try {
						Thread.sleep(10*1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}	
			}
		}).start();
		
	/*	new Thread(new Runnable(){
			public void run() {
				while(true){
					Collection<UserChannel> connects = CometCache.getAllConnect();
					if(connects != null && connects.size() > 0){
						for(UserChannel connect : connects ){
							System.out.println("遍历connects");
							long now = System.currentTimeMillis();
							long lastHeartbeatTime = connect.getLastHeatbeatTime();
							if(now - lastHeartbeatTime > 2*60*1000){
								System.out.println("更新时间较远，删除channel");
								CometCache.removeConnect(connect.getUserId());
								if(connect.getChannel().isActive()){
									connect.getChannel().close();
								}
							}
						}
					}	
					try {
						Thread.sleep(10*1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}		
			}		
		}).start();*/
		
		CometChecker.startCheck();
		
		NettyServer server = new NettyServer(9000);
		server.run();
	}

	
}
