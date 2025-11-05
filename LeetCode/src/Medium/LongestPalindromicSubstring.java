package Medium;
/**
 * Level : Medium
 * Title : 5. Longest Palindromic Substring
 * Topic : Two Pointers, String, Dynamic Programming
 *
 * Started : 2025-11-04
 * Solved : 2025-11-04
 * Time: 23 min 02 sec
 * Algorithm: Simulation - 다시 풀어보기
 *
 *
 */
public class LongestPalindromicSubstring {


    public String longestPalindrome(String s) {
        int n = s.length();
        if(n <= 1) return s;

        int maxStart = 0, maxLen = 1;

        for(int i = 0; i < n; ++i) {
            // 홀수 길이
            int[] odd = getPelindromeRange(s, i, i);
            int lenOdd = odd[1] - odd[0] + 1;
            if(lenOdd > maxLen) {
                maxLen = lenOdd;
                maxStart = odd[0];
            }

            // 짝수 길이
            int[] even = getPelindromeRange(s, i, i + 1);
            int lenEven = even[1] - even[0] + 1;
            if(lenEven > maxLen) {
                maxLen = lenEven;
                maxStart = even[0];
            }
        }

        return s.substring(maxStart, maxStart + maxLen);
    }

    private int[] getPelindromeRange(String s, int l, int r) {
        int n = s.length();
        while(l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {l--; r++;}
        return new int[]{l + 1, r - 1};
    }
}

