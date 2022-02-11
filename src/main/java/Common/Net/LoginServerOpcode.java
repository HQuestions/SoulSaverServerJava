package Common.Net;

public enum LoginServerOpcode {

        // LoginServer
        LOGIN_ACK((byte)0x31),
        SERVERLIST_ACK((byte)0x33),
        GAME_ACK((byte)0x35);


        private byte byteValue;

        private LoginServerOpcode(byte value)
        {
            byteValue = value;
        }

        public byte getValue()
        {
            return byteValue;
        }

}
