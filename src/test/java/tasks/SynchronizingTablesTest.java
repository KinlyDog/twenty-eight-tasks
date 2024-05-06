package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.SynchronizingTables.*;

class SynchronizingTablesTest {

    @Test
    void test0() {
        int[] employeesId = new int[]{50, 1, 1024};
        int[] employeesSalary = new int[]{20_000, 100_000, 90_000};
        int n = employeesSalary.length;

        int[] salarySorted = {90_000, 20_000, 100_000};

        assertArrayEquals(salarySorted, synchronizingTables(n, employeesId, employeesSalary));
    }

    @Test
    void test1() {
        int[] employeesId = new int[]{1, 10, 100, 1000};
        int[] employeesSalary = new int[]{999_000, 851_000, 100_000, 345_678_999};
        int n = employeesSalary.length;

        int[] salarySorted = {100_000, 851_000, 999_000, 345_678_999};

        assertArrayEquals(salarySorted, synchronizingTables(n, employeesId, employeesSalary));
    }

    @Test
    void test2() {
        int[] employeesId = new int[]{1};
        int[] employeesSalary = new int[]{999_000};
        int n = employeesSalary.length;

        int[] salarySorted = {999_000};

        assertArrayEquals(salarySorted, synchronizingTables(n, employeesId, employeesSalary));
    }
}
