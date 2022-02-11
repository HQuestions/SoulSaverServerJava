package LoginServer.netty;

import Common.Exception.UnknownPacketException;
import Common.Net.ClientOpcode;
import Common.Net.LoginClientOpcode;
import Common.Packet.InPacket;
import Common.Packet.OutPacket;
import LoginServer.Net.LoginHandler;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;


public class LoginServerHandler extends SimpleChannelInboundHandler<ByteBuf> {

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, ByteBuf in) throws Exception {
        int OperationCode = in.readUnsignedShortLE();
        in.readerIndex(in.readerIndex() + 2);
        byte Header = in.readByte();
        byte[] body = new byte[in.readableBytes()];
        in.readBytes(body);
        for (byte value : body) {
            System.out.print(value + " ");
        }

        InPacket inPacket = new InPacket(OperationCode, Header, body);
        OutPacket outPacket = this.Dispatch(inPacket);
        channelHandlerContext.writeAndFlush(outPacket.getResponseBytebuf());
    }

    private OutPacket Dispatch(InPacket inPacket) {
        if (inPacket.getOperationCode() == ClientOpcode.LOGIN_SERVER.getValue()) {
            if (inPacket.getHeader() == LoginClientOpcode.LOGIN_REQ.getValue()) {
                return LoginHandler.Login_Req(inPacket);
            } else if (inPacket.getHeader() == LoginClientOpcode.SERVERLIST_REQ.getValue()) {
                return LoginHandler.ServerList_Req();
            } else if (inPacket.getHeader() == LoginClientOpcode.GAME_REQ.getValue()) {
                return LoginHandler.Game_Req();
            } else {
                throw new UnknownPacketException("Unknown Header");
            }

        } else {
            throw new UnknownPacketException("Unknown OperationCode");
        }
    }

}
