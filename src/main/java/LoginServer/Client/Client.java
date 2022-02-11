package LoginServer.Client;


import Common.DAO.AccountsEntity;

public class Client
{
    private byte WorldID ;
    private byte GameID ;
    private AccountsEntity account;
    private long SessionID;
    private int RetryLoginCount ;

    public Client() {
    }

    public Client(byte worldID, byte gameID, AccountsEntity account, long sessionID, int retryLoginCount) {
        WorldID = worldID;
        GameID = gameID;
        this.account = account;
        SessionID = sessionID;
        RetryLoginCount = retryLoginCount;
    }

    public byte getWorldID() {
        return WorldID;
    }

    public void setWorldID(byte worldID) {
        WorldID = worldID;
    }

    public byte getGameID() {
        return GameID;
    }

    public void setGameID(byte gameID) {
        GameID = gameID;
    }

    public AccountsEntity getAccount() {
        return account;
    }

    public void setAccount(AccountsEntity account) {
        this.account = account;
    }

    public long getSessionID() {
        return SessionID;
    }

    public void setSessionID(long sessionID) {
        SessionID = sessionID;
    }

    public int getRetryLoginCount() {
        return RetryLoginCount;
    }

    public void setRetryLoginCount(int retryLoginCount) {
        RetryLoginCount = retryLoginCount;
    }

    @Override
    public String toString() {
        return "Client{" +
                "WorldID=" + WorldID +
                ", GameID=" + GameID +
                ", account=" + account +
                ", SessionID=" + SessionID +
                ", RetryLoginCount=" + RetryLoginCount +
                '}';
    }
}