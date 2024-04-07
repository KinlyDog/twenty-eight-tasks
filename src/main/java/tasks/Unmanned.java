package tasks;

public class Unmanned {
    public static int unmanned(int distance, int n, int[][] track) {
        if (n < 1) {
            return distance;
        }

        int trafficLightNum = 0;
        int travelTime = track[0][0];

        int interval = 0;
        for (int i = travelTime; i <= distance; i += interval) {
            travelTime += stopTime(track[trafficLightNum], travelTime);

            if (++trafficLightNum >= n) {
                return travelTime + distance - i;
            }

            interval = track[trafficLightNum][0] - i;
            travelTime += interval;
        }

        return travelTime;
    }

    private static int stopTime(int[] light, int travelTime) {
        int red = light[1];
        int green = light[2];

        int sum = red + green;

        if (travelTime > sum) {
            travelTime %= sum;
        }

        if (travelTime < red) {
            return red - travelTime;
        }

        return 0;
    }
}
