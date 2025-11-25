package JavaProblemSolving.Medium;

/**
 * Level : Medium
 * Title : 1015. Smallest Integer Divisible by K
 * Topic : Hash Table, Math, Weekly Contest 129
 *
 * Started : 2025-11-25
 * Solved : 2025-11-25
 * Time: 13 min 27 sec
 * Algorithm: Math
 *
 *
 *
 */
public class SmallestIntegerDivisible {

    public static int smallestRepunitDivByK(int k) {
        if(k%2==0 || k%5==0) return -1;
        int rem = 0;
        for(int i = 1; i <= k; i++) {
            rem = (rem * 10 + 1) % k;
            if(rem == 0) return i;
        }
        return -1;
    }
}
