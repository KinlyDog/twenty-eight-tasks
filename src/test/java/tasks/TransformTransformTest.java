package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.TransformTransform.*;

class TransformTransformTest {

    @Test
    void test0() {
        int[] a = {1, 2, 3, 4, 5, 6};
        int n = a.length;

        assertTrue(transformTransform(a, n));
    }

    @Test
    void test1() {
        int[] a = {562, 123, 3, 3234, 5432, 43, 32, 45, 412};
        int n = a.length;

        assertFalse(transformTransform(a, n));
    }
}
