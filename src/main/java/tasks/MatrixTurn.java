package tasks;

public class MatrixTurn {
    public static void matrixTurn(String[] matrix, int numOfLines, int numOfColumns, int rotationStep) {
        int unfoldedMatrixSize = Math.min(numOfLines, numOfColumns) / 2;

        String[] unfoldedMatrix = matrixUnfolding(matrix, numOfLines, numOfColumns, unfoldedMatrixSize);
        rotation(unfoldedMatrix, rotationStep);

        char[][] charMatrix = collapseMatrix(unfoldedMatrix, numOfLines, numOfColumns, unfoldedMatrixSize);

        for (int i = 0; i < charMatrix.length; i++) {
             matrix[i] = new String(charMatrix[i]);
        }
    }

    private static String[] matrixUnfolding(String[] matrix, int numOfLines, int numOfColumns, int unfoldedMatrixSize) {
        String[] unfoldedMatrix = new String[unfoldedMatrixSize];
        int i = 0;

        while (i < unfoldedMatrixSize) {
            StringBuilder sbMain = new StringBuilder();
            StringBuilder sb = new StringBuilder();

            int column = numOfColumns - 1 - i;
            int line = numOfLines - 1 - i;

            sbMain.append(matrix[i].substring(i, column));

            for (int j = i; j < line; j++) {
                sbMain.append(matrix[j].charAt(column));
            }

            sb.append(matrix[line].substring(i + 1, column + 1)).reverse();
            sbMain.append(sb);

            for (int j = line; j > i; j--) {
                sbMain.append(matrix[j].charAt(i));
            }

            unfoldedMatrix[i] = sbMain.toString();
            i++;
        }

        return unfoldedMatrix;
    }

    private static char[][] collapseMatrix(String[] unfoldedMatrix, int numOfLines, int numOfColumns, int size) {
        char[][] charMatrix = new char[numOfLines][numOfColumns];

        int i = 0;

        while (i < size) {
            int posOfChar = 0;

            int column = numOfColumns - 1 - i;
            int line = numOfLines - 1 - i;

            for (int j = i; j < column; j++, posOfChar++) {
                charMatrix[i][j] = unfoldedMatrix[i].charAt(posOfChar);
            }

            for (int j = i; j < line; j++, posOfChar++) {
                charMatrix[j][column] = unfoldedMatrix[i].charAt(posOfChar);
            }

            for (int j = column; j > i; j--, posOfChar++) {
                charMatrix[line][j] = unfoldedMatrix[i].charAt(posOfChar);
            }

            for (int j = line; j > i; j--, posOfChar++) {
                charMatrix[j][i] = unfoldedMatrix[i].charAt(posOfChar);
            }

            i++;
        }

        return charMatrix;
    }

    private static void rotation(String[] strings, int rotationStep) {
        for (int i = 0; i < strings.length; i++) {
            int stringLen = strings[i].length();

            if (rotationStep >= stringLen) {
                rotationStep %= stringLen;
            }

            StringBuilder sb = new StringBuilder();

            sb.append(strings[i].substring(stringLen - rotationStep));
            sb.append(strings[i].substring(0, stringLen - rotationStep));

            strings[i] = sb.toString();
        }
    }
}
