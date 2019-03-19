package com.gildedrose;

public enum GildedRoseItem {
    BRIE("Aged Brie" ),
    SULFURAS("Sulfuras",80),
    BACKSTAGE_PASSES("Backstage passes" ),
    CONJURED("Conjured");

    private String name;
    private int maxmumQuality = 50;

    GildedRoseItem(String name, int maxmumQuality){
        this.name = name;
        this.maxmumQuality= maxmumQuality;
    }
    GildedRoseItem(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMaxmumQuality() {
        return maxmumQuality;
    }

}
