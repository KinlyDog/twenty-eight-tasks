package tasks;

import java.util.Arrays;

public class MadMax {
    public static int[] madMax(int n, int[] tele) {
        int[] impulse = Arrays.copyOf(tele, n);

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < n - 1; i++) {
                if (impulse[i] > impulse[i + 1]) {
                    int change = impulse[i];

                    impulse[i] = impulse[i + 1];
                    impulse[i + 1] = change;

                    isSorted = false;
                }
            }
        }

        for (int i = 0; i < n / 3; i++) {
            int change = impulse[n / 2 + i];

            impulse[n / 2 + i] = impulse[n - 1 - i];
            impulse[n - 1 - i] = change;
        }

        return impulse;
    }
}
