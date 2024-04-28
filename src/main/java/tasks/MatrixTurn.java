package tasks;

public class MatrixTurn {
    public static void matrixTurn(String[] matrix, int m, int n, int t) {
        String[] stringMatrix = new String[m / 2];
        int u = 0;

        char[][] chartrix = new char[m][n];

        for (int i = 0; i < m; i++) {
            chartrix[i] = matrix[i].toCharArray();
        }

        while (u < Math.min(m, n) / 2) {
            StringBuilder sb = new StringBuilder();

            int a = matrix[0].length() - 1 - u;
            int b = matrix.length - 1 - u;

            for (int i = 0 + u; i < a; i++) {
                sb.append(matrix[u].charAt(i));
            }

            for (int i = 1 + u; i < b; i++) {
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



        stringMatrix = lineShifter(stringMatrix, t);

        for (int i = 0; i < stringMatrix.length; i++) {
            for (int j = 0; j < stringMatrix[i].length(); j++) {

            }
        }




        System.out.println();
    }

    private static String[] lineShifter(String[] strings, int offsetDistance) {
        String[] offsetLines = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            offsetDistance %= strings[i].length();
            StringBuilder sb = new StringBuilder();

            sb.append(strings[i].substring(offsetDistance));
            sb.append(strings[i].substring(0, offsetDistance));

            offsetLines[i] = sb.toString();
        }

        return offsetLines;
    }
}
