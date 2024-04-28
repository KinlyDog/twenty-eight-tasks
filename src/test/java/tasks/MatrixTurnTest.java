package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.MatrixTurn.*;

class MatrixTurnTest {

    @Test
    void test0() {
        String[] defaultMatrix = {"123456", "234567", "345678", "456789"};
        String[] turning = {"432123, 565434, 676545, 789876"};

        matrixTurn(defaultMatrix, 4, 6, 8);

        assertArrayEquals(turning, defaultMatrix);
    }

//    @Test
//    void test1() {
//        String[] defaultMatrix = {"123456", "234567", "345678", "456789"};
//        String[] turning = {"212345, 343456, 456767, 567898"};
//
//        matrixTurn(defaultMatrix, 4, 6, 1);
//
//        assertArrayEquals(turning, defaultMatrix);
//    }
}