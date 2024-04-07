package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.Unmanned.unmanned;

import tasks.Unmanned;

class UnmannedTest {

    @Test
    void test0() {
        int track = 10;
        int count = 1;
        int[][] tl = {
                {3, 3, 3}
        };

        assertEquals(10, unmanned(track, count, tl));
    }


    @Test
    void test1() {
        int track = 10;
        int count = 2;
        int[][] tl = {
                {3, 5, 5},
                {5, 2, 2}
        };

        assertEquals(12, unmanned(track, count, tl));
    }

    @Test
    void test2() {
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
    void test3() {
        int track = 10;
        int count = 1;
        int[][] tl = {
                {5, 2, 2}
        };

        assertEquals(11, unmanned(track, count, tl));
    }

    void test4() {
        int track = 10;
        int count = 5;
        int[][] tl = {
                {3, 5, 5},
                {5, 2, 2},
                {7, 2, 2},
                {8, 3, 2}
        };

        assertEquals(14, unmanned(track, count, tl));
    }
}