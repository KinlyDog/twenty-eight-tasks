package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.SherlockValidString.*;

class SherlockValidStringTest {

    @Test
    void test0() {
        assertTrue(sherlockValidString("xyz"));
    }

    @Test
    void test1() {
        assertTrue(sherlockValidString("xyzaa"));
    }

    @Test
    void test2() {
        assertTrue(sherlockValidString("xxyyz"));
    }

    @Test
    void test3() {
        assertFalse(sherlockValidString("xyzzz"));
    }

    @Test
    void test4() {
        assertFalse(sherlockValidString("xxyyza"));
    }

    @Test
    void test5() {
        assertFalse(sherlockValidString("xxyyzabc"));
    }

}