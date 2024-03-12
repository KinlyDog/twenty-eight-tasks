import tasks.*;

public class Main {
    public static void main(String[] args) {
        // Ex. 1
        System.out.println(Squirrel.squirrel(5));

        // Ex. 2
        System.out.println(Odometer.odometer(new int[]{10, 1, 20, 5}));

        // Ex. 3
        System.out.println(ConquestCampaign.conquestCampaign(3, 4, 2, new int[]{2, 2, 2, 3}));

        // Ex. 4
        int[] subsequence = new int[] {1, 2, 5, 3, 4, 7, 6, 8, 9};
        int[] subsequenceSorted = MadMax.madMax(subsequence.length, subsequence);

        for (int i : subsequenceSorted) {
            System.out.print(i + " ");
        }
    }
}
