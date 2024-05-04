package tasks;

import java.util.ArrayList;

public class WhiteWalkers {
    public static boolean whiteWalkers(String village) {
        if (village.length() < 5) {
            return false;
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < village.length(); i++) {
            char symbol = village.charAt(i);

            if (symbol > 48 && symbol < 58) {
                numbers.add(Character.getNumericValue(symbol));
                indexes.add(i);
            }
        }

        boolean walkers = false;

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) + numbers.get(i + 1) != 10) {
                continue;
            }

            if (!walkersCheck(village.substring(indexes.get(i) + 1, indexes.get(i + 1)))) {
                return false;
            }

            walkers = true;
        }

        return walkers;
    }

    private static boolean walkersCheck(String string) {
        if (string.length() < 3) {
            return false;
        }

        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 61) {
                count++;
            }
        }

        return count == 3;
    }
}
