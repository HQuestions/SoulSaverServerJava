package LoginServer.Net;

import Common.Packet.OutPacket;
import io.netty.buffer.ByteBuf;

import static io.netty.buffer.Unpooled.buffer;
import static io.netty.buffer.Unpooled.wrappedBuffer;


public class OutPacketLoginServer extends OutPacket {
    @Override
    public ByteBuf getResponseBytebuf() {
        byte[] packet = byteBuf.array();

        byte[] ret = new byte[packet.length+2];
        ret = new byte[packet.length+6];
        byte[] header = new byte[]{(byte) 0xAA, 0x55, (byte)(packet.length & 0xFF), (byte)((packet.length >> 8) & 0xFF)};
        System.arraycopy(header,0,ret,0,4);
        System.arraycopy(packet,0,ret,4,packet.length);
        byte[] temp = new byte[]{(byte) 0x55,(byte) 0xAA};
        System.arraycopy(temp,0,ret,packet.length+4,2);



        return wrappedBuffer(ret);
    }
}
