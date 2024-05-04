package tasks;

import java.util.Arrays;

public class Football {
    public static boolean football(int[] standart, int n) {
        int[] sorted = Arrays.copyOf(standart, n);
        Arrays.sort(sorted);

        if (Arrays.equals(standart, sorted)) {
            return true;
        }

        return moveSort(standart, sorted, n) || reversalSort(standart, sorted, n);
    }

    private static boolean moveSort(int[] standart, int[] sorted, int n) {
        int difference = 0;

        for (int i = 0; i < n; i++) {
            if (standart[i] != sorted[i]) {
                difference++;
            }
        }

        return difference == 2;
    }

    private static boolean reversalSort(int[] standart, int[] sorted, int n) {
        int[] ma = Arrays.copyOf(standart, n);

        int start = 0;
        int end = 0;

        for (int i = 0; i < n; i++) {
            if (standart[i] != sorted[i]) {
                start = i;
                break;
            }
        }

        for (int i = n - 1; i > -1; i--) {
            if (standart[i] != sorted[i]) {
                end = i;
                break;
            }
        }

        for (int i = 0; i < (end - start) / 2; i++) {
            int temp = ma[start + i];

            ma[start + i] = ma[end - i];
            ma[end - i] = temp;
        }

        return Arrays.equals(ma, sorted);
    }
}
