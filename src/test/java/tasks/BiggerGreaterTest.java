package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.BiggerGreater.*;

class BiggerGreaterTest {

    @Test
    void defaultTest0() {
        assertEquals("яа", biggerGreater("ая"));
    }

    @Test
    void defaultTest1() {
        assertEquals("", biggerGreater("fff"));
    }

    @Test
    void defaultTest2() {
        assertEquals("нкмл", biggerGreater("нклм"));
    }

    @Test
    void defaultTest3() {
        assertEquals("ибвк", biggerGreater("вкиб"));
    }

}