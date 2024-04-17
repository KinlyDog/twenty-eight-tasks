package tasks;

import java.util.Arrays;

public class BiggerGreater {
    public static String biggerGreater(String input) {
        char[] chars = input.toCharArray();
        int i = chars.length - 1;
        int j = 0;

        while (i > 0) {
            for (j = i - 1; j >= 0; j--) {
                if (chars[i] > chars[j]) {
                    char ch = chars[i];
                    chars[i] = chars[j];
                    chars[j] = ch;

                    i = -1;
                    break;
                }
            }

            i--;
        }

        if (i > -1) {
            return "";
        }

        Arrays.sort(chars, j + 1, chars.length);

        return new String(chars);
    }
}
