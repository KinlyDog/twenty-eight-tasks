package tasks;

import java.util.ArrayList;

public class TransformTransform {
    public static boolean transformTransform(int[] a, int n) {
        ArrayList<Integer> b = new ArrayList<>();

        for (int i : a) {
            b.add(i);
        }

        b = transform(b, b.size());
        b = transform(b, b.size());

        int sum = 0;

        for (int i : b) {
            sum += i;
        }

        return sum % 2 == 0;
    }

    private static ArrayList<Integer> transform(ArrayList<Integer> a, int n) {
        ArrayList<Integer> b = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                int k = i + j;
                int max = 0;

                for (int t = j; t <= k; t++) {
                    if (a.get(t) > max) {
                        max = a.get(t);
                    }
                }

                b.add(max);
            }
        }

        return b;
    }
}
