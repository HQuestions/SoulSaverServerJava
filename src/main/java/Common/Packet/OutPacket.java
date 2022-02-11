package Common.Packet;

import Common.JOOU.UInteger;
import Common.JOOU.UShort;
import io.netty.buffer.ByteBuf;

import java.io.UnsupportedEncodingException;

import static io.netty.buffer.Unpooled.buffer;
import static io.netty.buffer.Unpooled.wrappedBuffer;


public abstract class OutPacket {
    protected ByteBuf byteBuf;


    public OutPacket() {
        this.byteBuf=buffer(5);
    }



    public abstract ByteBuf getResponseBytebuf();


    public void WriteShortLE(int value){
        byteBuf.writeShortLE((short)value);
    }
    public void WriteByte(int value){
        byteBuf.writeByte((byte)value);
    }
    public void WriteBytes(byte[] value){
        byteBuf.writeBytes(value);
    }
    public void WriteIntLE(int value){
        byteBuf.writeIntLE(value);
    }

    public void WriteUInt(UInteger value){
        byteBuf.writeInt(value.intValue());
    }
    public byte[] getByteArray(){
        return byteBuf.array();
    }
    public void WriteUShortLE(UShort value){
        byteBuf.writeShortLE(value.intValue());
    }
    public void WriteString(String value) {

        byte[] stringArray = new byte[0];
        try {
            stringArray = value.getBytes("BIG5");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.WriteShortLE(stringArray.length);
        for (int i = 0; i < stringArray.length; i++) {
            this.WriteByte(stringArray[i]);
        }
    }
    public void WriteString(String value,int length) {

        byte[] stringArray = new byte[0];
        try {
            stringArray = value.getBytes("BIG5");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < length; i++) {
            if(i<stringArray.length){
                this.WriteByte(stringArray[i]);
            }else {
                this.WriteByte(0);
            }
        }
    }
}
