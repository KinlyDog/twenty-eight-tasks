package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.Squirrel.*;

class SquirrelTest {

    @Test
    void test0() {
        assertEquals(1, squirrel(0));
    }

    @Test
    void test1() {
        assertEquals(7, squirrel(6));
    }

    @Test
    void test2() {
        assertEquals(4, squirrel(8));
    }

    @Test
    void test3() {
        assertEquals(3, squirrel(10));
    }
}