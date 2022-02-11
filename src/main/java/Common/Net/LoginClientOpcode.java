package Common.Net;

public enum LoginClientOpcode {
    LOGIN_REQ((byte)0x30),
    SERVERLIST_REQ((byte)0x32),
    GAME_REQ((byte)0x34);

    private final byte byteValue;

    private LoginClientOpcode(byte value)
    {
        byteValue = value;
    }

    public byte getValue()
    {
        return byteValue;
    }

}
