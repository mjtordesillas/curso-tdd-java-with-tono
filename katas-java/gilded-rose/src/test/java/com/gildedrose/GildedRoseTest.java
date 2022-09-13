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

  @Test
  public void the_quality_of_an_expired_age_brie_is_never_more_than_50() {
    Item agedBrie = new Item("Aged Brie", 0, 50);
    GildedRose app = new GildedRose(new Item[]{agedBrie});

    app.updateQuality();

    assertEquals(50, agedBrie.quality);
  }

  @Test
  public void sulfuras_does_not_expire() {
    Item sulfuras = new Item("Sulfuras, Hand of Ragnaros", 1, 50);
    GildedRose app = new GildedRose(new Item[]{sulfuras});

    app.updateQuality();

    assertEquals(1, sulfuras.sellIn);
  }

  @Test
  public void sulfuras_does_not_degrade() {
    Item sulfuras = new Item("Sulfuras, Hand of Ragnaros", 1, 25);
    GildedRose app = new GildedRose(new Item[]{sulfuras});

    app.updateQuality();

    assertEquals(25, sulfuras.quality);
  }

  @Test
  public void backstage_passes_are_worthless_after_the_concert() {
    Item passes = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 25);
    GildedRose app = new GildedRose(new Item[]{passes});

    app.updateQuality();

    assertEquals(0, passes.quality);
  }

  @Test
  public void backstage_passes_increase_in_value_a_lot_just_before_the_concert() {
    Item passes = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 25);
    GildedRose app = new GildedRose(new Item[]{passes});

    app.updateQuality();

    assertEquals(28, passes.quality);
  }

  @Test
  public void backstage_passes_moderately_increase_in_value_when_concert_is_close() {
    Item passes = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 25);
    GildedRose app = new GildedRose(new Item[]{passes});

    app.updateQuality();

    assertEquals(27, passes.quality);
  }

  @Test
  public void backstage_passes_slightly_increase_in_value_as_concert_approaches_but_still_far_away() {
    Item passes = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 25);
    GildedRose app = new GildedRose(new Item[]{passes});

    app.updateQuality();

    assertEquals(26, passes.quality);
  }

  @Test
  public void backstage_passes_still_far_away_quality_is_never_more_than_50() {
    Item passes = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 50);
    GildedRose app = new GildedRose(new Item[]{passes});

    app.updateQuality();

    assertEquals(50, passes.quality);
  }

  @Test
  public void backstage_passes_close_to_concert_quality_is_never_more_than_50() {
    Item passes = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 49);
    GildedRose app = new GildedRose(new Item[]{passes});

    app.updateQuality();

    assertEquals(50, passes.quality);
  }


  private Item regularItem(int sellIn, int quality) {
    return new Item("foo", sellIn, quality);
  }


}
