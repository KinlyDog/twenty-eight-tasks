package tasks;

public class Keymaker {
    public static String keymaker(int k) {
        int[] doors = new int[k];

        stepOne(doors, k);
        stepTwo(doors, k);

        for (int i = 2; i <= k; i++) {
            stepThree(doors, i, k);
        }

        return arrayToString(doors);
    }

    private static void stepOne(int[] doors, int k) {
        for (int i = 0; i < k; i++) {
            doors[i] = 1;
        }
    }

    private static void stepTwo(int[] doors, int k) {
        for (int i = 1; i < k; i += 2) {
            doors[i] = 0;
        }
    }

    private static void stepThree(int[] doors, int step, int k) {
        for (int i = step; i < k; i += step + 1) {
            doors[i] = doors[i] == 1 ? 0 : 1;
        }
    }

    private static String arrayToString(int[] doors) {
        StringBuilder sb = new StringBuilder();

        for (int i : doors) {
            sb.append(i);
        }

        return sb.toString();
    }
}
