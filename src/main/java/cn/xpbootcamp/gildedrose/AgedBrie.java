package cn.xpbootcamp.gildedrose;

public class AgedBrie extends Item {
    public AgedBrie(int sellIn, int quality) throws Exception {
        super(sellIn, quality);
    }

    @Override
    protected void updateQuality(int days) {
        quality += days;
    }
}
