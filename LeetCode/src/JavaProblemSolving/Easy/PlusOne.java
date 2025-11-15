package JavaProblemSolving.Easy;

/**
 * Level : Easy
 * Title : 66. Plus One
 * Topic : Array, Math
 *
 * Started : 2025-11-06
 * Solved : 2025-11-06
 * Time: 06 min 48 sec
 * Algorithm: Array 사용 -> Math 사용
 *
 *
 *
 */
public class PlusOne {

    public int[] plusOne2(int[] digits) {
        for(int i = digits.length - 1; i >= 0; --i) {
            if(digits[i] < 9) { // 9 이하면 1증가하고 Return -> 가장 마지막 수만 + 1이므로 올림을 해도 다른 자리수도 여기서 처리 됨
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        // 마지막 올림 -> 모두 9였을 경우만 해당됨
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }

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
