package CharacterServer.Net;

import Common.Packet.InPacket;
import Common.Packet.OutPacket;
import Common.Constants.InventoryType;
import Common.DAO.AccountsEntity;
import Common.DAO.CharactersEntity;
import Common.DAO.ItemsEntity;
import Common.DB.DBConnection;
import Common.Net.ServerOpcode;
import Common.Security.PasswordEncrypt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CharHandler {
    //TODO角色創建，刪除，ID檢查
    public static OutPacket MyChar_Info_Req(InPacket inPacket) {
        String[] strings = inPacket.ReadString().split(Character.toString((char) 0x20));
        int encryptKey = Integer.parseInt(strings[1]);
        String username = strings[2];
        String password = strings[4];
        PasswordEncrypt pe = new PasswordEncrypt(encryptKey);
        AccountsEntity accountsEntity = DBConnection.DBGetUsername(username);
        String encryptedPassword = pe.encrypt(accountsEntity.getPassword());
        if (encryptedPassword.equals(password)) {
            OutPacket op = new OutPacketCharServer();
            List<CharactersEntity> charactersEntities = DBConnection.DBGetCharacters(accountsEntity.getId());
            op.WriteUShortLE(ServerOpcode.MYCHAR_INFO_ACK.getValue());
            op.WriteIntLE(0);
            op.WriteIntLE(0);
            op.WriteIntLE(charactersEntities.size());
            for (int i = 0; i < 4; i++) {
                boolean isCreate = false;
                for (CharactersEntity c : charactersEntities) {
                    if (c.getPosition() == i + 1) {
                        op.WriteString(c.getName(), 20);
                        op.WriteString(c.getTitle(), 20);
                        op.WriteByte(c.getGender());
                        op.WriteByte(c.getLevel());
                        op.WriteByte(c.getClassId());
                        op.WriteByte(c.getClassLv());
                        op.WriteByte(0);
                        op.WriteByte(0);
                        op.WriteByte(0);
                        op.WriteByte(0);
                        op.WriteShortLE(0);
                        op.WriteShortLE(0);
                        List<ItemsEntity> Items = DBConnection.DBGetCharactersItems(c.getId());
                        Map<Byte,Integer> CharactersData= getCharactersData(Items);
                        op.WriteIntLE(CharactersData.getOrDefault(InventoryType.EquipType.Weapon.getValue(), 0));
                        op.WriteIntLE(CharactersData.getOrDefault(InventoryType.EquipType.Outfit.getValue(),0));
                        op.WriteIntLE(CharactersData.getOrDefault(InventoryType.EquipType.Face.getValue(),0));
                        op.WriteIntLE(CharactersData.getOrDefault(InventoryType.EquipType.Face2.getValue(),0));
                        op.WriteIntLE(CharactersData.getOrDefault(InventoryType.EquipType.Hat.getValue(),0));
                        op.WriteIntLE(c.getEyes());
                        op.WriteIntLE(CharactersData.getOrDefault(InventoryType.EquipType.Mantle.getValue(),0));
                        op.WriteIntLE(CharactersData.getOrDefault(InventoryType.EquipType.Dress.getValue(),0));
                        op.WriteIntLE(c.getHair());
                    }
                }
            }
            return op;
        }
        return null;
    }

    private static Map<Byte, Integer> getCharactersData(List<ItemsEntity> itemsEntities){
        Map<Byte,Integer> equip = new HashMap<>();
        if(itemsEntities!=null){
            for (ItemsEntity i:itemsEntities) {
                if(i.getType()!=InventoryType.ItemType.Equip.getValue()){
                    continue;
                }
                if(i.getSlot()==InventoryType.EquipType.Weapon.getValue()){
                    equip.put(InventoryType.EquipType.Weapon.getValue(),i.getItemId());
                }else if(i.getSlot()==InventoryType.EquipType.Outfit.getValue()){
                    equip.put(InventoryType.EquipType.Outfit.getValue(), i.getItemId());
                }else if(i.getSlot()==InventoryType.EquipType.Ring.getValue()){
                    equip.put(InventoryType.EquipType.Ring.getValue(), i.getItemId());
                }else if(i.getSlot()==InventoryType.EquipType.Necklace.getValue()){
                    equip.put(InventoryType.EquipType.Necklace.getValue(), i.getItemId());
                }else if(i.getSlot()==InventoryType.EquipType.Mantle.getValue()){
                    equip.put(InventoryType.EquipType.Mantle.getValue(), i.getItemId());
                }else if(i.getSlot()==InventoryType.EquipType.Seal.getValue()){
                    equip.put(InventoryType.EquipType.Seal.getValue(), i.getItemId());
                }else if(i.getSlot()==InventoryType.EquipType.Hat.getValue()){
                    equip.put(InventoryType.EquipType.Hat.getValue(),i.getItemId());
                }else if(i.getSlot()==InventoryType.EquipType.Hair.getValue()){
                    equip.put(InventoryType.EquipType.Hair.getValue(),i.getItemId());
                }else if(i.getSlot()==InventoryType.EquipType.Eyes.getValue()){
                    equip.put(InventoryType.EquipType.Eyes.getValue(),i.getItemId());
                }else if(i.getSlot()==InventoryType.EquipType.Face.getValue()){
                    equip.put(InventoryType.EquipType.Face.getValue(), i.getItemId());
                }else if(i.getSlot()==InventoryType.EquipType.Pet.getValue()){
                    equip.put(InventoryType.EquipType.Pet.getValue(), i.getItemId());
                }else if(i.getSlot()==InventoryType.EquipType.Dress.getValue()){
                    equip.put(InventoryType.EquipType.Dress.getValue(), i.getItemId());
                }else if(i.getSlot()==InventoryType.EquipType.Face2.getValue()){
                    equip.put(InventoryType.EquipType.Face2.getValue(), i.getItemId());
                }else if(i.getSlot()==InventoryType.EquipType.Earing.getValue()){
                    equip.put(InventoryType.EquipType.Earing.getValue(), i.getItemId());
                }else if(i.getSlot()==InventoryType.EquipType.HairAcc.getValue()){
                    equip.put(InventoryType.EquipType.HairAcc.getValue(), i.getItemId());
                }else if(i.getSlot()==InventoryType.EquipType.Toy.getValue()){
                    equip.put(InventoryType.EquipType.Toy.getValue(), i.getItemId());
                }

            }
        }
        return equip;
    }
}
