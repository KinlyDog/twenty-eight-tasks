package tasks;

public class SumOfThe {
    public static int sumOfThe(int n, int[] data) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = 0;

            for (int j = 0; j < n; j++) {
                if (j != i) {
                    sum += data[j];
                }
            }

            if (sum == data[i]) {
                break;
            }
        }

        return sum;
    }
}
