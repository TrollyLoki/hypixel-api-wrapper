package net.trollyloki.hypixelapiwrapper.objects.pit;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import net.trollyloki.hypixelapiwrapper.HypixelAPIWrapper;
import net.trollyloki.hypixelapiwrapper.Utils;
import net.trollyloki.hypixelapiwrapper.enums.ItemType;
import net.trollyloki.hypixelapiwrapper.enums.Season;
import net.trollyloki.hypixelapiwrapper.enums.pit.PitLeaderboardStat;
import net.trollyloki.hypixelapiwrapper.objects.APIObject;
import net.trollyloki.hypixelapiwrapper.objects.inventory.Book;
import net.trollyloki.hypixelapiwrapper.objects.inventory.Inventory;

public class PitProfile extends APIObject {

	private final Date lastSave;
	private final double gold;
	private final int xp, prestige, renown;

	private final Map<String, Integer> leaderboardStats;

	private final boolean movedAchievements1, movedAchievements2, zeroPointThreeGoldTransfer;

	private final List<PitContract> contractChoices;
	private final List<PitContract> endedContracts;
	private final Date lastContract;

	private final PitChatOptions chatOptions;
	private final PitKingQuest kingQuest;
	private final PitGenesisInfo genesisInfo;

	private final Inventory<PitItem> inventory, armor;
	private final List<ItemType> hotbarFavorites;
	private final Inventory<PitItem> enderchest, itemStash, mysticWell;

	private final Inventory<PitItem> spireStash;
	private final Inventory<PitItem> spireArmorStash;

	private final Map<Integer, List<PitUnlock>> unlocks;
	private final List<PitUnlock> renownUnlocks;

	private final Map<Integer, PitPrestigeInfo> prestiges;

	private final List<Date> tradeTimestamps;
	private final List<PitTransaction> goldTransactions;

	private final boolean impatient, apollo, rawNumbers, cheapMilk;
	private final boolean nightQuests, dropConfirm, hatEnabled;
	private final Color hatColor;
	private final String launchTrail, selectedLeaderboard;

	private final List<PitBounty> bounties;
	private final Inventory<Book> deathRecaps;
	private final Date lastMidfightDisconnect;
	private final Date lastLycanthropy;

	private final List<String> perks;
	private final List<String> killstreaks;
	private final List<String> autobuyItems;
	private final Map<String, Date> itemsLastBuy;

	public PitProfile(HypixelAPIWrapper api, JsonObject object) {
		super(api);

		this.lastSave = Utils.getAsDateOrDefault(object.get("last_save"), null);
		this.gold = Utils.getAsDoubleOrDefault(object.get("cash"), 0);
		this.xp = Utils.getAsIntOrDefault(object.get("xp"), 0);
		this.prestige = object.has("prestiges") ? object.getAsJsonArray("prestiges").size() : 0;
		this.renown = Utils.getAsIntOrDefault(object.get("renown"), 0);

		this.leaderboardStats = Utils.getAsIntMap(object.getAsJsonObject("leaderboard_stats"));

		this.movedAchievements1 = Utils.getAsBooleanOrDefault(object.get("moved_achievements_1"), false);
		this.movedAchievements2 = Utils.getAsBooleanOrDefault(object.get("moved_achievements_2"), false);
		this.zeroPointThreeGoldTransfer = Utils.getAsBooleanOrDefault(object.get("zero_point_three_gold_transfer"),
				false);

		this.contractChoices = Utils.getAsObjectList(api, object.get("contract_choices"), PitContract.class);
		this.endedContracts = Utils.getAsObjectList(api, object.get("ended_contracts"), PitContract.class);
		this.lastContract = Utils.getAsDateOrDefault(object.get("last_contract"), null);

		this.chatOptions = new PitChatOptions(api, object);
		this.kingQuest = new PitKingQuest(api, object.getAsJsonObject("king_quest"));
		this.genesisInfo = new PitGenesisInfo(api, object);

		this.inventory = Utils.getAsInventory(api, object.get("inv_contents"), PitItem.class);
		this.armor = Utils.getAsInventory(api, object.get("inv_armor"), PitItem.class);
		this.hotbarFavorites = new ArrayList<>();
		if (object.has("hotbar_favorites"))
			for (JsonElement element : object.getAsJsonArray("hotbar_favorites"))
				hotbarFavorites.add(ItemType.getById(element.getAsShort(), (short) 0));

		this.enderchest = Utils.getAsInventory(api, object.get("inv_enderchest"), PitItem.class);
		this.itemStash = Utils.getAsInventory(api, object.get("item_stash"), PitItem.class);
		this.mysticWell = Utils.getAsInventory(api, object.get("mystic_well_item"), PitItem.class);

		this.spireStash = Utils.getAsInventory(api, object.get("spire_stash_inv"), PitItem.class);
		this.spireArmorStash = Utils.getAsInventory(api, object.get("spire_stash_armor"), PitItem.class);

		this.unlocks = new HashMap<>();
		if (object.has("unlocks"))
			unlocks.put(0, Utils.getAsObjectList(api, object.get("unlocks"), PitUnlock.class));
		for (int p = 1; object.has("unlocks_" + p); p++)
			unlocks.put(p, Utils.getAsObjectList(api, object.get("unlocks_" + p), PitUnlock.class));
		this.renownUnlocks = Utils.getAsObjectList(api, object.get("renown_unlocks"), PitUnlock.class);

		this.prestiges = new HashMap<>();
		if (object.has("prestiges"))
			for (JsonElement element : object.getAsJsonArray("prestiges")) {
				JsonObject prestige = element.getAsJsonObject();
				int index = prestige.get("index").getAsInt();
				prestiges.put(index,
						new PitPrestigeInfo(api, prestige, object.get("cash_during_prestige_" + index).getAsDouble()));
			}

		this.tradeTimestamps = Utils.getAsDateList(object.get("trade_timestamps"));
		this.goldTransactions = Utils.getAsObjectList(api, object.get("gold_transactions"),
				PitTransaction.class);

		this.impatient = Utils.getAsBooleanOrDefault(object.get("impatient_enabled"), false);
		this.apollo = Utils.getAsBooleanOrDefault(object.get("apollo_enabled"), false);
		this.rawNumbers = Utils.getAsBooleanOrDefault(object.get("raw_numbers_enabled"), false);
		this.cheapMilk = Utils.getAsBooleanOrDefault(object.get("cheap_milk"), false);

		this.nightQuests = Utils.getAsBooleanOrDefault(object.get("night_quests_enabled"), true);
		this.dropConfirm = !Utils.getAsBooleanOrDefault(object.get("drop_confirm_disabled"), false);
		this.hatEnabled = Utils.getAsBooleanOrDefault(object.get("hat_enabled"), false);
		this.hatColor = Utils.getAsColorOrDefault(object.get("hat_color"), null);
		this.launchTrail = Utils.getAsStringOrDefault(object.get("selected_launch_trail"), null);
		this.selectedLeaderboard = Utils.getAsStringOrDefault(object.get("selected_leaderboard"), null);

		this.bounties = Utils.getAsObjectList(api, object.get("bounties"), PitBounty.class);
		this.deathRecaps = Utils.getAsInventory(api, object.get("death_recaps"), Book.class);
		this.lastMidfightDisconnect = Utils.getAsDateOrDefault(object.get("last_midfight_disconnect"), null);
		this.lastLycanthropy = Utils.getAsDateOrDefault(object.get("last_lycanthropy"), null);

		this.perks = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			JsonElement perk = object.get("selected_perk_" + i);
			if (perk != null && !perk.isJsonNull())
				perks.add(perk.getAsString());
		}
		this.killstreaks = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			JsonElement killstreak = object.get("selected_killstreak_" + i);
			if (killstreak != null && !killstreak.isJsonNull())
				perks.add(killstreak.getAsString());
		}
		this.autobuyItems = Utils.getAsStringList(object.get("autobuy_items"));
		this.itemsLastBuy = new HashMap<>();
		if (object.has("items_last_buy"))
			for (Entry<String, JsonElement> entry : object.getAsJsonObject("items_last_buy").entrySet())
				itemsLastBuy.put(entry.getKey(), new Date(entry.getValue().getAsLong()));
	}

	public Date getLastSave() {
		if (lastSave == null)
			return null;
		return (Date) lastSave.clone();
	}

	public double getGold() {
		return gold;
	}

	public int getXP() {
		return xp;
	}

	public int getPrestige() {
		return prestige;
	}

	public int getRenown() {
		return renown;
	}

	public Map<String, Integer> getLeaderboardStats() {
		return new HashMap<>(leaderboardStats);
	}

	public int getLeaderboardStats(PitLeaderboardStat stat, int year, Season season) {
		String key = "Pit_" + stat.name().toLowerCase() + "_" + year + "_" + season.name().toLowerCase();
		if (!leaderboardStats.containsKey(key))
			return 0;
		return leaderboardStats.get(key);
	}

	public boolean hasMovedAchievements1() {
		return movedAchievements1;
	}

	public boolean hasMovedAchievements2() {
		return movedAchievements2;
	}

	public boolean hasZeroPointThreeGoldTransfer() {
		return zeroPointThreeGoldTransfer;
	}

	public List<PitContract> getContractChoices() {
		return new ArrayList<>(contractChoices);
	}

	public List<PitContract> getEndedContracts() {
		return new ArrayList<>(endedContracts);
	}

	public Date getLastContract() {
		if (lastContract == null)
			return null;
		return (Date) lastContract.clone();
	}

	public PitChatOptions getChatOptions() {
		return chatOptions;
	}

	public PitKingQuest getKingQuest() {
		return kingQuest;
	}

	public PitGenesisInfo getGenesisInfo() {
		return genesisInfo;
	}

	public Inventory<PitItem> getInventory() {
		return inventory;
	}

	public Inventory<PitItem> getArmor() {
		return armor;
	}

	public List<ItemType> getHotbarFavorites() {
		return new ArrayList<>(hotbarFavorites);
	}

	public Inventory<PitItem> getEnderchest() {
		return enderchest;
	}

	public Inventory<PitItem> getItemStash() {
		return itemStash;
	}

	public Inventory<PitItem> getMysticWell() {
		return mysticWell;
	}

	public Inventory<PitItem> getSpireStash() {
		return spireStash;
	}

	public Inventory<PitItem> getSpireArmorStash() {
		return spireArmorStash;
	}

	public List<PitUnlock> getUnlocks(int prestige) {
		if (!unlocks.containsKey(prestige))
			return null;
		return new ArrayList<>(unlocks.get(prestige));
	}

	public List<PitUnlock> getRenownUnlocks() {
		return new ArrayList<>(renownUnlocks);
	}

	public PitPrestigeInfo getPrestigeInfo(int prestige) {
		return prestiges.get(prestige);
	}

	public List<Date> getTradeTimestamps() {
		return new ArrayList<>(tradeTimestamps);
	}

	public List<PitTransaction> getGoldTransactions() {
		return new ArrayList<>(goldTransactions);
	}

	public boolean hasImpatient() {
		return impatient;
	}

	public boolean hasApollo() {
		return apollo;
	}

	public boolean hasRawNumbers() {
		return rawNumbers;
	}

	public boolean hasCheapMilk() {
		return cheapMilk;
	}

	public boolean hasNightQuests() {
		return nightQuests;
	}

	public boolean hasDropConfirm() {
		return dropConfirm;
	}

	public boolean hasHatEnabled() {
		return hatEnabled;
	}

	public Color getHatColor() {
		return hatColor;
	}

	public String getLaunchTrail() {
		return launchTrail;
	}

	public String getSelectedLeaderboard() {
		return selectedLeaderboard;
	}

	public List<PitBounty> getBounties() {
		return new ArrayList<>(bounties);
	}

	public Inventory<Book> getDeathRecaps() {
		return deathRecaps;
	}

	public Date getLastMidfightDisconnect() {
		if (lastMidfightDisconnect == null)
			return null;
		return (Date) lastMidfightDisconnect.clone();
	}

	public Date getLastLycanthropy() {
		if (lastLycanthropy == null)
			return null;
		return (Date) lastLycanthropy.clone();
	}

	public List<String> getPerks() {
		return new ArrayList<>(perks);
	}

	public List<String> getKillstreaks() {
		return new ArrayList<>(killstreaks);
	}

	public List<String> getAutobuyItems() {
		return new ArrayList<>(autobuyItems);
	}

	public Date getItemsLastBuy(String item) {
		if (!itemsLastBuy.containsKey(item))
			return null;
		return (Date) itemsLastBuy.get(item).clone();
	}

	@Override
	public String toString() {
		return "PitProfile{lastSave=" + lastSave + ", gold=" + gold + ", xp=" + xp + ", prestige=" + prestige
				+ ", renown=" + renown + ", leaderboardStats=" + leaderboardStats + ", movedAchievements1="
				+ movedAchievements1 + ", movedAchievements2=" + movedAchievements2 + ", zeroPointThreeGoldTransfer="
				+ zeroPointThreeGoldTransfer + ", contractChoices=" + contractChoices + ", endedContracts="
				+ endedContracts + ", lastContract=" + lastContract + ", chatOptions=" + chatOptions + ", kingQuest="
				+ kingQuest + ", genesisInfo=" + genesisInfo + ", inventory=" + inventory + ", armor=" + armor
				+ ", hotbarFavorites=" + hotbarFavorites + ", enderchest=" + enderchest + ", itemStash=" + itemStash
				+ ", mysticWell=" + mysticWell + ", spireStash=" + spireStash + ", spireArmorStash=" + spireArmorStash
				+ ", unlocks=" + unlocks + ", renownUnlocks=" + renownUnlocks + ", prestiges=" + prestiges
				+ ", tradeTimestamps=" + tradeTimestamps + ", goldTransactions=" + goldTransactions + ", impatient="
				+ impatient + ", apollo=" + apollo + ", rawNumbers=" + rawNumbers + ", cheapMilk=" + cheapMilk
				+ ", nightQuests=" + nightQuests + ", dropConfirm=" + dropConfirm + ", hatEnabled=" + hatEnabled
				+ ", hatColor=" + hatColor + ", launchTrail=" + launchTrail + ", selectedLeaderboard="
				+ selectedLeaderboard + ", bounties=" + bounties + ", deathRecaps=" + deathRecaps
				+ ", lastMidfightDisconnect=" + lastMidfightDisconnect + ", lastLycanthropy=" + lastLycanthropy
				+ ", perks=" + perks + ", killstreaks=" + killstreaks + ", autobuyItems=" + autobuyItems
				+ ", itemsLastBuy=" + itemsLastBuy + "}";
	}

}
