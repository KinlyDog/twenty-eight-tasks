package tasks;

import java.util.Arrays;

public class MisterRobot {
    public static boolean misterRobot(int n, int[] data) {
        if (n < 1) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        int[] sData = Arrays.copyOf(data, n);
        rotation(sData, true);

        return isSortedAcsending(sData);
    }

    private static int[] rotation(int[] array, boolean isSorting) {
        if (!isSorting) {
            return array;
        }

        isSorting = false;

        for (int i = 1; i < array.length - 1; i++) {
            while (array[i - 1] > array[i] || array[i - 1] > array[i + 1]) {
                int a = array[i - 1];

                array[i - 1] = array[i];
                array[i] = array[i + 1];
                array[i + 1] = a;

                isSorting = true;
            }
        }

        return rotation(array, isSorting);
    }

    private static boolean isSortedAcsending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i + 1) {
                return false;
            }
        }

        return true;
    }
}
