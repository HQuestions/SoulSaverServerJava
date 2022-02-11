package CharacterServer.netty;

import CharacterServer.Net.CharHandler;
import Common.Packet.InPacket;
import Common.Packet.OutPacket;
import Common.Exception.UnknownPacketException;
import Common.Net.ClientOpcode;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
//import org.apache.commons.codec.binary.Hex;


public class CharServerHandler extends SimpleChannelInboundHandler<ByteBuf> {

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, ByteBuf in) throws Exception {
        int OperationCode = in.readUnsignedShortLE();
        short Header = in.readShortLE();
        in.readIntLE();
        in.readIntLE();
        byte[] body = new byte[in.readableBytes()];
        in.readBytes(body);
//        for (byte value : body) {
//            System.out.print(value + " ");
//        }

        InPacket inPacket = new InPacket(OperationCode, Header, body);
        OutPacket outPacket = this.Dispatch(inPacket);
        channelHandlerContext.writeAndFlush(outPacket.getResponseBytebuf());
    }

    //TODO 角色增刪
    private OutPacket Dispatch(InPacket inPacket) {
        if (inPacket.getOperationCode() == ClientOpcode.SERVER.getValue()) {
            if (inPacket.getHeader() == ClientOpcode.MYCHAR_INFO_REQ.getValue()) {
                return CharHandler.MyChar_Info_Req(inPacket);
            }
            else {
                throw new UnknownPacketException("Unknown Header");
            }

        } else {
            throw new UnknownPacketException("Unknown OperationCode");
        }
    }

}
