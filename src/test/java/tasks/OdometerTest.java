package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.Odometer.*;

class OdometerTest {

    @Test
    void test0() {
        assertEquals(90, odometer(new int[]{10, 1, 20, 5}));
    }

    @Test
    void test1() {
        assertEquals(30, odometer(new int[]{10, 1, 20, 2}));
    }
}