package tasks;

public class BigMinus {
    public static String bigMinus(String s1, String s2) {
        if (s1.equals(s2)) {
            return "0";
        }

        int[] s1num = new int[s1.length()];
        int[] s2num = new int[s2.length()];

        for (int i = 0; i < s1num.length; i++) {
            s1num[i] = Character.getNumericValue(s1.charAt(s1num.length - 1 - i));
        }

        for (int i = 0; i < s2num.length; i++) {
            s2num[i] = Character.getNumericValue(s2.charAt(s2num.length - 1 - i));
        }

        if (!isMaxValue(s1num, s2num)) {
            int[] temp = s1num;

            s1num = s2num;
            s2num = temp;
        }

        for (int i = 0; i < s2num.length; i++) {
            if (s1num[i] >= s2num[i]) {
                s1num[i] -= s2num[i];
                continue;
            }

            s1num[i + 1] -= 1;
            s1num[i] += 10;
            s1num[i] -= s2num[i];
        }

        for (int i = 0; i < s1num.length; i++) {
            if (s1num[i] == -1) {
                s1num[i + 1] -= 1;
                s1num[i] += 10;
            }
        }

        return intToString(s1num);
    }

    private static boolean isMaxValue(int[] s1, int[] s2) {
        if (s1.length > s2.length) {
            return true;
        }

        if (s1.length < s2.length) {
            return false;
        }

        for (int i = s1.length - 1; i > -1; i--) {
            if (s1[i] > s2[i]) {
                return true;
            }

            if (s1[i] < s2[i]) {
                break;
            }
        }

        return false;
    }

    private static String intToString(int[] nums) {
        boolean isZero = true;
        StringBuilder sb = new StringBuilder();

        for (int i = nums.length - 1; i > -1; i--) {
            if (isZero && nums[i] == 0) {
                continue;
            }

            isZero = false;
            sb.append(nums[i]);
        }

        return sb.toString();
    }
}
