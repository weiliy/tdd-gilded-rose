package cn.xpbootcamp.gildedrose;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

public class ItemTests {
    // 常规商品
    @Test
    public void should_return_s9_q9_when_pass_one_day_given_general_s10_q10() {
        Item item = new Item(10, 10);
        item.pass(1);

        assertEquals(item.getSellIn(), 9);
        assertEquals(item.getQuality(), 9);
    }
}
