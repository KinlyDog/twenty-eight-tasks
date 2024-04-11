package tasks;

public class TankRush {
    public static boolean tankRush(int h1, int w1, String s1, int h2, int w2, String s2) {
        if (h1 < h2 || w1 < w2) {
            return false;
        }

        String[] map = s1.split(" ");
        String[] groupOfTanks = s2.split(" ");

        for (int i = 0; i <= h1 - h2; i++) {
            int entry = 0;

            while (entry <= w1 - w2) {
                entry = map[i].indexOf(groupOfTanks[0], entry);

                if (entry < 0) {
                    break;
                }

                if (isHit(map, groupOfTanks, i, entry)) {
                    return true;
                }

                entry++;
            }
        }

        return false;
    }

    private static boolean isHit(String[] map, String[] groupOfTanks, int line, int position) {

        for (String s : groupOfTanks) {
            String st = map[line++].substring(position, position + groupOfTanks.length);

            if (!st.equals(s)) {
                return false;
            }
        }

        return true;
    }
}
