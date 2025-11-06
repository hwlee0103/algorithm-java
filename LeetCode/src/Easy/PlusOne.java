package Easy;

/**
 * Level : Easy
 * Title : 66. Plus One
 * Topic : Array, Math
 *
 * Started : 2025-11-06
 * Solved : 2025-11-06
 * Time: 06 min 48 sec
 * Algorithm: Array
 *
 *
 *
 */
public class PlusOne {


    public int[] plusOne(int[] digits) {
        int up = 0;
        int n = digits.length;
        int[] ans = new int[n];
        for(int i = n - 1; i >= 0; --i) {
            int now = digits[i] + up;
            if(i == n - 1 ) now++;
            up = now / 10;
            now %= 10;
            digits[i] = now;
        }
        int idx = 0;
        if(up > 0) {
            ans = new int[n + 1];
            ans[idx++] = up;
        }
        for(int i = 0; i < n; ++i) {
            ans[idx++] = digits[i];
        }

        return ans;
    }
}
