package tasks;

public class TreeOfLife {
    public static String[] treeOfLife(int h, int w, int n, String[] tree) {
        int[][] treeNums = new int[h][w];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (tree[i].charAt(j) == '+') {
                    treeNums[i][j] = 1;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            aging(treeNums, h, w);

            if (i % 2 != 0) {
                destruction(treeNums, h, w);
            }
        }

        String[] newTree = new String[h];

        for (int i = 0; i < h; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < w; j++) {
                sb.append(treeNums[i][j]);
            }

            newTree[i] = sb.toString();
        }

        return new String[0];
    }

    private static void aging(int[][] tree, int h, int w) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                tree[i][j]++;
            }
        }
    }

    private static void destruction(int[][] tree, int h, int w) {
        int[][] delete = new int[h][w];

        // доделать
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (tree[i][j] > 2) {
                    delete[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (delete[i][j] > 1) {
                    tree[i][j] = 0;

                    if (i > 0) {
                        tree[i - 1][j] = 0;
                    }

                    if (i < h - 1) {
                        tree[i + 1][j] = 0;

                    }

                    if (j > 0) {
                        tree[i][j - 1] = 0;
                    }

                    if (j < w - 1) {
                        tree[i][j + 1] = 0;
                    }
                }
            }
        }
    }
}
