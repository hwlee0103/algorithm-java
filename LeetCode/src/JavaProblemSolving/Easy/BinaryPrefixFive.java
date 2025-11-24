package JavaProblemSolving.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Level : Easy
 * Title : 1018. Binary Prefix Divisible By 5
 * Topic : Array, Bit Manipulation, Weekly Contest 130
 *
 * Started : 2025-11-24
 * Solved : 2025-11-24
 * Time: -
 * Algorithm: Bit Manipulation
 *
 *
 *
 */

public class BinaryPrefixFive {
    public static void main(String[] args) {

    }

    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int now = 0;
        for(int i = 0; i < nums.length; ++i) {
            now = ((now << 1) | nums[i]) % 5;
            ans.add(now == 0);
            //System.out.println(now);
        }

        return ans;
    }
}
