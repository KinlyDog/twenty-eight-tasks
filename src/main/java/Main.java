import tasks.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        // Ex. 1
        System.out.println(Squirrel.squirrel(5));

        // Ex. 2
        System.out.println(Odometer.odometer(new int[]{10, 1, 20, 5}));

        // Ex. 3
        System.out.println(ConquestCampaign.conquestCampaign(3, 4, 2, new int[]{2, 2, 2, 3}));

        // Ex. 4
        int[] subsequence = new int[]{1, 2, 5, 3, 4, 7, 6, 8, 9};
        int[] subsequenceSorted = MadMax.madMax(subsequence.length, subsequence);

        for (int i : subsequenceSorted) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Ex. 5
        int[] employeesId = new int[]{50, 1, 1024};
        int[] employeesSalary = new int[]{20000, 100000, 90000};

        System.out.println(
                Arrays.toString(SynchronizingTables.synchronizingTables
                        (employeesId.length, employeesId, employeesSalary)));

        // Ex. 6
        int[] numbers = {1, 2, 3, 4, 5, 6, 2, 7, 8, 9};
        int n = numbers.length;

        System.out.println(PatternUnlock.patternUnlock(n, numbers));
         */

        // Ex. 7
        String string = "1) строка разбивается на набор строк через выравнивание по заданной ширине.";
        int[] result = WordSearch.wordSearch(12, string, "строк");

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
