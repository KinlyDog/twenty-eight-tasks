package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.BigMinus.*;

class BigMinusTest {

    @Test
    void test0() {
        String firstNumber = "12345";
        String secondNumber = "5";
        String expectedNumber = "12340";


        assertEquals("12340", bigMinus(firstNumber, secondNumber));
    }

    @Test
    void test1() {
        String firstNumber = "123456789123456789123456789123456789123456789";
        String secondNumber = "100000123456789123456789123456789123456789123456789";
        String expectedNumber = "100000000000000000000000000000000000000000000000000";

        assertEquals(expectedNumber, bigMinus(firstNumber, secondNumber));
    }

    @Test
    void test2() {
        String firstNumber = "5";
        String secondNumber = "0";
        String expectedNumber = "5";

        assertEquals(expectedNumber, bigMinus(firstNumber, secondNumber));
    }
}
