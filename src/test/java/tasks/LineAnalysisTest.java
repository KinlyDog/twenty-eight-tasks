package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.LineAnalysis.*;

class LineAnalysisTest {

    @Test
    void test0() {
        assertTrue(lineAnalysis("*"));
    }

    @Test
    void test1() {
        assertTrue(lineAnalysis("***"));
    }

    @Test
    void test2() {
        assertTrue(lineAnalysis("*..*..*..*..*..*..*"));
    }

    @Test
    void test3() {
        assertTrue(lineAnalysis("*.*"));
    }

    @Test
    void test4() {
        assertFalse(lineAnalysis("*..*...*..*..*..*..*"));
    }

    @Test
    void test5() {
        assertFalse(lineAnalysis("*..*..*..*..*..**..*"));
    }
}
