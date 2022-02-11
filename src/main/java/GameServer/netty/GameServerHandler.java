package GameServer.netty;

import Common.Exception.UnknownPacketException;
import Common.Net.ClientOpcode;
import Common.Net.LoginClientOpcode;
import Common.Packet.InPacket;
import Common.Packet.OutPacket;
import LoginServer.Net.LoginHandler;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;


public class GameServerHandler extends SimpleChannelInboundHandler<ByteBuf> {

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, ByteBuf in) throws Exception {
        int OperationCode = in.readUnsignedShortLE();
        in.readerIndex(in.readerIndex() + 2);
        byte Header = in.readByte();
        byte[] body = new byte[in.readableBytes()];
        in.readBytes(body);
        System.out.print("GameServerPacket: ");
        for (byte value : body) {
            System.out.print(value + " ");
        }
        System.out.println();

        InPacket inPacket = new InPacket(OperationCode, Header, body);
        OutPacket outPacket = this.Dispatch(inPacket);
        channelHandlerContext.writeAndFlush(outPacket.getResponseBytebuf());
    }

    private OutPacket Dispatch(InPacket inPacket) {

        return null;
    }

}
