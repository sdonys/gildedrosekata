package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void GiveItemAgedBrieSellin5AndQuality50_thenGetNameAgedBrie() {
        Item[] items = new Item[] { new Item("Aged Brie", 5, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
//        assertEquals(true,true);
        assertEquals("Aged Brie", app.getItems()[0].getName());
    }
    @Test
    public void GiveItemAgedBrieSellin5AndQuality50_thenGetQuality49() {
        Item[] items = new Item[] { new Item("Aged Brie", 5, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
//        assertEquals(true,true);
        assertEquals(50, app.getItems()[0].getQuality());
    }

}
