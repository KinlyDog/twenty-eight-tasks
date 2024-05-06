package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.WordSearch.*;

class WordSearchTest {
    String string;

    WordSearchTest() {
        string = "1) строка разбивается на набор строк через выравнивание по заданной ширине.";
    }

    @Test
    void test0() {
        int layoutWidth = 12;
        String testWord = "строк";

        int[] result = {0, 0, 0, 1, 0, 0, 0};

        assertArrayEquals(result, wordSearch(layoutWidth, string, testWord));
    }

    @Test
    void test1() {
        int layoutWidth = 6;
        String testWord = "по";

        int[] result = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0};

        assertArrayEquals(result, wordSearch(layoutWidth, string, testWord));
    }

    @Test
    void test2() {
        int layoutWidth = 21;
        String testWord = "строк через";

        int[] result = {0, 1, 0, 0};

        assertArrayEquals(result, wordSearch(layoutWidth, string, testWord));
    }
}
