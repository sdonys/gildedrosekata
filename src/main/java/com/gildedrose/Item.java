package com.gildedrose;

import java.util.Objects;

public class Item {

    private String name;
    private int sellIn;
    private int quality;

    public Item() {

    }

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public Item setName(String name) {
        this.name = name;
        return this;
    }

    public Item setSellIn(int sellIn) {
        this.sellIn = sellIn;
        return this;
    }

    public Item setQuality(int quality) {
        this.quality = quality;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return sellIn == item.sellIn &&
                quality == item.quality &&
                Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sellIn, quality);
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
