package Common.DAO;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "characters", schema = "ghost", catalog = "")
public class CharactersEntity {
    private int id;
    private int accountId;
    private int worldId;
    private String name;
    private String title;
    private int gender;
    private int hair;
    private int eyes;
    private int level;
    private int classId;
    private int classLv;
    private int guild;
    private int hp;
    private int maxHp;
    private int mp;
    private int maxMp;
    private int fury;
    private int maxFury;
    private int exp;
    private int rank;
    private int money;
    private int cStr;
    private int cDex;
    private int cVit;
    private int cInt;
    private int upgradeStr;
    private int upgradeDex;
    private int upgradeVit;
    private int upgradeInt;
    private int attack;
    private int maxAttack;
    private int upgradeAttack;
    private int magic;
    private int maxMagic;
    private int upgradeMagic;
    private int avoid;
    private int defense;
    private int upgradeDefense;
    private int abilityBonus;
    private int skillBonus;
    private int jumpHeight;
    private int mapX;
    private int mapY;
    private int playerX;
    private int playerY;
    private int position;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "accountId", nullable = false)
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    @Basic
    @Column(name = "worldId", nullable = false)
    public int getWorldId() {
        return worldId;
    }

    public void setWorldId(int worldId) {
        this.worldId = worldId;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "title", nullable = false, length = 20)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "gender", nullable = false)
    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "hair", nullable = false)
    public int getHair() {
        return hair;
    }

    public void setHair(int hair) {
        this.hair = hair;
    }

    @Basic
    @Column(name = "eyes", nullable = false)
    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    @Basic
    @Column(name = "level", nullable = false)
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Basic
    @Column(name = "classId", nullable = false)
    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    @Basic
    @Column(name = "classLv", nullable = false)
    public int getClassLv() {
        return classLv;
    }

    public void setClassLv(int classLv) {
        this.classLv = classLv;
    }

    @Basic
    @Column(name = "guild", nullable = false)
    public int getGuild() {
        return guild;
    }

    public void setGuild(int guild) {
        this.guild = guild;
    }

    @Basic
    @Column(name = "hp", nullable = false)
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Basic
    @Column(name = "maxHp", nullable = false)
    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    @Basic
    @Column(name = "mp", nullable = false)
    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    @Basic
    @Column(name = "maxMp", nullable = false)
    public int getMaxMp() {
        return maxMp;
    }

    public void setMaxMp(int maxMp) {
        this.maxMp = maxMp;
    }

    @Basic
    @Column(name = "fury", nullable = false)
    public int getFury() {
        return fury;
    }

    public void setFury(int fury) {
        this.fury = fury;
    }

    @Basic
    @Column(name = "maxFury", nullable = false)
    public int getMaxFury() {
        return maxFury;
    }

    public void setMaxFury(int maxFury) {
        this.maxFury = maxFury;
    }

    @Basic
    @Column(name = "exp", nullable = false)
    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Basic
    @Column(name = "rank", nullable = false)
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Basic
    @Column(name = "money", nullable = false)
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Basic
    @Column(name = "c_str", nullable = false)
    public int getcStr() {
        return cStr;
    }

    public void setcStr(int cStr) {
        this.cStr = cStr;
    }

    @Basic
    @Column(name = "c_dex", nullable = false)
    public int getcDex() {
        return cDex;
    }

    public void setcDex(int cDex) {
        this.cDex = cDex;
    }

    @Basic
    @Column(name = "c_vit", nullable = false)
    public int getcVit() {
        return cVit;
    }

    public void setcVit(int cVit) {
        this.cVit = cVit;
    }

    @Basic
    @Column(name = "c_int", nullable = false)
    public int getcInt() {
        return cInt;
    }

    public void setcInt(int cInt) {
        this.cInt = cInt;
    }

    @Basic
    @Column(name = "upgradeStr", nullable = false)
    public int getUpgradeStr() {
        return upgradeStr;
    }

    public void setUpgradeStr(int upgradeStr) {
        this.upgradeStr = upgradeStr;
    }

    @Basic
    @Column(name = "upgradeDex", nullable = false)
    public int getUpgradeDex() {
        return upgradeDex;
    }

    public void setUpgradeDex(int upgradeDex) {
        this.upgradeDex = upgradeDex;
    }

    @Basic
    @Column(name = "upgradeVit", nullable = false)
    public int getUpgradeVit() {
        return upgradeVit;
    }

    public void setUpgradeVit(int upgradeVit) {
        this.upgradeVit = upgradeVit;
    }

    @Basic
    @Column(name = "upgradeInt", nullable = false)
    public int getUpgradeInt() {
        return upgradeInt;
    }

    public void setUpgradeInt(int upgradeInt) {
        this.upgradeInt = upgradeInt;
    }

    @Basic
    @Column(name = "attack", nullable = false)
    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Basic
    @Column(name = "maxAttack", nullable = false)
    public int getMaxAttack() {
        return maxAttack;
    }

    public void setMaxAttack(int maxAttack) {
        this.maxAttack = maxAttack;
    }

    @Basic
    @Column(name = "upgradeAttack", nullable = false)
    public int getUpgradeAttack() {
        return upgradeAttack;
    }

    public void setUpgradeAttack(int upgradeAttack) {
        this.upgradeAttack = upgradeAttack;
    }

    @Basic
    @Column(name = "magic", nullable = false)
    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    @Basic
    @Column(name = "maxMagic", nullable = false)
    public int getMaxMagic() {
        return maxMagic;
    }

    public void setMaxMagic(int maxMagic) {
        this.maxMagic = maxMagic;
    }

    @Basic
    @Column(name = "upgradeMagic", nullable = false)
    public int getUpgradeMagic() {
        return upgradeMagic;
    }

    public void setUpgradeMagic(int upgradeMagic) {
        this.upgradeMagic = upgradeMagic;
    }

    @Basic
    @Column(name = "avoid", nullable = false)
    public int getAvoid() {
        return avoid;
    }

    public void setAvoid(int avoid) {
        this.avoid = avoid;
    }

    @Basic
    @Column(name = "defense", nullable = false)
    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Basic
    @Column(name = "upgradeDefense", nullable = false)
    public int getUpgradeDefense() {
        return upgradeDefense;
    }

    public void setUpgradeDefense(int upgradeDefense) {
        this.upgradeDefense = upgradeDefense;
    }

    @Basic
    @Column(name = "abilityBonus", nullable = false)
    public int getAbilityBonus() {
        return abilityBonus;
    }

    public void setAbilityBonus(int abilityBonus) {
        this.abilityBonus = abilityBonus;
    }

    @Basic
    @Column(name = "skillBonus", nullable = false)
    public int getSkillBonus() {
        return skillBonus;
    }

    public void setSkillBonus(int skillBonus) {
        this.skillBonus = skillBonus;
    }

    @Basic
    @Column(name = "jumpHeight", nullable = false)
    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    @Basic
    @Column(name = "mapX", nullable = false)
    public int getMapX() {
        return mapX;
    }

    public void setMapX(int mapX) {
        this.mapX = mapX;
    }

    @Basic
    @Column(name = "mapY", nullable = false)
    public int getMapY() {
        return mapY;
    }

    public void setMapY(int mapY) {
        this.mapY = mapY;
    }

    @Basic
    @Column(name = "playerX", nullable = false)
    public int getPlayerX() {
        return playerX;
    }

    public void setPlayerX(int playerX) {
        this.playerX = playerX;
    }

    @Basic
    @Column(name = "playerY", nullable = false)
    public int getPlayerY() {
        return playerY;
    }

    public void setPlayerY(int playerY) {
        this.playerY = playerY;
    }

    @Basic
    @Column(name = "position", nullable = false)
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CharactersEntity that = (CharactersEntity) o;
        return id == that.id && accountId == that.accountId && worldId == that.worldId && gender == that.gender && hair == that.hair && eyes == that.eyes && level == that.level && classId == that.classId && classLv == that.classLv && guild == that.guild && hp == that.hp && maxHp == that.maxHp && mp == that.mp && maxMp == that.maxMp && fury == that.fury && maxFury == that.maxFury && exp == that.exp && rank == that.rank && money == that.money && cStr == that.cStr && cDex == that.cDex && cVit == that.cVit && cInt == that.cInt && upgradeStr == that.upgradeStr && upgradeDex == that.upgradeDex && upgradeVit == that.upgradeVit && upgradeInt == that.upgradeInt && attack == that.attack && maxAttack == that.maxAttack && upgradeAttack == that.upgradeAttack && magic == that.magic && maxMagic == that.maxMagic && upgradeMagic == that.upgradeMagic && avoid == that.avoid && defense == that.defense && upgradeDefense == that.upgradeDefense && abilityBonus == that.abilityBonus && skillBonus == that.skillBonus && jumpHeight == that.jumpHeight && mapX == that.mapX && mapY == that.mapY && playerX == that.playerX && playerY == that.playerY && position == that.position && Objects.equals(name, that.name) && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountId, worldId, name, title, gender, hair, eyes, level, classId, classLv, guild, hp, maxHp, mp, maxMp, fury, maxFury, exp, rank, money, cStr, cDex, cVit, cInt, upgradeStr, upgradeDex, upgradeVit, upgradeInt, attack, maxAttack, upgradeAttack, magic, maxMagic, upgradeMagic, avoid, defense, upgradeDefense, abilityBonus, skillBonus, jumpHeight, mapX, mapY, playerX, playerY, position);
    }
}
