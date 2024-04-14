package tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class BastShoe {
    static String string = "";
    static ArrayList<String> list = new ArrayList<>();
    static int index = -1;
    static boolean undo = false;

    public static String bastShoe(String command) {
        String[] instruction = command.split(" ");

        int task = stringToInteger(instruction[0]);

        if (task < 1 && task > 5) {
            return string;
        }

        String argument = instruction.length > 1 ? instruction[1] : "";

        switch (task) {
            case 1:
                return add(argument);
            case 2:
                return delete(argument);
            case 3:
                return get(argument);
            case 4:
                return undo();
            case 5:
                return redo();

        }

        return string;

    }

    private static int stringToInteger(String s) {
        return Integer.parseInt(s);
    }

    private static String add(String s) {
        if (undo) {
            clear();
        }

        string += s;
        list.add(string);
        index++;

        return string;
    }

    private static String delete(String s) {
        if (undo) {
            clear();
        }

        int n = stringToInteger(s);

        if (n > string.length()) {
            string = "";
        } else {
            string = string.substring(0, string.length() - n);
        }

        list.add(string);
        index++;

        return string;
    }

    private static String get(String s) {
        int i = stringToInteger(s);

        if (i >= string.length()) {
            return "";
        }

        return String.valueOf(string.charAt(i));
    }

    private static String undo() {
        if (index <= 0) {
            return string;
        }

        undo = true;

        return string = list.get(--index);
    }

    private static String redo() {
        if (index >= list.size() - 1) {
            return string;
        }

        return string = list.get(++index);
    }

    private static void clear() {
        undo = false;

        list.clear();
        index = 0;
        list.add(string);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println(bastShoe(scan.nextLine()));
        }
    }
}
