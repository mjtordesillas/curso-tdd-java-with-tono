package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GildedRoseTest {

  @Test
  public void regular_items_sell_in_decreases_everyday() {
    Item regularItem = new Item("foo", 1, 0);
    Item[] items = new Item[]{regularItem};
    GildedRose app = new GildedRose(items);

    app.updateQuality();

    assertEquals(regularItem.sellIn, 0);
  }

  @Test
  public void regular_items_quality_decreases_everyday() {
    Item regularItem = new Item("foo", 1, 1);
    Item[] items = new Item[]{regularItem};
    GildedRose app = new GildedRose(items);

    app.updateQuality();

    assertEquals(regularItem.quality, 0);
  }

}
