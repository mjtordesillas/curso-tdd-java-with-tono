package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GildedRoseTest {

  @Test
  public void regular_items_sell_in_decreases_everyday() {
    Item regularItem = regularItem(2, 0);
    GildedRose app = new GildedRose(new Item[]{regularItem});

    app.updateQuality();

    assertEquals(1, regularItem.sellIn);
  }

  @Test
  public void regular_items_quality_decreases_everyday() {
    Item regularItem = regularItem(1, 1);
    GildedRose app = new GildedRose(new Item[]{regularItem});

    app.updateQuality();

    assertEquals(0, regularItem.quality);
  }

  @Test
  public void the_quality_of_an_item_is_never_negative() {
    Item regularItem = regularItem(3, 0);
    GildedRose app = new GildedRose(new Item[]{regularItem});

    app.updateQuality();

    assertEquals(0, regularItem.quality);
  }

  @Test
  public void expired_items_degrade_twice_as_fast() {
    Item regularItem = regularItem(-1, 3);
    GildedRose app = new GildedRose(new Item[]{regularItem});

    app.updateQuality();

    assertEquals(1, regularItem.quality);
  }

  @Test
  public void aged_brie_increases_quality_the_older_it_gets() {
    Item agedBrie = new Item("Aged Brie", 1, 3);
    GildedRose app = new GildedRose(new Item[]{agedBrie});

    app.updateQuality();

    assertEquals(4, agedBrie.quality);
  }
  @Test
  public void aged_brie_increases_quality_twice_as_fast_once_expired() {
    Item agedBrie = new Item("Aged Brie", -1, 3);
    GildedRose app = new GildedRose(new Item[]{agedBrie});

    app.updateQuality();

    assertEquals(5, agedBrie.quality);
  }

  @Test
  public void the_quality_of_an_item_is_never_more_than_50() {
    Item agedBrie = new Item("Aged Brie", 1, 50);
    GildedRose app = new GildedRose(new Item[]{agedBrie});

    app.updateQuality();

    assertEquals(50, agedBrie.quality);
  }



  private Item regularItem(int sellIn, int quality) {
    return new Item("foo", sellIn, quality);
  }


}
