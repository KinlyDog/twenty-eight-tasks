package tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.BastShoe.*;

class BastShoeTest {

    @BeforeEach
    void prepare() {
        string = "";
        list.clear();
        index = -1;
        undo = false;
    }

    @Test
    void addTest() {
        assertEquals("123", bastShoe("1 123"));
    }

    @Test
    void addTest2() {
        bastShoe("1 123");
        assertEquals("123123", bastShoe("1 123"));

    }

    @Test
    void deleteTest() {
        bastShoe("1 123");
        assertEquals("1", bastShoe("2 2"));
    }

    @Test
    void getTest() {
        bastShoe("1 12345");
        assertEquals("4", bastShoe("3 3"));
    }

    @Test
    void undoTest() {
        bastShoe("1 12");
        bastShoe("1 34");
        assertEquals("12", bastShoe("4"));
    }

    @Test
    void doubleUndoTest() {
        bastShoe("1 12");
        bastShoe("1 34");
        bastShoe("1 56");
        bastShoe("4");
        assertEquals("12", bastShoe("4"));
    }

    @Test
    void redoTest() {
        bastShoe("1 12");
        bastShoe("1 34");
        bastShoe("1 56");
        bastShoe("4");
        bastShoe("4");
        bastShoe("4");
        assertEquals("12", bastShoe("5"));
    }

    @Test
    void tripleRedoTest() {
        bastShoe("1 12");
        bastShoe("1 34");
        bastShoe("1 56");
        bastShoe("4");
        bastShoe("4");
        bastShoe("4");
        bastShoe("5");
        bastShoe("5");
        assertEquals("123456", bastShoe("5"));
    }

    @Test
    void checkUndoBufferAfterDeleteTest() {
        bastShoe("1 12");
        bastShoe("1 34");
        bastShoe("1 56");
        bastShoe("4");
        bastShoe("2 3");
        bastShoe("4");
        assertEquals("1234", bastShoe("4"));
    }

    @Test
    void checkRedoBufferAfterDeleteTest() {
        bastShoe("1 12");
        bastShoe("1 34");
        bastShoe("1 56");
        bastShoe("4");
        bastShoe("2 3");
        assertEquals("1", bastShoe("5"));
    }

    @Test
    void checkWrongTask() {
        bastShoe("1 1235");
        assertEquals("1235", bastShoe("9"));
    }

}