package Common.Net;

import Common.JOOU.UInteger;
import Common.JOOU.UShort;

public enum ClientOpcode {
    LOGIN_SERVER(0x55AA),
    SERVER(0x4D),

    // CharServer
    MYCHAR_INFO_REQ(0x8),
    CREATE_MYCHAR_REQ(0xA),
    CHECK_SAMENAME_REQ(0xC),
    DELETE_MYCHAR_REQ(0xE),

    // GameServer
    COMMAND_REQ(0x10),
    CHAT_REQ(0x17),
    GAMELOG_REQ(0x18),
    ENTER_WARP_ACK_REQ(0x1D),
    NPC_SHOP_BUY_REQ(0x22),
    NPC_SHOP_SELL_REQ(0x23),
    P_WARP_C(0x24),
    P_MOVE_C(0x27),
    P_SPEED_C(0x29),
    P_JUMP_C(0x2A),
    P_ATTACK_C(0x2B),
    P_DEFENCE_C(0x2C),
    P_DAMAGE_C(0x2D),
    P_SPELL_C(0x2E),
    P_DEAD_C(0x2F),
    P_SKILL_C(0x31),
    ATTACK_MONSTER_REQ(0x45),
    CHAR_DAMAGE_REQ(0x46),
    CHAR_DEAD_REQ(0x47),
    PICKUP_ITEM(0x4C),
    CHAR_STATUP_REQ(0x5F),
    CHAR_FURY(0x62),
    MOVE_ITEM_REQ(0x6C),
    INVEN_SELECTSLOT_REQ(0x6D),
    USE_SPEND_REQ(0x6F),
    INVEN_USESPEND_REQ(0x70),
    SKILL_LEVELUP_REQ(0x74),
    USE_SKILL_REQ(0x76),
    //
    QUEST_ALL_REQ(0x7A),
    QUEST_GIVEUP_REQ(0x7B),
    QUEST_DONE_REQ(0x7C),
    QUEST_RETURN_REQ(0x7D),
    QUEST_DONE2_REQ(0x7E),
    QUEST_UPDATE_REQ(0x7F),
    //
    SPIRIT_MOVE_REQ(0x82),
    EQUIPMENT_COMPOUND_REQ(0x83),
    //
    CAN_WARP_ACK_REQ(0x85),
    //
    TRADE_INVITE_REQ(0x92),
    TRADE_INVITE_RESPONSE_REQ(0x93),
    TRADE_READY_REQ(0x94),
    TRADE_CONFIRM_REQ(0x95),
    TRADE_CANCEL_REQ(0x96),
    TRADE_PUT_REQ(0x99),
    //
    PARTY_INVITE_REQ(0x9B),
    PARTY_INVITE_RESPONSES_REQ(0x9C),
    PARTY_LEAVE(0x9F),
    // 0xA0 驅逐隊員
    //
    PVP_REQ(0xA4),
    PVP_ACK_REQ(0xA5),
    //
    QUICK_SLOT_REQ(0xA8),
    //
    MOVE_ITEM_STORAGE_REQ(0xAC),
    MOVE_ITEM_TO_BAG_REQ(0xAD),
    SAVE_MONEY_REQ(0xAE),
    GIVE_MONEY_REQ(0xAF),
    //
    PSHOP_OPEN_REQ(0xCD),
    PSHOP_SELLSTART_REQ(0xCF),
    PSHOP_SELLEND_REQ(0xD1),
    PSHOP_INFO_REQ(0xD3),
    PSHOP_BUYACK_REQ(0xD5),

    EVENTITEM_ACK(0xD8),
    //
    P_MOVE_C_2(0xDD),
    //
    FISH_REQ(0xE0),
    //
    CASHSHOP_LIST_REQ(0xE4),
    CASH_MGAMECASH_REQ(0xE5),
    CASH_BUY_REQ(0xE7),
    CASH_GIFT_REQ(0xE9),
    CASH_TO_INVEN_REQ(0xEF),
    CASH_CHECKCHARNAME_REQ(0xFC),
    ABILITY_RECOVER_REQ(0xF8),
    INVEN_USESPEND_SHOUT_REQ(0xFA),
    //
    PET_NAME_REQ(0x101),
    PET_MOVE_C(0x10B),
    PET_MOVETO_C(0x10C),
    PET_MOVEBIRD_C(0x10D),
    PET_MOVEBIRDTO_C(0x10E),
    PET_JUMP_C(0x110),
    PET_ATTACK_C(0x111),
    PET_DEFENCE_C(0x112),
    PET_DAMAGE_C(0x113),
    PET_SPELL_C(0x114),
    PET_DEAD_C(0x115),
    PET_SKILL_C(0x116),
    PET_WARP_C(0x117),
    PET_SAY_C(0x118),
    //
    CASH_SN(0x11D),

    DISMANTLE_REQ(0x140),

    //
    INVEN_USESPEND_SHOUT_ALL_REQ(0x16B),
    //
    SP_SPEED_C(0x18D),
    SP_MOVE_C(0x18E),
    SP_JUMP_C(0x18F),
    SP_ATTACK_C(0x190),
    SP_SKILL_C(0x191),
    SP_SPELL_C(0x192),
    SP_WARP_C(0x193);

    private final UShort shortValue;


    private ClientOpcode(int value)
    {
        shortValue = UShort.valueOf(value);
    }

    public int getValue()
    {
        return shortValue.intValue();
    }


}
