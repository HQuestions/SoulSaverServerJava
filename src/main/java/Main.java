import CharacterServer.netty.CharServer;
import Common.DB.DBConnection;
import Common.Security.PasswordEncrypt;
import GameServer.Ghost.Provider.ItemFactory;
import GameServer.netty.GameServer;
import GameServer.netty.GameServerUDP;
import LoginServer.netty.LoginServer;

public class Main {


    public static void main(final String[] args) throws Exception {
        DBConnection.getSession();
        ItemFactory.Initialize();
        System.out.println("啟動登入伺服器");
        new LoginServer().run();
        System.out.println("啟動角色伺服器");
        new CharServer().run();
        System.out.println("啟動UDP伺服器");
        new GameServerUDP().run();
        System.out.println("啟動遊戲伺服器");
        new GameServer().run();
    }
}