package JavaProblemSolving.Easy;

/**
 * Level : Easy
 * Title : 292. Nim Game
 * Topic : Math, Brainteaser, Game Theory
 *
 * Started : 2025-11-09
 * Solved : 2025-11-09
 * Time: 16 min 24 sec
 * Algorithm: Math 사용
 *
 *
 *
 */
public class NimGame {
    public boolean canWinNim(int n) {
        return (n & 3) != 0;
    }
}
