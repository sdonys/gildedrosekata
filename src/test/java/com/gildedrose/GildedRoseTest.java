package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

    @Test
    public void givenAnyItem_whenUpdatingQuality_decreaseSellIn() {
        Item[] items = new Item[]{new Item("Aged Brie", 4, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(3, items[0].getSellIn());
    }

    @Test
    public void GiveItemSellin10AndQuality30__whenUpdatingQuality_thenGetQuality29() {
        Item[] items = new Item[]{new Item("an Item", 10, 30)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
//        assertEquals(true,true);
        assertEquals(29, app.getItems()[0].getQuality());
    }

    @Test
    public void GiveItemAgedBrieSellin10AndQuality30__whenUpdatingQuality_thenGetNameAgedBrie() {
        Item[] items = new Item[]{new Item("Aged Brie", 10, 30)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
//        assertEquals(true,true);
        assertEquals("Aged Brie", app.getItems()[0].getName());
    }

    @Test
    public void GiveItemAgedBrieSellin10AndQuality30__whenUpdatingQuality_thenGetQuality31() {
        Item[] items = new Item[]{new Item("Aged Brie", 5, 30)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(31, app.getItems()[0].getQuality());
    }

    @Test
    public void GiveItemAgedBrieSellin10AndQuality50__whenUpdatingQuality_thenGetQuality50() {
        Item[] items = new Item[]{new Item("Aged Brie", 5, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.getItems()[0].getQuality());
    }

    @Test
    public void GiveItemBackstagePassesSellin11AndQuality30__whenUpdatingQuality_thenGetQuality31() {
        Item[] items = new Item[]{new Item("Backstage passes", 11, 30)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(31, app.getItems()[0].getQuality());
    }
    @Test
    public void GiveItemBackstagePassesSellin8AndQuality30__whenUpdatingQuality_thenGetQuality32() {
        Item[] items = new Item[]{new Item("Backstage passes", 8, 30)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(32, app.getItems()[0].getQuality());
    }
    @Test
    public void GiveItemBackstagePassesSellin2AndQuality30__whenUpdatingQuality_thenGetQuality33() {
        Item[] items = new Item[]{new Item("Backstage passes", 2, 30)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(33, app.getItems()[0].getQuality());
    }
    @Test
    public void GiveItemBackstagePassesSellin0AndQuality30_whenUpdatingQuality_thenGetQuality0() {
        Item[] items = new Item[]{new Item("Backstage passes", 0, 30)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.getItems()[0].getQuality());
    }
    @Test
    public void GiveItemBackstagePassesSellin7AndQuality49__whenUpdatingQuality_thenGetQuality50() {
        Item[] items = new Item[]{new Item("Backstage passes", 7, 49)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.getItems()[0].getQuality());
    }@Test
    public void GiveItemBackstagePassesSellin2AndQuality49__whenUpdatingQuality_thenGetQuality50() {
        Item[] items = new Item[]{new Item("Backstage passes", 2, 49)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.getItems()[0].getQuality());
    }

    @Test
    public void GiveItemSulfurasSellin5AndQuality80__whenUpdatingQuality_thenGetSellin5() {
        Item[] items = new Item[]{new Item("Sulfuras", 5, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(5, app.getItems()[0].getSellIn());
    }
    @Test
    public void GiveItemSulfurasSellin5AndQuality80__whenUpdatingQuality_thenQuality80() {
        Item[] items = new Item[]{new Item("Sulfuras", 5, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(80, app.getItems()[0].getQuality());
    }
}
