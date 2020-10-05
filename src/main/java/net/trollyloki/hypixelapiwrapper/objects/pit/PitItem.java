package net.trollyloki.hypixelapiwrapper.objects.pit;

import java.util.ArrayList;
import java.util.List;

import net.querz.nbt.tag.CompoundTag;
import net.querz.nbt.tag.Tag;
import net.trollyloki.hypixelapiwrapper.HypixelAPIWrapper;
import net.trollyloki.hypixelapiwrapper.Utils;
import net.trollyloki.hypixelapiwrapper.objects.inventory.Item;

public class PitItem extends Item {

	private final int lives, maxLives;
	private final int nonce;
	private final int upgradeTier;

	private final List<PitCustomEnchant> enchants;

	public PitItem(HypixelAPIWrapper api, CompoundTag tag) {
		super(api, tag);

		if (extraAttributes != null) {
			this.lives = Utils.getAsIntOrDefault(extraAttributes, "Lives", 0);
			this.maxLives = Utils.getAsIntOrDefault(extraAttributes, "MaxLives", 0);
			this.nonce = Utils.getAsIntOrDefault(extraAttributes, "Nonce", 0);
			this.upgradeTier = Utils.getAsIntOrDefault(extraAttributes, "UpgradeTier", 0);

			this.enchants = new ArrayList<>();
			if (extraAttributes.containsKey("CustomEnchants"))
				for (Tag<?> enchantTag : extraAttributes.getListTag("CustomEnchants")) {
					enchants.add(new PitCustomEnchant(api, (CompoundTag) enchantTag));
				}
		} else {
			this.lives = 0;
			this.maxLives = 0;
			this.nonce = 0;
			this.upgradeTier = 0;
			this.enchants = new ArrayList<>();
		}
	}

	public int getLives() {
		return lives;
	}

	public int getMaxLives() {
		return maxLives;
	}

	public int getNonce() {
		return nonce;
	}

	public int getUpgradeTier() {
		return upgradeTier;
	}

	public List<PitCustomEnchant> getEnchants() {
		return new ArrayList<>(enchants);
	}

	@Override
	public String toString() {
		return "PitItem{item=" + super.toString() + ", lives=" + lives + ", maxLives=" + maxLives + ", nonce=" + nonce
				+ ", upgradeTier=" + upgradeTier + ", enchants=" + enchants + "}";
	}

}
