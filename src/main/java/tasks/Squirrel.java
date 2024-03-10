package tasks;

public class Squirrel {
    public static int squirrel(int n) {
        if (n == 1) {
            return 1;
        }

        return n * squirrel(n - 1);
    }
}
