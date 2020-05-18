package cn.xpbootcamp.gildedrose;

public class AgedBrie extends Item {
    public AgedBrie(int sellIn, int quality) throws Exception {
        super(sellIn, quality);
    }

    @Override
    public void pass(int days) {
        int current = quality;
        super.pass(days);
        quality= current + days;
    }
}
