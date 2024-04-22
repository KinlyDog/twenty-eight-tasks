package tasks;

import java.util.HashMap;

public class SherlockValidString {
    public static boolean sherlockValidString(String s) {

        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> charGrouping = new HashMap<>();

            for (int j = 0; j < s.length(); j++) {
                if (i == j) {
                    continue;
                }

                charGrouping.merge(s.charAt(j), 1, Integer::sum);
            }

            if (validationCheck(charGrouping)) {
                return true;
            }
        }

        return false;
    }

    private static boolean validationCheck(HashMap<Character, Integer> charGrouping) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (Integer i : charGrouping.values()) {
            hm.merge(i, 1, Integer::sum);
        }

        return (hm.size() == 1);
    }
}
