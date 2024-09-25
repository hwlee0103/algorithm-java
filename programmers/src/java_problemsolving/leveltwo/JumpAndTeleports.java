package java_problemsolving.leveltwo;

import java.util.Scanner;

/**
 * Level : 2
 * Title : 점프와 순간 이동
 * 문제 유형 : Summer/Winter Coding(~2018)
 *
 * Started : 2024-08-19
 * Solved : 2024-08-19
 *
 *
 */
public class JumpAndTeleports {
    public static int solution(int n) {
        int ans = 0;
        int num = n;
        while(num > 0) {
            if(num%2==0) {
                num /=2;
            } else {
                num--;
                ans++;
            }
        }

        return ans;

        // 다른 방법
//        return Integer.bitCount(n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextInt()));
    }
}
