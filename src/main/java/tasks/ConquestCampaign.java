package tasks;

public class ConquestCampaign {

    public static int conquestCampaign(int x, int y, int l, int[] battalion) {
        int dayOfBattle = 1;
        int[][] battlefield = new int[x][y];

        for (int i = 0; i < battalion.length; i += 2) {
            int xx = battalion[i] - 1;
            int yy = battalion[i + 1] - 1;

            battlefield[xx][yy] = 1;
        }

        while (battleToBeContinue(battlefield)) {
            int newDay = dayOfBattle + 1;

            for (int i = 0; i < battlefield.length; i++) {
                for (int j = 0; j < battlefield[0].length; j++) {
                    if (battlefield[i][j] == dayOfBattle) {
                        landing(battlefield, i, j, newDay);
                    }
                }
            }

            dayOfBattle++;
        }

        return dayOfBattle;
    }

    static boolean battleToBeContinue(int[][] battlefield) {
        for (int[] row : battlefield) {
            for (int sector : row) {
                if (sector == 0) {
                    return true;
                }
            }
        }

        return false;
    }

    static void landing(int[][] bf, int i, int j, int newDay) {
        if (i > 0 && bf[i - 1][j] == 0) {
            bf[i - 1][j] = newDay;
        }

        if (i < bf.length - 1 && bf[i + 1][j] == 0) {
            bf[i + 1][j] = newDay;
        }

        if (j > 0 && bf[i][j - 1] == 0) {
            bf[i][j - 1] = newDay;
        }

        if (j < bf[0].length - 1 && bf[i][j + 1] == 0) {
            bf[i][j + 1] = newDay;
        }
    }
}