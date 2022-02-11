package Common.DAO;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "quests", schema = "ghost", catalog = "")
public class QuestsEntity {
    private int id;
    private int cid;
    private int questId;
    private int stage;
    private int completeMonster;
    private int requireMonster;
    private int questState;

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
    @Column(name = "questId", nullable = false)
    public int getQuestId() {
        return questId;
    }

    public void setQuestId(int questId) {
        this.questId = questId;
    }

    @Basic
    @Column(name = "stage", nullable = false)
    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    @Basic
    @Column(name = "completeMonster", nullable = false)
    public int getCompleteMonster() {
        return completeMonster;
    }

    public void setCompleteMonster(int completeMonster) {
        this.completeMonster = completeMonster;
    }

    @Basic
    @Column(name = "requireMonster", nullable = false)
    public int getRequireMonster() {
        return requireMonster;
    }

    public void setRequireMonster(int requireMonster) {
        this.requireMonster = requireMonster;
    }

    @Basic
    @Column(name = "questState", nullable = false)
    public int getQuestState() {
        return questState;
    }

    public void setQuestState(int questState) {
        this.questState = questState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestsEntity that = (QuestsEntity) o;
        return id == that.id && cid == that.cid && questId == that.questId && stage == that.stage && completeMonster == that.completeMonster && requireMonster == that.requireMonster && questState == that.questState;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cid, questId, stage, completeMonster, requireMonster, questState);
    }
}
