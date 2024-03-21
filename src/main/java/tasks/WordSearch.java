package tasks;

import java.util.ArrayList;
import java.util.List;

public class WordSearch {
    public static int[] wordSearch(int len, String string, String keyword) {
        ArrayList<String> wordsOfString = new ArrayList<>(List.of(string.split(" ")));

        for (int i = 0; i < wordsOfString.size(); i++) {
            if (wordsOfString.get(i).length() > len) {
                insertInList(wordsOfString, i, len);
            }
        }

        ArrayList<String> strings = new ArrayList<>();
        StringBuilder wordStorage = new StringBuilder();

        for (String s : wordsOfString) {
            if (wordStorage.isEmpty()) {
                wordStorage.append(s);
                continue;
            }

            if (s.length() + wordStorage.length() < len) {
                wordStorage.append(" ").append(s);
            } else {
                strings.add(wordStorage.toString());
                wordStorage.delete(0, wordStorage.length());
                wordStorage.append(s);
            }
        }

        strings.add(wordStorage.toString());

        return keyChecker(strings, keyword);
    }

    private static String splitter(String string, int len) {
        StringBuilder split = new StringBuilder(string);

        for (int i = len; i < split.length(); i += len + 1) {
            split.insert(i, " ");
        }

        return split.toString();
    }

    private static void insertInList(ArrayList<String> list, int i, int len) {
        String[] wordsOfString = splitter(list.get(i), len).split(" ");
        list.remove(i);

        for (String word : wordsOfString) {
            list.add(i++, word);
        }
    }

    private static int[] keyChecker(ArrayList<String> strings, String keyWord) {
        int[] zeroOne = new int[strings.size()];

        for (int i = 0; i < strings.size(); i++) {
            String st = strings.get(i);

            if (!st.contains(keyWord)) {
                continue;
            }

            boolean full = st.equals(keyWord);
            boolean start = st.indexOf(keyWord + " ") == 0;
            boolean mid = st.contains(" " + keyWord + " ");
            boolean end = st.lastIndexOf(" " + keyWord) == (st.length() - keyWord.length() - 1);

            if (full || start || mid || end) {
                zeroOne[i] = 1;
            }
        }

        return zeroOne;
    }
}
