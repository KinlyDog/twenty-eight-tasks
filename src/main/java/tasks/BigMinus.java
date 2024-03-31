package tasks;

public class BigMinus {
    public static String bigMinus(String s1, String s2) {
        if (s1.equals(s2)) {
            return "0";
        }

        int[] minuend = reverseStringInDigit(s1);
        int[] subtrahend = reverseStringInDigit(s2);

        if (!isMaxValue(minuend, subtrahend)) {
            int[] temp = minuend;

            minuend = subtrahend;
            subtrahend = temp;
        }

        for (int i = 0; i < subtrahend.length; i++) {
            if (minuend[i] < subtrahend[i]) {
                minuend[i + 1] -= 1;
                minuend[i] += 10;
            }

            minuend[i] -= subtrahend[i];
        }

        for (int i = 0; i < minuend.length; i++) {
            if (minuend[i] == -1) {
                minuend[i + 1] -= 1;
                minuend[i] += 10;
            }
        }

        return toString(minuend);
    }

    private static int[] reverseStringInDigit(String string) {
        int[] array = new int[string.length()];

        for (int i = 0; i < array.length; i++) {
            array[i] = Character.getNumericValue(string.charAt(array.length - 1 - i));
        }

        return array;
    }

    private static boolean isMaxValue(int[] minuend, int[] subtrahend) {
        if (minuend.length > subtrahend.length) {
            return true;
        }

        if (minuend.length < subtrahend.length) {
            return false;
        }

        for (int i = minuend.length - 1; i > -1; i--) {
            if (minuend[i] > subtrahend[i]) {
                return true;
            }

            if (minuend[i] < subtrahend[i]) {
                break;
            }
        }

        return false;
    }

    private static String toString(int[] minuend) {
        boolean isZero = true;
        StringBuilder sb = new StringBuilder();

        for (int i = minuend.length - 1; i > -1; i--) {
            if (isZero && minuend[i] == 0) {
                continue;
            }

            isZero = false;
            sb.append(minuend[i]);
        }

        return sb.toString();
    }
}
