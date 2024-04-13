package tasks;

import java.util.ArrayList;
import java.util.HashMap;

public class ShopOLAP {
    public static String[] shopOLAP(int n, String[] items) {
        HashMap<String, Integer> hm = new HashMap<>();

        for (String st : items) {
            String[] itemsTemp = st.split(" ");
            String name = itemsTemp[0];
            int count = Integer.parseInt(itemsTemp[1]);

            if (!hm.containsKey(name)) {
                hm.put(name, count);
            } else {
                hm.replace(name, hm.get(name) + count);
            }
        }

        ArrayList<String> itemsTemp = new ArrayList<>(hm.keySet());
        ArrayList<Integer> count = new ArrayList<>(hm.values());

        sorting(itemsTemp, count);

        String[] result = new String[count.size()];

        for (int i = 0; i < itemsTemp.size(); i++) {
            result[i] = itemsTemp.get(i) + " " + count.get(i);
        }

        return result;
    }

    private static void sorting(ArrayList<String> items, ArrayList<Integer> count) {
        boolean isSorted = true;

        while (isSorted) {
            isSorted = false;

            for (int i = 0; i < count.size() - 1; i++) {
                if (count.get(i) > count.get(i + 1)) {
                    continue;
                }

                int firstCount = count.get(i);
                int secondCount = count.get(i + 1);
                String firstItem = items.get(i);
                String secondItem = items.get(i + 1);

                if (firstCount < secondCount || firstItem.compareTo(secondItem) > 0) {
                    count.set(i, secondCount);
                    count.set(i + 1, firstCount);

                    items.set(i, secondItem);
                    items.set(i + 1, firstItem);

                    isSorted = true;
                }
            }
        }
    }
}
