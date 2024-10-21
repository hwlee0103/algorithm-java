package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 저주의 숫자 3
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-06-06
 * Solved : 2024-06-06
 *
 *
 */
public class CurseNum3 {
    public static int solution(int n) {
        int[] nums = new int[101];
        int idx = 1;
        for(int i = 1; idx < 101; ++i) {
            if(idx == n + 1) break;
            if(i%3 == 0) continue;

            int tmp = i;
            boolean flag = false;
            while(tmp > 0) {
                if(tmp%10 == 3) flag = true;
                tmp /= 10;
            }
            if(flag) continue;

            nums[idx++] = i;
        }

        return nums[n];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(solution(n));
    }
}
