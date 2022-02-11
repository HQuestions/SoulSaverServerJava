package Common.DAO;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "keymaps", schema = "ghost", catalog = "")
public class KeymapsEntity {
    private int id;
    private int cid;
    private String quickslot;
    private int skillId;
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
    @Column(name = "quickslot", nullable = false, length = 8)
    public String getQuickslot() {
        return quickslot;
    }

    public void setQuickslot(String quickslot) {
        this.quickslot = quickslot;
    }

    @Basic
    @Column(name = "skillID", nullable = false)
    public int getSkillId() {
        return skillId;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
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
        KeymapsEntity that = (KeymapsEntity) o;
        return id == that.id && cid == that.cid && skillId == that.skillId && type == that.type && slot == that.slot && Objects.equals(quickslot, that.quickslot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cid, quickslot, skillId, type, slot);
    }
}
