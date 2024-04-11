package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.TankRush.*;

class TankRushTest {

    @Test
    void defaultTest() {
        assertTrue(tankRush(3, 4, "1234 2345 0987", 2, 2, "34 98"));
    }

    @Test
    void difficultConditionTest() {
        assertTrue(tankRush(3, 6, "123434 234598 0987", 2, 2, "34 98"));
    }

    @Test
    void smallerThanTest() {
        assertFalse(tankRush(2, 2, "123434 234598 0987", 3, 3, "34 98"));
    }
}