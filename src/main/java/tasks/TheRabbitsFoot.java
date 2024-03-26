package tasks;

public class TheRabbitsFoot {
    public static String theRabbitsFoot(String s, boolean encode) {
        return encode ? encoder(s) : decoder(s);
    }

    private static String encoder(String defaultString) {
        String withoutSpaces = spaceDeleter(defaultString);
        int n = withoutSpaces.length();

        int sqrt = (int) Math.sqrt(n);
        int numOfLines = sqrt;
        int numOfColumns = sqrt + 1;

        if (numOfColumns * numOfLines < n) {
            numOfLines++;
        }

        char[][] matrix = new char[numOfLines][numOfColumns];
        int sCounter = 0;

        for (int i = 0; i < numOfLines; i++) {
            for (int j = 0; j < numOfColumns; j++) {
                if (sCounter < n) {
                    matrix[i][j] = withoutSpaces.charAt(sCounter++);
                }
            }
        }

        return matrixCollector(matrix, true);
    }

    private static String decoder(String defaultString) {
        String[] strings = defaultString.split(" ");
        char[][] matrix = new char[strings.length][strings[0].length()];

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length(); j++) {
                matrix[i][j] = strings[i].charAt(j);
            }
        }

        return matrixCollector(matrix, false);
    }

    private static String matrixCollector(char[][] matrix, boolean encode) {
        int matrixSize = matrix.length;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < matrixSize; i++) {
            for (char[] chars : matrix) {
                if (chars[i] > Character.MIN_VALUE) {
                    sb.append(chars[i]);
                }
            }

            if (encode && i < matrixSize - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    private static String spaceDeleter(String string) {
        StringBuilder sb = new StringBuilder();

        for (char ch : string.toCharArray()) {
            if (ch != ' ') {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}