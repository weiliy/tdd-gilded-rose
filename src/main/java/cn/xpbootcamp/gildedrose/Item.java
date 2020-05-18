package cn.xpbootcamp.gildedrose;

public class Item {
    private int sellIn;
    private int quality;

    public Item(int sellIn, int quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void pass(int days) {
        sellIn -= days;

        if (sellIn < 0) {
            quality -= days * 2;
        } else {
            quality -= days;
        }
    }
}
