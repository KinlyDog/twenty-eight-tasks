package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.MaximumDiscount.*;

class MaximumDiscountTest {

    @Test
    void test0() {
        int benefit = 450;
        int[] priceList = {
                400, 350, 300, 250, 200, 150, 100
        };

        assertEquals(benefit, maximumDiscount(priceList.length, priceList));
    }

    @Test
    void test1() {
        int benefit = 15;
        int[] priceList = {
                125, 15, 500
        };

        assertEquals(benefit, maximumDiscount(priceList.length, priceList));
    }

    @Test
    void test2() {
        int benefit = 100;
        int[] priceList = {100, 200, 300, 400, 500, 600, 700};

        assertNotEquals(benefit, maximumDiscount(priceList.length, priceList));
    }

    @Test
    void zeroTest() {
        int benefit = 0;
        int[] priceList = {};

        assertEquals(benefit, maximumDiscount(priceList.length, priceList));
    }
}
