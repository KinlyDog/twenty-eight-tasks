package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.Unmanned.unmanned;

class UnmannedTest {
    @Test
    void oneTrafficLight() {
        int track = 10;
        int count = 1;
        int[][] tl = {
                {3, 3, 3}
        };

        assertEquals(10, unmanned(track, count, tl));
    }

    @Test
    void oneTrafficLight2() {
        int track = 10;
        int count = 1;
        int[][] tl = {
                {5, 2, 2}
        };

        assertEquals(11, unmanned(track, count, tl));
    }

    @Test
    void twoTrafficLight() {
        int track = 10;
        int count = 2;
        int[][] tl = {
                {3, 5, 5},
                {5, 2, 2}
        };

        assertEquals(12, unmanned(track, count, tl));
    }

    @Test
    void threeTrafficLight() {
        int track = 10;
        int count = 3;
        int[][] tl = {
                {3, 5, 5},
                {5, 2, 2},
                {7, 2, 2}
        };

        assertEquals(13, unmanned(track, count, tl));
    }

    @Test
    void fourTrafficLight() {
        int track = 10;
        int count = 4;
        int[][] tl = {
                {3, 5, 5},
                {5, 2, 2},
                {7, 2, 2},
                {8, 3, 2}
        };

        assertEquals(15, unmanned(track, count, tl));
    }

    @Test
    void zeroTrafficLight() {
        int track = 10;
        int count = 0;
        int[][] tl = new int[0][0];

        assertEquals(10, unmanned(track, count, tl));
    }

    @Test
    void zeroTrafficLightFalse() {
        int track = Integer.MAX_VALUE;
        int count = 0;
        int[][] tl = new int[0][0];

        assertNotEquals(0, unmanned(track, count, tl));
    }
}