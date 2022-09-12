package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GildedRoseTest {

  @Test
  public void regular_items_sell_in_decreases_everyday() {
    Item regularItem = regularItem(2, 0);
    GildedRose app = new GildedRose(new Item[]{regularItem});

    app.updateQuality();

    assertEquals(regularItem.sellIn, 1);
  }

  @Test
  public void regular_items_quality_decreases_everyday() {
    Item regularItem = regularItem(1, 1);
    GildedRose app = new GildedRose(new Item[]{regularItem});

    app.updateQuality();

    assertEquals(regularItem.quality, 0);
  }

  @Test
  public void the_quality_of_an_item_is_never_negative() {
    Item regularItem = regularItem(3, 0);
    GildedRose app = new GildedRose(new Item[]{regularItem});

    app.updateQuality();

    assertEquals(regularItem.quality, 0);
  }

  @Test
  public void expired_items_degrade_twice_as_fast() {
    Item regularItem = regularItem(-1, 3);
    GildedRose app = new GildedRose(new Item[]{regularItem});

    app.updateQuality();

    assertEquals(regularItem.quality, 1);
  }


  private Item regularItem(int sellIn, int quality) {
    return new Item("foo", sellIn, quality);
  }


}
