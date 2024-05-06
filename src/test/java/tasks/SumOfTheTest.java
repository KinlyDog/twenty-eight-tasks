package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.SumOfThe.*;

class SumOfTheTest {

    @Test
    void test0() {
        int[] array = {5, -25, 10, -35, -45};
        int n = array.length;

        assertEquals(-45, sumOfThe(n, array));
    }

    @Test
    void test1() {
        int[] array = {100, -50, 10, -25, 90, -35, 90};
        int n = array.length;

        assertEquals(90, sumOfThe(n, array));
    }

    @Test
    void test3() {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 150, -130};
        int n = array.length;

        assertEquals(150, sumOfThe(n, array));
    }
}
