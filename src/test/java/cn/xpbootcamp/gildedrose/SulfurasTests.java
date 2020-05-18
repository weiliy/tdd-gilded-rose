package cn.xpbootcamp.gildedrose;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SulfurasTests {

    @Test
    public void should_return_s10_q30_when_pass_one_day_given_s10_q30() throws Exception {
        Sulfuras item = new Sulfuras(10, 30);
        item.pass(1);

        assertEquals(item.getSellIn(), 10);
        assertEquals(item.getQuality(), 30);
    }
}
