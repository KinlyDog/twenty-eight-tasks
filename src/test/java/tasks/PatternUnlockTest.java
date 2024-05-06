package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.PatternUnlock.*;

class PatternUnlockTest {

    @Test
    void test0() {
        int[] hits = {1, 2, 3, 4, 5, 6, 2, 7, 8, 9};
        int n = hits.length;

        assertEquals("982843", patternUnlock(n, hits));
    }

    @Test
    void test1() {
        int[] hits = {9, 8, 7, 3, 2, 1, 6, 5, 4};
        int n = hits.length;

        assertEquals("8", patternUnlock(n, hits));
    }

    @Test
    void test2() {
        int[] hits = {6, 2, 7, 8, 9};
        int n = hits.length;

        assertEquals("482843", patternUnlock(n, hits));
    }
}
