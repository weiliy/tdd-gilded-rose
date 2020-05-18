package cn.xpbootcamp.gildedrose;

public class Item {
    protected int sellIn;
    protected int quality;

    public Item(int sellIn, int quality) throws Exception {
        if (quality > 50) {
            throw new Exception("over max quality");
        }

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
