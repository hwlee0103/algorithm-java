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
 * 문제
 * 3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 3의 배수와 숫자 3을 사용하지 않습니다. 3x 마을 사람들의 숫자는 다음과 같습니다.
 * 10진법	3x 마을에서 쓰는 숫자	10진법	3x 마을에서 쓰는 숫자
 * 1	1	6	8
 * 2	2	7	10
 * 3	4	8	11
 * 4	5	9	14
 * 5	7	10	16
 * 정수 n이 매개변수로 주어질 때, n을 3x 마을에서 사용하는 숫자로 바꿔 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ n ≤ 100
 *
 * 입출력 예
 * n	result
 * 15	25
 * 40	76
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
