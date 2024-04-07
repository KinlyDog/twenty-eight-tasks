import tasks.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

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


        // Ex. 7
        String string = "1) строка разбивается на набор строк через выравнивание по заданной ширине.";
        int[] result = WordSearch.wordSearch(12, string, "строк");

        for (int i : result) {
            System.out.print(i + " ");
        }



        // Ex. 8
        int[] ma = {5, -25, 10, -35, -45};
        int n = ma.length;

        System.out.println(SumOfThe.sumOfThe(n, ma));
        */

//        // Ex. 9
//        String st = "отдай мою кроличью лапку";
//        String st2 = "омоюу толл дюиа акчп йрьк";
//        System.out.println(TheRabbitsFoot.theRabbitsFood(st, true));
//        System.out.println(TheRabbitsFoot.theRabbitsFood(st2, false));

        // Ex. 3 TEST
        System.out.println("new version");
        long sTime1 = System.currentTimeMillis();
        System.out.println(ConquestCampaign.conquestCampaign(4, 4, 1, new int[]{2, 2}));
        long fTime1 = System.currentTimeMillis() - sTime1;
        System.out.println(fTime1);

        // Ex. 10
        PrintingCosts.printingCosts("123");

        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(1);

        System.out.println(Arrays.toString(hs.toArray()));
    }
}
