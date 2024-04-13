package tasks;

import java.util.ArrayList;

public class ShopOLAP {
    public static String[] shopOLAP(int n, String[] items) {
        ArrayList<String> products = new ArrayList<>();
        ArrayList<Integer> quantity = new ArrayList<>();

        for (String string : items) {
            String[] itemsSplit = string.split(" ");

            String product = itemsSplit[0];
            int quantum = Integer.parseInt(itemsSplit[1]);

            int position = products.indexOf(product);

            if (position < 0) {
                products.add(product);
                quantity.add(quantum);
            } else {
                quantity.set(position, quantity.get(position) + quantum);
            }
        }

        sorting(products, quantity);

        String[] result = new String[quantity.size()];

        for (int i = 0; i < products.size(); i++) {
            result[i] = products.get(i) + " " + quantity.get(i);
        }

        return result;
    }

    private static void sorting(ArrayList<String> products, ArrayList<Integer> quantity) {
        boolean isSorted = true;

        while (isSorted) {
            isSorted = false;

            for (int i = 0; i < products.size() - 1; i++) {
                if (quantity.get(i) > quantity.get(i + 1)) {
                    continue;
                }

                int quantum = quantity.get(i);
                int quantumNext = quantity.get(i + 1);
                String product = products.get(i);
                String productNext = products.get(i + 1);

                if (quantum < quantumNext || product.compareTo(productNext) > 0) {
                    quantity.set(i, quantumNext);
                    quantity.set(i + 1, quantum);

                    products.set(i, productNext);
                    products.set(i + 1, product);

                    isSorted = true;
                }
            }
        }
    }
}
