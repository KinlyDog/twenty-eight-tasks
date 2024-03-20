package tasks;

import java.util.ArrayList;
import java.util.List;

public class WordSearch {
    public static int[] wordSearch(int len, String s, String subs) {
        // 1. Разбиваем строку на отдельные слова,
        // а также слова выходящие за пределы необходимой длины.
        // Получаем список слов нужной длины.
        ArrayList<String> wordsOfString = new ArrayList<>(List.of(s.split(" ")));

        for (int i = 0; i < wordsOfString.size(); i++) {
            if (wordsOfString.get(i).length() > len) {
                insertInList(wordsOfString, i, len);
            }
        }

        // 2. Компонуем массив строк исходя из указанной длины
        ArrayList<String> stringList = new ArrayList<>();
        StringBuilder wordStorage = new StringBuilder();

        for (String string : wordsOfString) {
            if (wordStorage.isEmpty()) {
                wordStorage.append(string);
                continue;
            }

            if (string.length() + wordStorage.length() <= len - 1) {
                wordStorage.append(" ").append(string);
            } else {
                stringList.add(wordStorage.toString());
                wordStorage.delete(0, wordStorage.length());
                wordStorage.append(string);
            }

            if (string.equals(wordsOfString.getLast())) {
                stringList.add(wordStorage.toString());
            }
        }

        return keyCheker(stringList, subs, stringList.size());
    }

    private static String splitter(String string, int len) {
        StringBuilder sb = new StringBuilder(string);

        for (int i = len; i < sb.length(); i += len) {
            sb.insert(i++, " ");
        }

        return sb.toString();
    }

    private static void insertInList(ArrayList<String> list, int i, int len) {
        String[] wordsOfString = splitter(list.get(i), len).split(" ");
        list.remove(i);

        for (String word : wordsOfString) {
            list.add(i++, word);
        }
    }

    private static int[] keyCheker(ArrayList<String> strings, String subs, int len) {
        int[] zeroOne = new int[len];

        for (int i = 0; i < len; i++) {
            int indexOf = strings.get(i).indexOf(subs);
            int lastIndexOF = strings.get(i).lastIndexOf(subs);
            String st = strings.get(i);
            int stLen = st.length();

            if (!st.contains(subs)) {
                continue;
            }

            // вся строка искомое слово
            if (st.equals(subs)) {
                zeroOne[i] = 1;
                continue;
            }

            // слово в начале строки, а после пробел
            if (indexOf == 0 && st.charAt(subs.length()) == ' ') {
                zeroOne[i] = 1;
                continue;
            }

            // слово в конце строки, а перед ним пробел
            if (lastIndexOF == stLen - 1 && st.charAt(lastIndexOF - subs.length() + 1) == ' ') {
                zeroOne[i] = 1;
                continue;
            }

            // слово в середине строки ограниченое пробелами
            if (indexOf > 0 && st.charAt(indexOf - 1) == ' ' && st.charAt(lastIndexOF + 1) == ' ') {
                zeroOne[i] = 1;
            }
        }

        return zeroOne;
    }
}
