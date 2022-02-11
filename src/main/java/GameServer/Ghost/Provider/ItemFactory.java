package GameServer.Ghost.Provider;

import Common.BinaryReader.BinaryReaderJ;
import GameServer.Ghost.ItemData;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemFactory {

    //武器資料
    //物品編號(int), 物品名稱(string), 職業(byte), 功力(byte), 類型(short), 攻擊距離(short), 攻擊速度(byte), 購買價格(int)
    public static Map<Integer, ItemData> weaponData = new HashMap<Integer, ItemData>();
    //衣服資料
    //物品編號(int), 物品名稱(string), 職業(byte), 功力(byte), 購買價格(int)
    public static Map<Integer, ItemData> topData = new HashMap<Integer, ItemData>();
    //服裝資料
    //物品編號(int), 物品名稱(string), 職業(byte), 功力(byte), 購買價格(int)
    public static Map<Integer, ItemData> clothingData = new HashMap<Integer, ItemData>();
    //戒指資料
    //物品編號(int), 物品名稱(string), 職業(byte), 功力(byte), 購買價格(int)
    public static Map<Integer, ItemData> ringData = new HashMap<Integer, ItemData>();
    //項鍊資料
    //物品編號(int), 物品名稱(string), 職業(byte), 功力(byte), 購買價格(int)
    public static Map<Integer, ItemData> necklaceData = new HashMap<Integer, ItemData>();
    //披風資料
    //物品編號(int), 物品名稱(string), 職業(byte), 功力(byte), 購買價格(int)
    public static Map<Integer, ItemData> capeData = new HashMap<Integer, ItemData>();
    //消耗品資料
    //物品編號(int), 物品名稱(string), 購買價格(int)
    public static Map<Integer, ItemData> useData = new HashMap<Integer, ItemData>();
    //封印箱資料
    //物品編號(int), 物品名稱(string), 購買價格(int)
    public static Map<Integer, ItemData> soulData = new HashMap<Integer, ItemData>();
    //帽子資料
    //物品編號(int), 物品名稱(string), 購買價格(int)
    public static Map<Integer, ItemData> hatData = new HashMap<Integer, ItemData>();
    //髮型資料
    //物品編號(int), 物品名稱(string), 購買價格(int)
    public static Map<Integer, ItemData> hairData = new HashMap<Integer, ItemData>();
    //眼睛資料
    //物品編號(int), 物品名稱(string), 購買價格(int)
    public static Map<Integer, ItemData> eyesData = new HashMap<Integer, ItemData>();
    //面具資料
    //物品編號(int), 物品名稱(string), 購買價格(int)
    public static Map<Integer, ItemData> maskData = new HashMap<Integer, ItemData>();
    //鬍子資料
    //物品編號(int), 物品名稱(string), 購買價格(int)
    public static Map<Integer, ItemData> beardData = new HashMap<Integer, ItemData>();
    //其他資料
    //物品編號(int), 物品名稱(string), 購買價格(int)
    public static Map<Integer, ItemData> etcData = new HashMap<Integer, ItemData>();
    //寵物資料
    //物品編號(int), 物品名稱(string), 購買價格(int)
    public static Map<Integer, ItemData> petData = new HashMap<Integer, ItemData>();
    //領巾資料
    //物品編號(int), 物品名稱(string), 購買價格(int)
    public static Map<Integer, ItemData> scarfData = new HashMap<Integer, ItemData>();
    //未知資料
    //物品編號(int), 物品名稱(string), 購買價格(int)
    public static Map<Integer, ItemData> unknownData = new HashMap<Integer, ItemData>();
    //拼圖資料
    //物品編號(int), 物品名稱(string), 購買價格(int)
    public static Map<Integer, ItemData> jigsawData = new HashMap<Integer, ItemData>();
    //耳環資料
    //物品編號(int), 物品名稱(string), 購買價格(int)
    public static Map<Integer, ItemData> earringData = new HashMap<Integer, ItemData>();

    public static List<HashMap<Integer, ItemData>> all = new ArrayList<HashMap<Integer, ItemData>>();
    public static void Initialize() throws IOException {


        File f = new File("C:\\SoulSaverSVJava\\src\\main\\java\\GameServer\\Ghost\\Provider\\item.itm");

        BinaryReaderJ bj = new BinaryReaderJ(f);
        bj.Read(120);

        int weaponCount = bj.ReadInt32(); // 武器數量
        for (int i = 0; i < weaponCount; i++)
        {
                int itemId = bj.ReadInt32(); // 物品編號

                byte[] bytes=  bj.Read(62);
                //TODO 解決編碼
                String itemNameString = new String(bytes);
                bj.Read(1);
                byte job = (byte) bj.Read(); // 功力
                byte level = (byte) bj.Read(); // 功力
                short attack = (short) bj.ReadInt16(); // 類型
                System.out.println("itemNameID: "+ itemId);
                System.out.println("itemNameString: "+ itemNameString);
                if(i==0){
                    break;
                }

        }

    }


}
