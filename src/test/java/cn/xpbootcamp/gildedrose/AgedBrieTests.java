package cn.xpbootcamp.gildedrose;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AgedBrieTests {

    @Test
    public void should_return_s10_q32_when_pass_one_day_given_s11_q30() throws Exception {
        AgedBrie item = new AgedBrie(11, 30);
        item.pass(1);

        assertEquals(10, item.getSellIn());
        assertEquals(31, item.getQuality());
    }

    @Test
    public void should_return_s9_q32_when_pass_one_day_given_s10_q30() throws Exception {
        AgedBrie item = new AgedBrie(10, 30);
        item.pass(1);

        assertEquals(9, item.getSellIn());
        assertEquals(32, item.getQuality());
    }

    @Test
    public void should_return_s5_q32_when_pass_one_day_given_s6_q30() throws Exception {
        AgedBrie item = new AgedBrie(6, 30);
        item.pass(1);

        assertEquals(5, item.getSellIn());
        assertEquals(32, item.getQuality());
    }

    @Test
    public void should_return_s4_q33_when_pass_one_day_given_s5_q30() throws Exception {
        AgedBrie item = new AgedBrie(5, 30);
        item.pass(1);

        assertEquals(4, item.getSellIn());
        assertEquals(33, item.getQuality());
    }

    @Test
    public void should_return_s1_q30_when_pass_one_day_given_s1_q30() throws Exception {
        AgedBrie item = new AgedBrie(1, 30);
        item.pass(1);

        assertEquals(0, item.getSellIn());
        assertEquals(33, item.getQuality());
    }
}
