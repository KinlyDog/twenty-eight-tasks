package tasks;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.MadMax.*;

import org.junit.jupiter.api.Test;

class MadMaxTest {

    @Test
    void test0() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int n = array.length;

        int[] result = {1, 2, 3, 7, 6, 5, 4};

        assertArrayEquals(result, madMax(n, array));
    }

    @Test
    void test1() {
        int[] array = {9, 1, 3, 4, 6};
        int n = array.length;

        int[] result = {1, 3, 9, 6, 4};

        assertArrayEquals(result, madMax(n, array));
    }

    @Test
    void test3() {
        int[] array = {9, 8, 6, 5, 4, 7, 1, 2, 3};
        int n = array.length;

        int[] result = {1, 2, 3, 4, 9, 8, 7, 6, 5};

        assertArrayEquals(result, madMax(n, array));
    }
}
