package tasks;

public class Unmanned {
        public static int unmanned(int l, int n, int[][] track) {
        int travelTime = track[0][0];
        int light = 0;

        for (int i = travelTime; i <= l; i++) {
            if (light < n && i == track[light][0]) {
                travelTime += stopTime(track[light], travelTime);
                light++;
            }

            if (light < n) {
                travelTime += track[light][0] - i;
                i += track[light][0] - i - 1;
                continue;
            }

            return travelTime + l - i;
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

//    public static int unmanned(int l, int n, int[][] track) {
//        int travelTime = 0;
//        int light = 0;
//
//        for (int i = 1; i <= l; i++) {
//            travelTime++;
//
//            if (i == track[light][0]) {
//                travelTime += getStopTime(travelTime, track[light][1], track[light][2]);
//                light = light < n - 1 ? light++ : light;
//            }
//        }
//
//        return travelTime;
//    }
//
//    private static int getStopTime(int time, int red, int green) {
//        int sum = red + green;
//
//        if (time > sum) {
//            time %= sum;
//        }
//
//        if (time < red) {
//            return red - time;
//        }
//
//        return 0;
//    }
}
