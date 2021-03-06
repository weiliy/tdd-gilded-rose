package cn.xpbootcamp.gildedrose;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

public class ItemTests {
    // 常规商品
    @Test
    public void should_return_s9_q9_when_pass_one_day_given_general_s10_q10() throws Exception{
        Item item = new Item(10, 10);
        item.pass(1);

        assertEquals(item.getSellIn(), 9);
        assertEquals(item.getQuality(), 9);
    }

    @Test
    public void should_return_s0_q10_when_pass_one_day_given_s0_q_10() throws Exception {
        Item item = new Item(0, 10);
        item.pass(1);

        assertEquals(item.getSellIn(), -1);
        assertEquals(item.getQuality(), 8);
    }

    @Test
    public void should_throw_when_create_given_s10_q_60() {
        try {
            Item item = new Item(10, 60);
            fail();
        } catch (Exception e) {
            assertEquals(e.getMessage(), "over max quality");
        }
    }
}
