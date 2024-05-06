package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.PrintingCosts.*;

class PrintingCostsTest {

    @Test
    void test0() {
        String line = "abc";

        assertEquals(23 + 25 + 17, printingCosts(line));
    }

    @Test
    void test1() {
        String line = "HE110";

        assertEquals(25 + 26 + 19 + 19 + 22, printingCosts(line));
    }

    @Test
    void test2() {
        String line = "         ";

        assertEquals(0, printingCosts(line));
    }
}
