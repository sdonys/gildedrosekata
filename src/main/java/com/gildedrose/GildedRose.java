package com.gildedrose;

import java.util.stream.Stream;

import static com.gildedrose.GildedRoseItem.*;

class GildedRose {
    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }

    public void updateQuality() {
        Stream.of(items).forEach(item -> {
            if(SULFURAS.getName().equals(item.getName())){
                item.setQuality(80);
            } else {
                updateSellInOfEachItem(item);
                updateQualityOfEachItem(item);
            }
        });
    }

    private void updateSellInOfEachItem(Item item) {
        item.setSellIn(item.getSellIn() - 1);
    }

    private void updateQualityOfEachItem(Item item) {
        if (BRIE.getName().equals(item.getName())) {
            updateItemBrie(item);
        } else if (BACKSTAGE_PASSES.getName().equals(item.getName())) {
            updateItemBackStagePasses(item);
        } else {
            if (item.getQuality() > 0) {
                increaseQualityBy(item, -1);
                updateConjuredItem(item);
                if (item.getSellIn() < 0 ) {
                    increaseQualityBy(item, -1);
                    updateConjuredItem(item);
                }
            }
        }
    }

    private void updateConjuredItem(Item item) {
        if (CONJURED.getName().equals(item.getName())) {
            increaseQualityBy(item, -1);
        }
    }

    private void updateItemBrie(Item item) {
        if (BRIE.getMaxmumQuality() > item.getQuality()) {
            increaseQualityBy(item, 1);
        }
    }

    private void updateItemBackStagePasses(Item item) {
        if (BACKSTAGE_PASSES.getMaxmumQuality() > item.getQuality()) {
            if (item.getSellIn() <= 0) {
                item.setQuality(0);
            } else if (item.getSellIn() < 5) {
                increaseQualityBy(item, 3);
            } else if (item.getSellIn() < 10){
                increaseQualityBy(item, 2);
            } else {
                increaseQualityBy(item, 1);
            }
            if(BACKSTAGE_PASSES.getMaxmumQuality() < item.getQuality()){
                item.setQuality(BACKSTAGE_PASSES.getMaxmumQuality());
            }
        }
    }

    private void increaseQualityBy(Item item, int i) {
        item.setQuality(item.getQuality() + i);
    }

}