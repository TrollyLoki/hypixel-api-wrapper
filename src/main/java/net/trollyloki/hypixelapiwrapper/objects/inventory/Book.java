package net.trollyloki.hypixelapiwrapper.objects.inventory;

import java.util.ArrayList;
import java.util.List;

import net.querz.nbt.tag.CompoundTag;
import net.querz.nbt.tag.StringTag;
import net.trollyloki.hypixelapiwrapper.HypixelAPIWrapper;
import net.trollyloki.hypixelapiwrapper.Utils;

public class Book extends Item {

	private final String author, title;
	private final List<String> pages;
	private final boolean hypixelBookOverride;

	public Book(HypixelAPIWrapper api, CompoundTag tag) {
		super(api, tag);
		this.author = metaTag.getString("author");
		this.title = metaTag.getString("title");
		this.pages = new ArrayList<>();
		for (StringTag page : metaTag.getListTag("pages").asStringTagList())
			pages.add(page.getValue());
		this.hypixelBookOverride = Utils.getAsBooleanOrDefault(metaTag, "hypixelBookOverride", false);
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public List<String> getPages() {
		return pages;
	}

	public boolean isHypixelBookOverride() {
		return hypixelBookOverride;
	}

	@Override
	public String toString() {
		return "Book{item=" + super.toString() + ", author=" + author + ", title=" + title + ", pages=" + pages
				+ ", hypixelBookOverride=" + hypixelBookOverride + "}";
	}

}
