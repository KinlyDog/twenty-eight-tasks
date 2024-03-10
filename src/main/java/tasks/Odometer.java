package tasks;

public class Odometer {
    public static int odometer(int[] oksana) {
        int distance = oksana[0] * oksana[1];

        for (int i = 2; i < oksana.length; i += 2) {
            distance += oksana[i] * (oksana[i + 1] - oksana[i - 1]);
        }

        return distance;
    }
}
