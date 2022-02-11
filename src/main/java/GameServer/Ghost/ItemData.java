package GameServer.Ghost;

public class ItemData {
    private int ItemID;
    private String ItemName;
    private byte Job;
    private byte Level;
    private short Str = -1;
    private short Dex = -1;
    private short Vit = -1;
    private short Int = -1;
    private short Attack = -1;
    private short Magic = -1;
    private short Avoid = -1;
    private short Defense = -1;
    private short Hp = -1;
    private short Mp = -1;
    private short AttackRange = -1;
    private byte Speed;
    private byte Refining;
    private byte Fusion;
    private int Type = -1;
    private int Recover = -1;
    private int Spirit = -1;
    private int Price;

    // 消耗品
    public ItemData(int ItemID, String ItemName, int Type, int Recover, int Price) {
        this.ItemID = ItemID;
        this.ItemName = ItemName;
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: this.Job = 0xFF;
        this.Job = (byte) 0xFF;
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: this.Level = 0xFF;
        this.Level = (byte) 0xFF;
        this.Attack = -1;
        this.AttackRange = -1;
        this.Defense = -1;
        this.Speed = 0;
        this.Type = Type;
        this.Recover = Recover;
        this.Price = Price;
    }

    // 其他裝備
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: public ItemData(int ItemID, string ItemName, byte Job, byte Level, short Defense, int Price)
    public ItemData(int ItemID, String ItemName, byte Job, byte Level, short Defense, int Price) {
        this.ItemID = ItemID;
        this.ItemName = ItemName;
        this.Job = Job;
        this.Level = Level;
        this.Attack = -1;
        this.AttackRange = -1;
        this.Defense = Defense;
        this.Speed = 0;
        this.Hp = -1;
        this.Mp = -1;
        this.Price = Price;
    }

    // 武器
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: public ItemData(int ItemID, string ItemName, byte Job, byte Level, short Attack, short MagicAttack, short AttackRange, byte Speed, int Price, byte Fusion)
    public ItemData(int ItemID, String ItemName, byte Job, byte Level, short Attack, short MagicAttack, short AttackRange, byte Speed, int Price, byte Fusion) {
        this.ItemID = ItemID;
        this.ItemName = ItemName;
        this.Job = Job;
        this.Level = Level;
        this.Attack = Attack;
        this.Magic = MagicAttack;
        this.AttackRange = AttackRange;
        this.Defense = -1;
        this.Speed = Speed;
        this.Hp = -1;
        this.Mp = -1;
        this.Price = Price;
        this.Fusion = Fusion;
    }

    // 衣服
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: public ItemData(int ItemID, string ItemName, byte Job, byte Level, short Defense, int Price, byte Fusion)
    public ItemData(int ItemID, String ItemName, byte Job, byte Level, short Defense, int Price, byte Fusion) {
        this.ItemID = ItemID;
        this.ItemName = ItemName;
        this.Job = Job;
        this.Level = Level;
        this.Attack = -1;
        this.AttackRange = -1;
        this.Defense = Defense;
        this.Speed = 0;
        this.Hp = -1;
        this.Mp = -1;
        this.Price = Price;
        this.Fusion = Fusion;
    }

    // 服裝
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: public ItemData(int ItemID, string ItemName, byte Job, byte Level, short Defense, short Str, short Dex, short Vit, short Int, int Price, byte Fusion)
    public ItemData(int ItemID, String ItemName, byte Job, byte Level, short Defense, short Str, short Dex, short Vit, short Int, int Price, byte Fusion) {
        this.ItemID = ItemID;
        this.ItemName = ItemName;
        this.Job = Job;
        this.Level = Level;
        this.Defense = Defense;
        this.Str = Str;
        this.Dex = Dex;
        this.Vit = Vit;
        this.Int = Int;
        this.Price = Price;
        this.Fusion = Fusion;
    }

    // 帽子
    public ItemData(int ItemID, String ItemName, short Str, short Dex, short Vit, short Int, short Hp, short Mp, int Price) {
        this.ItemID = ItemID;
        this.ItemName = ItemName;
        this.Str = Str;
        this.Dex = Dex;
        this.Vit = Vit;
        this.Int = Int;
        this.Hp = Hp;
        this.Mp = Mp;
        this.Price = Price;
    }

    // 戒指
    public ItemData(int ItemID, String ItemName, byte Job, byte Level, short Str, short Dex, short Vit, short Int, short MagicAttack, short Avoid, short Attack, short Defense, short Hp, short Mp, byte Refining, int Price) {
        this.ItemID = ItemID;
        this.ItemName = ItemName;
        this.Job = Job;
        this.Level = Level;
        this.Str = Str;
        this.Dex = Dex;
        this.Vit = Vit;
        this.Int = Int;
        this.Magic = MagicAttack;
        this.Avoid = Avoid;
        this.Attack = Attack;
        this.AttackRange = -1;
        this.Defense = Defense;
        this.Speed = 0;
        this.Hp = Hp;
        this.Mp = Mp;
        this.Refining = Refining;
        this.Price = Price;
    }

    // 項鍊
    public ItemData(int ItemID, String ItemName, byte Job, byte Level, short Defense, short Hp, short Mp, int Price) {
        this.ItemID = ItemID;
        this.ItemName = ItemName;
        this.Job = Job;
        this.Level = Level;
        this.Attack = -1;
        this.AttackRange = -1;
        this.Defense = Defense;
        this.Speed = 0;
        this.Hp = Hp;
        this.Mp = Mp;
        this.Price = Price;
    }

    // 披風
    public ItemData(int ItemID, String ItemName, byte Job, byte Level, short Str, short Dex, short Vit, short Int, int Price) {
        this.ItemID = ItemID;
        this.ItemName = ItemName;
        this.Job = Job;
        this.Level = Level;
        this.Str = Str;
        this.Dex = Dex;
        this.Vit = Vit;
        this.Int = Int;
        this.Price = Price;
    }

    // 封印箱
    public ItemData(int ItemID, String ItemName, int Spirit, int Price) {
        this.ItemID = ItemID;
        this.ItemName = ItemName;
        this.Spirit = Spirit;
        this.Price = Price;
    }

    // 其他
    public ItemData(int ItemID, String ItemName, int Price) {
        this.ItemID = ItemID;
        this.ItemName = ItemName;
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: this.Job = 0xFF;
        this.Job = (byte) 0xFF;
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: this.Level = 0xFF;
        this.Level = (byte) 0xFF;
        this.Attack = -1;
        this.AttackRange = -1;
        this.Defense = -1;
        this.Speed = 0;
        this.Hp = -1;
        this.Mp = -1;
        this.Price = Price;
    }

    //C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: public ItemData(int ItemID, string ItemName, byte Job, byte Level, short Attack, short MagicAttack, short AttackRange, byte Speed, short Hp, short Mp, int Price)
    public ItemData(int ItemID, String ItemName, byte Job, byte Level, short Attack, short MagicAttack, short AttackRange, byte Speed, short Hp, short Mp, int Price) {
        this.ItemID = ItemID;
        this.ItemName = ItemName;
        this.Job = Job;
        this.Level = Level;
        this.Attack = Attack;
        this.Magic = MagicAttack;
        this.AttackRange = AttackRange;
        this.Defense = -1;
        this.Speed = Speed;
        this.Hp = Hp;
        this.Mp = Mp;
        this.Price = Price;
    }

    public int getItemID() {
        return ItemID;
    }

    public String getItemName() {
        return ItemName;
    }

    public byte getJob() {
        return Job;
    }

    public byte getLevel() {
        return Level;
    }

    public short getStr() {
        return Str;
    }

    public short getDex() {
        return Dex;
    }

    public short getVit() {
        return Vit;
    }

    public short getInt() {
        return Int;
    }

    public short getAttack() {
        return Attack;
    }

    public short getMagic() {
        return Magic;
    }

    public short getAvoid() {
        return Avoid;
    }

    public short getDefense() {
        return Defense;
    }

    public short getHp() {
        return Hp;
    }

    public short getMp() {
        return Mp;
    }

    public short getAttackRange() {
        return AttackRange;
    }

    public byte getSpeed() {
        return Speed;
    }

    public byte getRefining() {
        return Refining;
    }

    public byte getFusion() {
        return Fusion;
    }

    public int getType() {
        return Type;
    }

    public int getRecover() {
        return Recover;
    }

    public int getSpirit() {
        return Spirit;
    }

    public int getPrice() {
        return Price;
    }
}
