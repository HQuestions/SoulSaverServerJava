package Common.DAO;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "girldresscommodity", schema = "ghost", catalog = "")
public class GirldresscommodityEntity {
    private int id;
    private int itemId;
    private int price;
    private int bargainPrice;
    private int term;
    private int flag;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "price", nullable = false)
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Basic
    @Column(name = "bargainPrice", nullable = false)
    public int getBargainPrice() {
        return bargainPrice;
    }

    public void setBargainPrice(int bargainPrice) {
        this.bargainPrice = bargainPrice;
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
    @Column(name = "flag", nullable = false)
    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GirldresscommodityEntity that = (GirldresscommodityEntity) o;
        return id == that.id && itemId == that.itemId && price == that.price && bargainPrice == that.bargainPrice && term == that.term && flag == that.flag;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, itemId, price, bargainPrice, term, flag);
    }
}
