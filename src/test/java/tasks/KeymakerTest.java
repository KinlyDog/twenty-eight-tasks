package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.Keymaker.*;

class KeymakerTest {

    @Test
    void test0() {
        assertEquals("", keymaker(0));
    }

    @Test
    void test1() {
        assertEquals("1", keymaker(1));
    }

    @Test
    void test2() {
        assertEquals("10010", keymaker(5));
    }

    @Test
    void test3() {
        assertEquals("10010000", keymaker(8));
    }

    @Test
    void test4() {
        assertEquals("1001000010000001", keymaker(16));
    }

}