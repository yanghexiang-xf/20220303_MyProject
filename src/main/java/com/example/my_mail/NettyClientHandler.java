package com.example.my_mail;

import com.example.my_common.common.User;
import com.google.gson.Gson;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;

import javax.jws.soap.SOAPBinding.Use;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NettyClientHandler extends SimpleChannelInboundHandler<String> {

	//通道就绪事件
	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		System.out.println("连上服务端");
	}

	//通道读取完毕事件
	@Override
	public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
		ctx.flush();
	}

	@Override
	protected void channelRead0(ChannelHandlerContext channelHandlerContext, String message) throws Exception {
		System.out.println("收到服务端消息 ； " + message);
	}
}