package tasks;

public class MassVote {
    public static String massVote(int n, int[] votes) {
        if (n == 1) {
            return "majority winner 1";
        }

        int winner = 0;
        double totalVotes = votes[0];

        for (int i = 1; i < votes.length; i++) {
            if (votes[i] > votes[winner]) {
                winner = i;
            }

            totalVotes += votes[i];
        }

        return votingResults(winner, totalVotes, votes);
    }

    private static String votingResults(int winner, double totalVotes, int[] votes) {
        for (int i = winner + 1; i < votes.length; i++) {
            if (votes[i] == votes[winner]) {
                return "no winner";
            }
        }

        double winnerRating = votes[winner] / totalVotes * 100;
        winnerRating = Math.round(winnerRating * 1000) / 1000.0;

        if (winnerRating > 50) {
            return "majority winner " + (winner + 1);
        }

        return "minority winner " + (winner + 1);
    }
}
