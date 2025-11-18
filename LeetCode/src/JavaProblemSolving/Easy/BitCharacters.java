package JavaProblemSolving.Easy;

/**
 * Level : Easy
 * Title : 717. 1-bit and 2-bit Characters
 * Topic : Array
 *
 * Started : 2025-11-18
 * Solved : 2025-11-
 * Time: -
 * Algorithm: -
 *
 *
 *
 */
public class BitCharacters {
    public boolean isOneBitCharacter(int[] bits) {
        boolean answer = true;
        int i = 0;
        for(; i < bits.length - 1;) {
            String now = String.valueOf(bits[i]) + String.valueOf(bits[i+1]);
            if(now.equals("10") || now.equals("11")) {
                i += 2;
                answer = false;
            } else {
                i++;
            }
        }
        if(i < bits.length - 1) answer = true;

        return answer;
    }
}
