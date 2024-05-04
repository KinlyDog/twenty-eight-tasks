package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.WhiteWalkers.*;

class WhiteWalkersTest {
    @Test
    void emptyTest() {
        assertFalse(whiteWalkers(""));
    }

    @Test
    void test0() {
        assertTrue(whiteWalkers("axxb6===4xaf5===eee5"));
    }

    @Test
    void test1() {
        assertFalse(whiteWalkers("5==ooooooo=5=5"));
    }

    @Test
    void test2() {
        assertTrue(whiteWalkers("abc=7==hdjs=3gg1=======5"));
    }

    @Test
    void test3() {
        assertFalse(whiteWalkers("aaS=8"));
    }

    @Test
    void test4() {
        assertTrue(whiteWalkers("9===1===9===1===9"));
    }
}