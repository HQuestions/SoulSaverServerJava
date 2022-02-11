package Common.DAO;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "drop_data", schema = "ghost", catalog = "")
public class DropDataEntity {
    private int id;
    private int mobId;
    private int itemId;
    private int minQuantity;
    private int maxQuantity;
    private int questId;
    private int chance;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "mobID", nullable = false)
    public int getMobId() {
        return mobId;
    }

    public void setMobId(int mobId) {
        this.mobId = mobId;
    }

    @Basic
    @Column(name = "itemID", nullable = false)
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "min_quantity", nullable = false)
    public int getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(int minQuantity) {
        this.minQuantity = minQuantity;
    }

    @Basic
    @Column(name = "max_quantity", nullable = false)
    public int getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(int maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    @Basic
    @Column(name = "questID", nullable = false)
    public int getQuestId() {
        return questId;
    }

    public void setQuestId(int questId) {
        this.questId = questId;
    }

    @Basic
    @Column(name = "chance", nullable = false)
    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DropDataEntity that = (DropDataEntity) o;
        return id == that.id && mobId == that.mobId && itemId == that.itemId && minQuantity == that.minQuantity && maxQuantity == that.maxQuantity && questId == that.questId && chance == that.chance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mobId, itemId, minQuantity, maxQuantity, questId, chance);
    }
}
