package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.TreeOfLife.*;

class TreeOfLifeTest {


    @Test
    void test() {
        treeOfLife(3, 4, 12, new String[]{".+..", "..+.", ".+.."});
    }

}