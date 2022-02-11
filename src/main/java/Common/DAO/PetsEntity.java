package Common.DAO;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pets", schema = "ghost", catalog = "")
public class PetsEntity {
    private int id;
    private int cid;
    private int itemId;
    private int decorateId;
    private String name;
    private int level;
    private int hp;
    private int mp;
    private int exp;
    private int type;
    private int slot;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cid", nullable = false)
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Basic
    @Column(name = "itemId", nullable = false)
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "decorateId", nullable = false)
    public int getDecorateId() {
        return decorateId;
    }

    public void setDecorateId(int decorateId) {
        this.decorateId = decorateId;
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
    @Column(name = "level", nullable = false)
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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
    @Column(name = "mp", nullable = false)
    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
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
    @Column(name = "type", nullable = false)
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(name = "slot", nullable = false)
    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PetsEntity that = (PetsEntity) o;
        return id == that.id && cid == that.cid && itemId == that.itemId && decorateId == that.decorateId && level == that.level && hp == that.hp && mp == that.mp && exp == that.exp && type == that.type && slot == that.slot && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cid, itemId, decorateId, name, level, hp, mp, exp, type, slot);
    }
}
