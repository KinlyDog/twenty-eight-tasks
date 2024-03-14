package tasks;

import java.util.Arrays;

public class PatternUnlock {
    public static String patternUnlock(int n, int[] hits) {

        int[][] rightTab = new int[3][3];
        int x = 1;

        for (int i = 0; i < rightTab.length; i++) {
            for (int j = 0; j < rightTab.length; j++) {
                rightTab[i][j] = x++;
            }
        }


        int[][] sourceTab = new int[3][3];

        int one = 6;
        int three = 9;

        for (int i = 0; i < sourceTab.length; i++) {
            for (int j = 0; j < sourceTab.length; j++) {
                if (j == 0) {
                    sourceTab[i][j] = one--;
                }

                if (j == 1) {
                    sourceTab[i][j] = i + 1;
                }

                if (j == 2) {
                    sourceTab[i][j] = three--;
                }
            }
        }

        int pos = 0;

        StringBuilder builder = new StringBuilder();

        boolean flag;

        while (pos < n) {
            flag = true;

            for (int i = 0; i < sourceTab.length; i++) {
                for (int j = 0; j < sourceTab.length; j++) {
                    if (sourceTab[i][j] == hits[pos]) {
                        builder.append(rightTab[i][j]);
                        pos++;
                        flag = false;
                        break;
                    }
                }

                if (!flag) {
                    break;
                }
            }
        }

        char[] newUnlockCode = builder.toString().toCharArray();

        double result = 0;

        final double SIDE = 1;
        final double DIAGONAL = Math.sqrt(SIDE + SIDE);

        for (int i = 0; i < n - 1; i++) {
            int first = Character.getNumericValue(newUnlockCode[i]);
            int second = Character.getNumericValue(newUnlockCode[i + 1]);

            if ((first + second) % 2 == 0) {
                result += DIAGONAL;
            } else {
                result += SIDE;
            }
        }

        double tmp = result * 100000;

        int lol = (int)Math.round(tmp);
        String st = String.valueOf(lol);

        StringBuilder bld2 = new StringBuilder();

        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) != '0') {
                bld2.append(st.charAt(i));
            }
        }

        return bld2.toString();
    }
}
