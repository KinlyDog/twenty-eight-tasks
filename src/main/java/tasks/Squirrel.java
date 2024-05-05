package tasks;

public class Squirrel {
    public static int squirrel(int n) {
        return Character.getNumericValue(String.valueOf(factorial(n)).charAt(0));
    }

    private static long factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
