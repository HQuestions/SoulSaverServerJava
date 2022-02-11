package Common.Packet;

public class InPacket {
    private int OperationCode;
    private short Header;
    private byte[] PacketBody;
    private int Position = 0;

    public InPacket() {
    }

    public InPacket(int operationCode, short header, byte[] packetBody) {
        OperationCode = operationCode;
        Header = header;
        PacketBody = packetBody;
    }

    public int getOperationCode() {
        return OperationCode;
    }

    public void setOperationCode(int operationCode) {
        OperationCode = operationCode;
    }

    public short getHeader() {
        return Header;
    }

    public void setHeader(byte header) {
        Header = header;
    }

    public byte[] getPacketBody() {
        return PacketBody;
    }

    public void setPacketBody(byte[] packetBody) {
        PacketBody = packetBody;
    }

    public String ReadString(){
        StringBuffer sb = new StringBuffer();
        for (int i = 2; i < (this.PacketBody[Position])+2; i++) {
            sb.append((char) this.PacketBody[Position+i]);
            if(this.PacketBody[Position]+1==i){
                this.Position=i+1;
                break;
            }
        }
        return sb.toString();
    }
    public short ReadByte(){
        StringBuffer sb = new StringBuffer();
        sb.append("0x");
        int temp = 5;
        while (temp<7){
            sb.append(String.format("%02X", PacketBody[PacketBody.length-temp]));
            temp++;
        }

        return Short.decode(sb.toString());
    }
    public void ResetPosition(){
        this.Position = 0;
    }
}
