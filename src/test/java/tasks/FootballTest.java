package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.Football.*;

class FootballTest {
    int[] ma;

    @Test
    void test0() {
        ma = new int[]{1, 3, 2};

        assertTrue(football(ma, ma.length));
    }

    @Test
    void test1() {
        ma = new int[]{3, 2, 1};

        assertTrue(football(ma, ma.length));
    }

    @Test
    void test2() {
        ma = new int[]{1, 7, 5, 3, 9};

        assertTrue(football(ma, ma.length));
    }

    @Test
    void test3() {
        ma = new int[]{9, 5, 3, 7, 1};

        assertFalse(football(ma, ma.length));
    }

    @Test
    void test4() {
        ma = new int[]{1, 4, 3, 2, 5};

        assertTrue(football(ma, ma.length));
    }

    @Test
    void test5() {
        ma = new int[]{1, 2, 3, 4, 8, 7, 6, 5, 9, 10, 0};

        assertFalse(football(ma, ma.length));
    }
}