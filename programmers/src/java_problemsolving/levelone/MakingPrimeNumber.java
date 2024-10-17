package java_problemsolving.levelone;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 1
 * Title : 소수 만들기
 * 문제 유형 : Summer/Winter Coding(~2018)
 *
 * Started : 2024-10-17
 * Solved : 2024-10-17
 *
 *
 */
public class MakingPrimeNumber {
    public static int solution(int[] nums) {
        int answer = -1;
        boolean[] prime = new boolean[3001];
        for(int i = 0; i < prime.length; ++i) {
            prime[i] = true;
        }
        prime = eratos(prime);

        boolean[] check = new boolean[nums.length];
        answer = func(nums, 0, 0, 0, prime, check);

        // System.out.println(Arrays.toString(prime));

        return answer;
    }

    // 완전탐색 - 경우의 수 구하기
    public static int func(int[] nums, int now, int sum, int cnt, boolean[] prime, boolean[] check) {
        int ans = 0;
        if(now >= nums.length) return 0;
        if(cnt > 3) return 0;
        if(cnt == 3){
            if(prime[sum]) return 1;
            else return 0;
        }

        for(int i = now; i < nums.length; ++i) {
            if(check[i]) continue;
            check[i] = true;
            ans += func(nums, i, sum + nums[i], cnt + 1, prime, check);
            check[i] = false;
        }
        return ans;
    }

    // 에라토스테네스의 체
    public static boolean[] eratos(boolean[] prime) {
        prime[1] = false;
        prime[2] = true;

        for(int i = 2; i <= 3000; i++) {
            for(int j = i * 2; j <= 3000; j++) {
                if(!prime[j]) continue;
                if(j % i == 0) prime[j] = false;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(Arrays.stream(input.nextLine().split(",")).mapToInt(Integer::parseInt).toArray()));
    }
}
