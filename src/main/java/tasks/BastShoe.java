package tasks;

import java.util.ArrayList;

public class BastShoe {
    private static String string = "";
    private static ArrayList<String> list = new ArrayList<>();
    private static int index = -1;
    private static boolean undo = false;

    public static void prepareForTests() {
        BastShoe.string = "";
        BastShoe.list = new ArrayList<>();
        BastShoe.index = -1;
        BastShoe.undo = false;
    }

    public static String bastShoe(String command) {
        if (validationFailed(command)) {
            return "";
        }

        String[] instruction = command.split(" ");
        int task = stringToInteger(instruction[0]);

        if (list.isEmpty()) {
            clearTheList();
        }

        if (task < 1 || task > 5) {
            return string;
        }

        if ((task == 1 || task == 2) && undo) {
            clearTheList();
        }

        String argument = instruction.length > 1 ? instruction[1] : "";

        switch (task) {
            case 1 -> add(argument);
            case 2 -> delete(argument);
            case 3 -> {
                return get(argument);
            }
            case 4 -> undo();
            case 5 -> redo();
        }

        return string;
    }

    private static boolean validationFailed(String s) {
        return s.isEmpty() || s.charAt(0) < 48 || s.charAt(0) > 57;
    }

    private static int stringToInteger(String s) {
        return Integer.parseInt(s);
    }

    private static void add(String s) {
        string += s;
        list.add(string);
        index++;
    }

    private static void delete(String s) {
        int n = stringToInteger(s);

        if (n > string.length()) {
            n = string.length();
        }

        string = string.substring(0, string.length() - n);

        list.add(string);
        index++;
    }

    private static String get(String s) {
        int i = stringToInteger(s);

        return i >= string.length() ? "" : string.charAt(i) + "";
    }

    private static void undo() {
        if (index > 0) {
            undo = true;
            string = list.get(--index);
        }
    }

    private static void redo() {
        if (index < list.size() - 1) {
            string = list.get(++index);
        }
    }

    private static void clearTheList() {
        undo = false;

        list.clear();
        index = 0;
        list.add(string);
    }
}
