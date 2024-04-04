package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.UFO.*;

class UFOTest {
    int[] original;
    int n;

    UFOTest() {
        original = new int[]{1234, 1777};
        n = original.length;
    }

    @Test
    void octToDec() {
        int[] dec = {668, 1023};
        int[] ma = UFO(n, original, true);

        assertArrayEquals(ma, dec);
    }

    @Test
    void hexToDec() {
        int[] hex = {4660, 6007};
        int[] ma = UFO(n, original, false);

        assertArrayEquals(ma, hex);
    }

}