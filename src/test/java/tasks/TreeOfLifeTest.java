package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.TreeOfLife.*;

class TreeOfLifeTest {


    @Test
    void test0() {
        String[] st = {".+..", "..+.", ".+.."};

        assertArrayEquals(st, treeOfLife(3, 4, 4, new String[]{".+..", "..+.", ".+.."}));
    }

    @Test
    void test1() {
        String[] st = {"++++", "++++", "++++"};

        assertArrayEquals(st, treeOfLife(3, 4, 1, new String[]{".+..", "..+.", ".+.."}));
    }

    @Test
    void test2() {
        String[] st = {".+..", "..+.", ".+.."};

        assertArrayEquals(st, treeOfLife(3, 4, 0, new String[]{".+..", "..+.", ".+.."}));
    }
}