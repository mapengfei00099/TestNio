package io.netty.example.time;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class TimeEncoder extends MessageToByteEncoder<UnixTime> {
	@Override
	protected void encode(ChannelHandlerContext ctx, UnixTime msg, ByteBuf out) {
		System.out.println((int) msg.value());
		out.writeInt((int) msg.value());
	}
}