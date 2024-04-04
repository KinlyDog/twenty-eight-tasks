package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.MassVote.massVote;

class MassVoteTest {
    String majorityWin;
    String minorityWin;
    String noWin;

    MassVoteTest() {
        majorityWin = "majority winner ";
        minorityWin = "minority winner ";
        noWin = "no winner";
    }

    @Test
    void oneCandidateTest() {
        int[] votes = {10};
        assertEquals(majorityWin + 1, massVote(votes.length, votes));
    }

    @Test
    void majorityWinnerTest() {
        int[] votes = {60, 10, 10, 15, 5};
        assertEquals(majorityWin + 1, massVote(votes.length, votes));
    }

    @Test
    void minorityWinnerTest() {
        int[] votes = {10, 15, 10};
        assertEquals(minorityWin + 2, massVote(votes.length, votes));
    }
}