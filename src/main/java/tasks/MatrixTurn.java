package tasks;

public class MatrixTurn {
    public static void matrixTurn(String[] matrix, int m, int n, int t) {
        String[] stringMatrix = new String[m / 2];

        stringMatrix = matrixToString(matrix, m, n, stringMatrix);
        stringMatrix = lineShifter(stringMatrix, t);

        char[][] chartrix = replaceMatrix(stringMatrix, m, n);

        for (int i = 0; i < chartrix.length; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < chartrix[i].length; j++) {
                sb.append(chartrix[i][j]);
            }

            matrix[i] = sb.toString();
        }
    }

    private static char[][] replaceMatrix(String[] stringMatrix, int m, int n) {
        char[][] chartrix = new char[m][n];

        int u = 0;

        while (u < Math.min(m, n) / 2) {
            int ind = 0;

            int a = n - 1 - u;
            int b = m - 1 - u;

            for (int i = 0 + u; i < a; i++, ind++) {
                chartrix[u][i] = stringMatrix[u].charAt(ind);
            }

            for (int i = 0 + u; i < b; i++, ind++) {
                chartrix[i][a] = stringMatrix[u].charAt(ind);
            }

            for (int i = a; i > 0 + u; i--, ind++) {
                chartrix[b][i] = stringMatrix[u].charAt(ind);
            }

            for (int i = b; i > 0 + u; i--, ind++) {
                chartrix[i][u] = stringMatrix[u].charAt(ind);
            }

            u++;
        }

        return chartrix;
    }

    private static String[] matrixToString(String[] matrix, int m, int n, String[] stringMatrix) {
        int u = 0;

        while (u < Math.min(m, n) / 2) {
            StringBuilder sb = new StringBuilder();

            int a = matrix[0].length() - 1 - u;
            int b = matrix.length - 1 - u;

            for (int i = 0 + u; i < a; i++) {
                sb.append(matrix[u].charAt(i));
            }

            for (int i = 0 + u; i < b; i++) {
                sb.append(matrix[i].charAt(a));
            }

            for (int i = a; i > 0 + u; i--) {
                sb.append(matrix[b].charAt(i));
            }

            for (int i = b; i > 0 + u; i--) {
                sb.append(matrix[i].charAt(u));
            }

            stringMatrix[u] = sb.toString();
            u++;
        }

        return stringMatrix;
    }

    private static String[] lineShifter(String[] strings, int offsetDistance) {
        String[] offsetLines = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            int stringLen = strings[i].length();

            if (offsetDistance >= stringLen) {
                offsetDistance %= stringLen;
            }

            StringBuilder sb = new StringBuilder();

            sb.append(strings[i].substring(stringLen - offsetDistance));
            sb.append(strings[i].substring(0, stringLen - offsetDistance));

            offsetLines[i] = sb.toString();
        }

        return offsetLines;
    }
}
