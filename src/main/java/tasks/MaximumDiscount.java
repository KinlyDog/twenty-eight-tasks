package tasks;

import java.util.Arrays;

public class MaximumDiscount {
    public static int maximumDiscount(int n, int[] price) {
        if (n < 3) {
            return 0;
        }

        int[] priceAscending = Arrays.copyOf(price, price.length);
        Arrays.sort(priceAscending);

        int benefit = 0;

        for (int i = n - 3; i >= 0; i -= 3) {
            benefit += priceAscending[i];
        }

        return benefit;
    }
}
