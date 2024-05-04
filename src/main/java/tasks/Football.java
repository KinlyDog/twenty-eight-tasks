package tasks;

import java.util.Arrays;

public class Football {
    public static boolean football(int[] source, int n) {
        int[] sorted = Arrays.copyOf(source, n);
        Arrays.sort(sorted);

        if (Arrays.equals(source, sorted)) {
            return true;
        }

        return moveSort(source, sorted, n) || reversalSort(source, sorted, n);
    }

    private static boolean moveSort(int[] source, int[] sorted, int n) {
        int difference = 0;

        for (int i = 0; i < n; i++) {
            if (source[i] != sorted[i]) {
                difference++;
            }
        }

        return difference == 2;
    }

    private static boolean reversalSort(int[] source, int[] sorted, int n) {
        int[] copyOfSource = Arrays.copyOf(source, n);

        int start = 0;
        int end = 0;

        for (int i = 0; i < n; i++) {
            if (source[i] != sorted[i]) {
                start = i;
                break;
            }
        }

        for (int i = n - 1; i > -1; i--) {
            if (source[i] != sorted[i]) {
                end = i;
                break;
            }
        }

        reverseArray(source, start, end);

        return Arrays.equals(copyOfSource, sorted);
    }

    private static void reverseArray(int[] source, int start, int end) {
        for (int i = 0; i < (end - start) / 2; i++) {
            int temp = source[start + i];

            source[start + i] = source[end - i];
            source[end - i] = temp;
        }
    }
}
