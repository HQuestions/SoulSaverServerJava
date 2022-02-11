package LoginServer.Net;

import Common.DAO.AccountsEntity;
import Common.DB.DBConnection;
import Common.Net.LoginServerOpcode;
import Common.Packet.InPacket;
import Common.Packet.OutPacket;
import Common.Security.PasswordEncrypt;



public class LoginHandler {
    //TODO 從外部設定文件讀取
    public static OutPacket Login_Req(InPacket inPacket) {
        String username = inPacket.ReadString();
        String password = inPacket.ReadString();
        short encryptKey = inPacket.ReadByte();
        inPacket.ResetPosition();
        AccountsEntity accountsEntity = DBConnection.DBGetUsername(username);
        PasswordEncrypt pe = new PasswordEncrypt(encryptKey);
        if (accountsEntity == null) {
            OutPacket op = new OutPacketLoginServer();
            op.WriteByte(LoginServerOpcode.LOGIN_ACK.getValue());
            op.WriteByte((byte) LoginState.NO_USERNAME);
            op.WriteByte((byte) 0);
            op.WriteShortLE(encryptKey);
            return op;
        }

        if (!password.equals(pe.encrypt(accountsEntity.getPassword()))) {
            OutPacket op = new OutPacketLoginServer();
            op.WriteByte(LoginServerOpcode.LOGIN_ACK.getValue());
            op.WriteByte((byte) LoginState.PASSWORD_ERROR);
            op.WriteByte((byte) accountsEntity.getIsMaster());
            op.WriteShortLE(encryptKey);
            return op;
        } else if (accountsEntity.getIsBanned() == 1) {
            OutPacket op = new OutPacketLoginServer();
            op.WriteByte(LoginServerOpcode.LOGIN_ACK.getValue());
            op.WriteByte((byte) LoginState.USER_LOCK);
            op.WriteByte((byte) accountsEntity.getIsMaster());
            op.WriteShortLE(encryptKey);
            return op;
        } else {
            OutPacket op = new OutPacketLoginServer();
            op.WriteByte(LoginServerOpcode.LOGIN_ACK.getValue());
            op.WriteByte((byte) LoginState.OK);
            op.WriteByte((byte) accountsEntity.getIsMaster());
            op.WriteShortLE(encryptKey);
            accountsEntity.setIsLoggedIn(1);
            DBConnection.DBSetUserData(accountsEntity);
            return op;
        }
    }

    public static OutPacket ServerList_Req() {
        OutPacket op = new OutPacketLoginServer();
        op.WriteByte(LoginServerOpcode.SERVERLIST_ACK.getValue());
        for (int i = 0; i < 13; i++) {
            op.WriteByte(0xFF);
        }
        op.WriteIntLE(1);
        op.WriteShortLE(0);
        op.WriteIntLE(7);
        for (int i = 0; i < 18; i++) {
            op.WriteShortLE(i + 1);
            op.WriteShortLE(i + 1);
            op.WriteString("127.0.0.1");
            op.WriteIntLE(14101 + i);
            op.WriteIntLE(0); // 玩家數量
            op.WriteIntLE(200); // 頻道人數上限
            op.WriteIntLE(12); // 標章類型
            op.WriteIntLE(0);
            op.WriteByte(1);
            op.WriteIntLE(14199);
        }
        return op;
    }

    public static OutPacket Game_Req(){
        OutPacket op = new OutPacketLoginServer();
        op.WriteByte(LoginServerOpcode.GAME_ACK.getValue());
        op.WriteByte(0);
        op.WriteString("127.0.0.1");
        op.WriteIntLE(14101 + 0);
        op.WriteIntLE(14199);
        return op;
    }
}