package Common.DAO;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "items", schema = "ghost", catalog = "")
public class ItemsEntity {
    private int id;
    private int cid;
    private int itemId;
    private int quantity;
    private int spirit;
    private int level1;
    private int level2;
    private int level3;
    private int level4;
    private int level5;
    private int level6;
    private int level7;
    private int level8;
    private int level9;
    private int level10;
    private int fusion;
    private int isLocked;
    private int icon;
    private int term;
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
    @Column(name = "quantity", nullable = false)
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "spirit", nullable = false)
    public int getSpirit() {
        return spirit;
    }

    public void setSpirit(int spirit) {
        this.spirit = spirit;
    }

    @Basic
    @Column(name = "level1", nullable = false)
    public int getLevel1() {
        return level1;
    }

    public void setLevel1(int level1) {
        this.level1 = level1;
    }

    @Basic
    @Column(name = "level2", nullable = false)
    public int getLevel2() {
        return level2;
    }

    public void setLevel2(int level2) {
        this.level2 = level2;
    }

    @Basic
    @Column(name = "level3", nullable = false)
    public int getLevel3() {
        return level3;
    }

    public void setLevel3(int level3) {
        this.level3 = level3;
    }

    @Basic
    @Column(name = "level4", nullable = false)
    public int getLevel4() {
        return level4;
    }

    public void setLevel4(int level4) {
        this.level4 = level4;
    }

    @Basic
    @Column(name = "level5", nullable = false)
    public int getLevel5() {
        return level5;
    }

    public void setLevel5(int level5) {
        this.level5 = level5;
    }

    @Basic
    @Column(name = "level6", nullable = false)
    public int getLevel6() {
        return level6;
    }

    public void setLevel6(int level6) {
        this.level6 = level6;
    }

    @Basic
    @Column(name = "level7", nullable = false)
    public int getLevel7() {
        return level7;
    }

    public void setLevel7(int level7) {
        this.level7 = level7;
    }

    @Basic
    @Column(name = "level8", nullable = false)
    public int getLevel8() {
        return level8;
    }

    public void setLevel8(int level8) {
        this.level8 = level8;
    }

    @Basic
    @Column(name = "level9", nullable = false)
    public int getLevel9() {
        return level9;
    }

    public void setLevel9(int level9) {
        this.level9 = level9;
    }

    @Basic
    @Column(name = "level10", nullable = false)
    public int getLevel10() {
        return level10;
    }

    public void setLevel10(int level10) {
        this.level10 = level10;
    }

    @Basic
    @Column(name = "fusion", nullable = false)
    public int getFusion() {
        return fusion;
    }

    public void setFusion(int fusion) {
        this.fusion = fusion;
    }

    @Basic
    @Column(name = "isLocked", nullable = false)
    public int getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(int isLocked) {
        this.isLocked = isLocked;
    }

    @Basic
    @Column(name = "icon", nullable = false)
    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    @Basic
    @Column(name = "term", nullable = false)
    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
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
        ItemsEntity that = (ItemsEntity) o;
        return id == that.id && cid == that.cid && itemId == that.itemId && quantity == that.quantity && spirit == that.spirit && level1 == that.level1 && level2 == that.level2 && level3 == that.level3 && level4 == that.level4 && level5 == that.level5 && level6 == that.level6 && level7 == that.level7 && level8 == that.level8 && level9 == that.level9 && level10 == that.level10 && fusion == that.fusion && isLocked == that.isLocked && icon == that.icon && term == that.term && type == that.type && slot == that.slot;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cid, itemId, quantity, spirit, level1, level2, level3, level4, level5, level6, level7, level8, level9, level10, fusion, isLocked, icon, term, type, slot);
    }
}
