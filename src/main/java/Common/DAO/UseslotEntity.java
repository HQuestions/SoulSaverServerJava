package Common.DAO;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "useslot", schema = "ghost", catalog = "")
public class UseslotEntity {
    private int id;
    private int cid;
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
        UseslotEntity that = (UseslotEntity) o;
        return id == that.id && cid == that.cid && type == that.type && slot == that.slot;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cid, type, slot);
    }
}
