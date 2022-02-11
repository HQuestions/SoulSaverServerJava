package Common.DAO;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "accounts", schema = "ghost", catalog = "")
public class AccountsEntity {
    private int id;
    private String username;
    private String password;
    private Timestamp creation;
    private int isLoggedIn;
    private int isBanned;
    private int isMaster;
    private int gamePoints;
    private int giftPoints;
    private int bonusPoints;
    private int totalDonate;
    private int vip;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 20)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 128)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "creation", nullable = false)
    public Timestamp getCreation() {
        return creation;
    }

    public void setCreation(Timestamp creation) {
        this.creation = creation;
    }

    @Basic
    @Column(name = "isLoggedIn", nullable = false)
    public int getIsLoggedIn() {
        return isLoggedIn;
    }

    public void setIsLoggedIn(int isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    @Basic
    @Column(name = "isBanned", nullable = false)
    public int getIsBanned() {
        return isBanned;
    }

    public void setIsBanned(int isBanned) {
        this.isBanned = isBanned;
    }

    @Basic
    @Column(name = "isMaster", nullable = false)
    public int getIsMaster() {
        return isMaster;
    }

    public void setIsMaster(int isMaster) {
        this.isMaster = isMaster;
    }

    @Basic
    @Column(name = "gamePoints", nullable = false)
    public int getGamePoints() {
        return gamePoints;
    }

    public void setGamePoints(int gamePoints) {
        this.gamePoints = gamePoints;
    }

    @Basic
    @Column(name = "giftPoints", nullable = false)
    public int getGiftPoints() {
        return giftPoints;
    }

    public void setGiftPoints(int giftPoints) {
        this.giftPoints = giftPoints;
    }

    @Basic
    @Column(name = "bonusPoints", nullable = false)
    public int getBonusPoints() {
        return bonusPoints;
    }

    public void setBonusPoints(int bonusPoints) {
        this.bonusPoints = bonusPoints;
    }

    @Basic
    @Column(name = "total_donate", nullable = false)
    public int getTotalDonate() {
        return totalDonate;
    }

    public void setTotalDonate(int totalDonate) {
        this.totalDonate = totalDonate;
    }

    @Basic
    @Column(name = "VIP", nullable = false)
    public int getVip() {
        return vip;
    }

    public void setVip(int vip) {
        this.vip = vip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountsEntity that = (AccountsEntity) o;
        return id == that.id && isLoggedIn == that.isLoggedIn && isBanned == that.isBanned && isMaster == that.isMaster && gamePoints == that.gamePoints && giftPoints == that.giftPoints && bonusPoints == that.bonusPoints && totalDonate == that.totalDonate && vip == that.vip && Objects.equals(username, that.username) && Objects.equals(password, that.password) && Objects.equals(creation, that.creation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, creation, isLoggedIn, isBanned, isMaster, gamePoints, giftPoints, bonusPoints, totalDonate, vip);
    }

    @Override
    public String toString() {
        return "AccountsEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", creation=" + creation +
                ", isLoggedIn=" + isLoggedIn +
                ", isBanned=" + isBanned +
                ", isMaster=" + isMaster +
                ", gamePoints=" + gamePoints +
                ", giftPoints=" + giftPoints +
                ", bonusPoints=" + bonusPoints +
                ", totalDonate=" + totalDonate +
                ", vip=" + vip +
                '}';
    }
}
