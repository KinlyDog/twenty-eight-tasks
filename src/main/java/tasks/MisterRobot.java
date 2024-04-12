package tasks;

import java.util.Arrays;

public class MisterRobot {
    public static boolean misterRobot(int n, int[] data) {
        if (n < 5) {
            return false;
        }

        int[] sData = Arrays.copyOf(data, n);

        while (rotation(sData)) {
            // works as long as array rotation is active
        }

        return arrayCheck(sData);
    }

    private static boolean rotation(int[] array) {
        boolean isSorting = false;

        for (int i = 1; i < array.length - 1; i++) {
            while (array[i - 1] > array[i] || array[i - 1] > array[i + 1]) {
                int a = array[i - 1];

                array[i - 1] = array[i];
                array[i] = array[i + 1];
                array[i + 1] = a;

                isSorting = true;
            }
        }

        return isSorting;
    }

    private static boolean arrayCheck(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i + 1) {
                return false;
            }
        }

        return true;
    }
}
