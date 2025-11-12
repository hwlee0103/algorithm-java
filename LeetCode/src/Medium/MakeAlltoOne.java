package Medium;

/**
 * Level : Medium
 * Title : 2654. Minimum Number of Operations to Make All Array Elements Equal to 1
 * Topic : Array, Math, Number Theory, Weekly Contest 342
 *
 * Started : 2025-11-12
 * Solved : 2025-11-
 * Time: min sec
 * Algorithm:
 *
 *
 *
 */

public class MakeAlltoOne {
    // 1. GCD method
    // 2. minimum number of operation
    //      a. choose start index -> how?
    //          i. same x = no operations
    //          ii. 서로소인 원소 먼저 연산 -> gcd가 1인 연산 먼저 -> 왜냐, 거기부터 시작임. 양쪽으로 전부 연산
    //      b. gcd
    //      c. change values
    //      d. count each
    // 3. Algorithm? DP, parametric search?
    //
    public static void main(String[] args) {

    }

    public static int minOperations(int[] nums) {
        int cnt = 0; // operation counting

        int startIdx = -1; // start index
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == 1) {
                startIdx = i;
                break;
            } else {
                if(gcd(nums[i], nums[i+1]) == 1) {
                    startIdx = i;
                    nums[i] = 1;
                    cnt++;
                    break;
                }
            }
        }

        if(startIdx == -1){
            return -1;
        }
        // todo: 한 번만 해서 되는 아님. 처음엔 gcd == 1이 없어도 중간에 연산으로 인해 생길 수 있음

        return nums.length;
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
