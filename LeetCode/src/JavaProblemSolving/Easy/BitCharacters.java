package JavaProblemSolving.Easy;

/**
 * Level : Easy
 * Title : 717. 1-bit and 2-bit Characters
 * Topic : Array
 *
 * Started : 2025-11-18
 * Solved : 2025-11-18
 * Time: -
 * Algorithm: Array
 *
 *
 *
 */
public class BitCharacters {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        for(; i < bits.length - 1;) {
            int now = bits[i] * 10 + bits[i+1];
            if(now == 10 || now == 11) {
                i += 2;
            } else {
                i++;
            }
        }

        return (i <= bits.length - 1) ? true : false;
    }
}
