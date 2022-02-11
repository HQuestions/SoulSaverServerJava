package CharacterServer.Net;

import Common.Packet.OutPacket;
import io.netty.buffer.ByteBuf;

import static io.netty.buffer.Unpooled.wrappedBuffer;

public class OutPacketCharServer extends OutPacket {
    @Override
    public ByteBuf getResponseBytebuf() {
        byte[] packet = byteBuf.array();
        byte[] ret = new byte[packet.length + 2];
        int a = 0x4D;
        int b = (packet[0]) + (packet[1] << 8);
        int c = ret.length;
        int crc = a + b + c;
        byte[] header = new byte[]{0x4D, 0x00,
                packet[0], packet[1],
                (byte) (ret.length & 0xFF), (byte) ((ret.length >> 8) & 0xFF),
                (byte) (crc & 0xFF), (byte) ((crc >> 8) & 0xFF)
        };
        System.arraycopy(header, 0, ret, 0, 8); // copy header to ret
        System.arraycopy(packet, 6, ret, 8, packet.length - 6); // copy packet to ret

        return wrappedBuffer(ret);
    }
}
