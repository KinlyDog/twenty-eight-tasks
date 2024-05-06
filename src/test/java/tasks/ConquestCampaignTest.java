package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.ConquestCampaign.*;

class ConquestCampaignTest {

    @Test
    void test0() {
        assertEquals(3, conquestCampaign(3, 4, 2, new int[]{2, 2, 3, 4}));
    }

    @Test
    void test1() {
        assertEquals(10, conquestCampaign(5, 6, 1, new int[]{1, 1}));
    }

    @Test
    void test2() {
        assertEquals(11, conquestCampaign(11, 11, 1, new int[]{6, 6}));
    }
}