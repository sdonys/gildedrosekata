package com.gildedrose;

public enum GildedRoseItem {
    BRIE("Aged Brie" ,+1),
    SULFURAS("Sulfuras",0,80, true),
    BACKSTAGE_PASSES("Backstage passes" , 0),
    CONJURED("Conjured",-2);

    private String name;
    private int maxmumQuality = 50;
    private boolean legedaryItem = false;
    private int multiplicationOfQuality;

    GildedRoseItem(String name, int multiplicationOfQuality, int maxmumQuality, boolean legedaryItem){
        this.name = name;
        this.maxmumQuality= maxmumQuality;
        this.multiplicationOfQuality = multiplicationOfQuality;
        this.legedaryItem = legedaryItem;
    }
    GildedRoseItem(String name, int multiplicationOfQuality){
        this.name = name;
        this.multiplicationOfQuality  = multiplicationOfQuality;
    }

    public String getName() {
        return name;
    }

    public int getMaxmumQuality() {
        return maxmumQuality;
    }

    public boolean isLegedaryItem() {
        return legedaryItem;
    }

    public int getMultiplicationOfQuality() {
        return multiplicationOfQuality;
    }
}
