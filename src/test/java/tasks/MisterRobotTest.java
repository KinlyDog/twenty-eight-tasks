package tasks;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.MisterRobot.*;

class MisterRobotTest {

    @Test
    void defaultTest() {
        assertTrue(misterRobot(7, new int[] {1, 3, 4, 5, 6, 2, 7}));
    }

    @Test
    void zeroTest() {
        assertFalse(misterRobot(0, new int[] {}));
    }

    @Test
    void outOfOrderTest() {
        assertFalse(misterRobot(7, new int[] {1, 3, 4, 5, 9, 2, 7}));
    }

    @Test
    void falseTest() {
        assertFalse(misterRobot(4, new int[] {1, 3, 2, 4}));
    }

    @Test
    void megaTest() {
        Random rand = new Random();

        int len = 100_00;

        int[] array = new int [len];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(len) + 1;
        }
        assertFalse(misterRobot(array.length, array));
    }
}
