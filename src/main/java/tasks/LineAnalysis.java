package tasks;

public class LineAnalysis {
    public static boolean lineAnalysis(String line) {
        for (int i = 0; i < line.length() / 2; i++) {
            if (line.charAt(i) != line.charAt(line.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
