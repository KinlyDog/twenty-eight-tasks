package tasks;

import java.util.ArrayList;
import java.util.Collection;
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

            if (validationCheck(charGrouping.values())) {
                return true;
            }
        }

        return false;
    }

    private static boolean validationCheck(Collection<Integer> collection) {
        ArrayList<Integer> list = new ArrayList<>(collection);

        for (int i = 0; i < list.size() - 1; i++) {
            if (!list.get(i).equals(list.get(i + 1))) {
                return false;
            }
        }

        return true;
    }
}
