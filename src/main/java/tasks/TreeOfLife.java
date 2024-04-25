package tasks;

public class TreeOfLife {
    public static String[] treeOfLife(int h, int w, int n, String[] tree) {
        if (n < 1) {
            return tree;
        }

        int[][] digitalTree = new int[h][w];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (tree[i].charAt(j) == '+') {
                    digitalTree[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            agingProcess(digitalTree, h, w);

            if (i % 2 != 0) {
                destroyingBranches(digitalTree, h, w);
            }
        }

        return digitalToStringTree(digitalTree, h, w);
    }

    private static void agingProcess(int[][] tree, int h, int w) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                tree[i][j]++;
            }
        }
    }

    private static void destroyingBranches(int[][] tree, int h, int w) {
        int[][] delete = new int[h][w];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (tree[i][j] > 2) {
                    delete[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (delete[i][j] == 1) {
                    trimming(tree, i, j, h, w);
                }
            }
        }
    }

    private static void trimming(int[][] tree, int i, int j, int h, int w) {
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

    private static String[] digitalToStringTree(int[][] digitalTree, int h, int w) {
        String[] tree = new String[h];

        for (int i = 0; i < h; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < w; j++) {
                if (digitalTree[i][j] > 0) {
                    sb.append("+");
                } else {
                    sb.append(".");
                }
            }

            tree[i] = sb.toString();
        }

        return tree;
    }
}
