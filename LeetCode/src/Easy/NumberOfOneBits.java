package Easy;

/**
 * Level : Easy
 * Title : 191. Number of 1 Bits
 * Topic : Divide and Conquer, Bit Manipulation
 *
 * Started : 2025-11-07
 * Solved : 2025-11-07
 * Time: 07 min 19 sec -> 09 min 17 sec
 * Algorithm: Math, Binary digits 사용
 *
 *
 *
 */

public class NumberOfOneBits {

    // solution 1
    public int hammingWeight(int n) {
        // 1. n to binary string
        // 2. count 1
        int answer = toBinaryStringCnt(n);
        return answer;
    }

    private int toBinaryStringCnt(int n) {
        String revBinary = "";
        while(n > 0){
            revBinary += String.valueOf(n % 2);
            n /= 2;
        }

        int cnt = 0;
        for(int i = 0; i < revBinary.length(); ++i) {
            if(revBinary.charAt(i) == '1') cnt++;
        }
        return cnt;
    }

    // solution 2
    public int hammingWeight2(int n) {
        int answer = binaryCnt(n);
        return answer;
    }

    private int binaryCnt(int n) {
        int cnt = 0;
        while(n > 0){
            cnt += n % 2;
            n /= 2;
        }
        return cnt;
    }
}
