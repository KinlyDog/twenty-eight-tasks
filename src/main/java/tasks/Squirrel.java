package tasks;

public class Squirrel {
    public static long squirrel(int n) {

        return String
                .valueOf(factorial(n))
                .charAt(0);
    }

    public static long factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * squirrel(n - 1);
    }
}
