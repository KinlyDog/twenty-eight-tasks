package tasks;

import java.util.Arrays;

public class UFO {
    public static int[] UFO(int n, int[] data, boolean octal) {
        int[] copyOfData = Arrays.copyOf(data, n);
        int degreeOf = octal ? 8 : 16;

        for (int i = 0; i < n; i++) {
            int decimal = 0;
            int numLen = String.valueOf(data[i]).length();

            for (int j = 0; j < numLen; j++) {
                int oneDigit = copyOfData[i] % 10;
                copyOfData[i] /= 10;

                decimal += oneDigit * Math.pow(degreeOf, j);
            }

            copyOfData[i] = decimal;
        }

        return copyOfData;
    }
}
