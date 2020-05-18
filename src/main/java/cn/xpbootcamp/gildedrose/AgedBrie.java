package cn.xpbootcamp.gildedrose;

public class AgedBrie extends Item {
    public AgedBrie(int sellIn, int quality) throws Exception {
        super(sellIn, quality);
    }

    @Override
    protected void updateQuality(int days) {
        if (sellIn < 5) {
            quality += days * 3;
        } else if (sellIn < 10) {
            quality += days * 2;
        } else {
            quality += days;
        }
    }
}
