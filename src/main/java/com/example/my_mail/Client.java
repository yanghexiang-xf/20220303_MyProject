package com.example.my_mail;
import com.example.my_common.common.User;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.serialization.ClassResolvers;
import io.netty.handler.codec.serialization.ObjectDecoder;
import io.netty.handler.codec.serialization.ObjectEncoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.util.CharsetUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import sun.misc.Cleaner;

import java.util.Date;
import java.util.Scanner;

@Component
public class Client {
	private final int port;
	private final String host;
	Channel channel;
	public Client() {
		this.host = "127.0.0.1";
		this.port = 8888;
	}


	public void run() {
		EventLoopGroup group = null;
		try {
			//创建一个线程组来
			group = new NioEventLoopGroup();

			//创建客户端启动助手
			Bootstrap bootstrap = new Bootstrap();
			bootstrap.group(group)   //将线程组放入启动助手里面
				.channel(NioSocketChannel.class)  //指定通道
				.handler(new ChannelInitializer<SocketChannel>() {
					@Override
					protected void initChannel(SocketChannel socketChannel) throws Exception {
					    socketChannel.pipeline().addLast("decoder", new StringDecoder());
						socketChannel.pipeline().addLast("encoder", new StringEncoder());
						socketChannel.pipeline().addLast(new NettyClientHandler());
					}
				});
			ChannelFuture sync = bootstrap.connect(host, port).sync();
			this.channel = sync.channel();
			sync.channel().closeFuture().sync();

		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			group.shutdownGracefully();
		}
	}

	public void sendMessage(String message) {
		channel.writeAndFlush(message);
		System.out.println("发送消息成功" + message);
	}

	public Channel getChannel() {return this.channel;}
}