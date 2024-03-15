package tasks;

public class PatternUnlock {
    public static String patternUnlock(int n, int[] hits) {

        String defaultSeq = "619528437";
        StringBuilder correctSeq = new StringBuilder();

        for (int hit : hits) {
            for (int j = 0; j < defaultSeq.length(); j++) {
                if (String.valueOf(hit).equals(defaultSeq.charAt(j))) {
                    correctSeq.append(j);
                    break;
                }
            }
        }

        double digitalCode = 0;

        for (int i = 1; i < correctSeq.length(); i++) {
            int line = correctSeq.charAt(i - 1) + correctSeq.charAt(i);

            if (line % 2 == 0) {
                digitalCode += Math.sqrt(2);
            } else {
                digitalCode += 1;
            }
        }

        int modifiedCode = (int)Math.round(digitalCode * 100000);
        StringBuilder withoutZero = new StringBuilder(String.valueOf(modifiedCode));

        for (int i = 0; i < withoutZero.length(); i++) {
            if (withoutZero.charAt(i) == '0') {
                withoutZero.deleteCharAt(i);
            }
        }

        return withoutZero.toString();
    }
}
