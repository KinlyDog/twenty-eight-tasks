package tasks;

public class Unmanned {
    public static int unmanned(int distance, int n, int[][] track) {
        if (n < 1) {
            return distance;
        }

        int trafficLightNum = 0;
        int interval = track[0][0];
        int travelTime = interval;

        for (int i = interval; i <= distance; i += interval) {
            travelTime += stopTime(track[trafficLightNum], travelTime);

            if (++trafficLightNum >= n) {
                return travelTime + distance - i;
            }

            interval = track[trafficLightNum][0] - i;
            travelTime += interval;
        }

        return travelTime;
    }

    private static int stopTime(int[] trafficLight, int travelTime) {
        int redTime = trafficLight[1];
        int greenTime = trafficLight[2];

        int fullTime = redTime + greenTime;

        if (travelTime > fullTime) {
            travelTime %= fullTime;
        }

        if (travelTime < redTime) {
            return redTime - travelTime;
        }

        return 0;
    }
}
