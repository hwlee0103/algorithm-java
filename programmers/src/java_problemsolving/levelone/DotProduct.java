package java_problemsolving.levelone;

import java.util.Scanner;

/**
 * Level : 1
 * Title : 내적
 * 문제 유형 : 월간 코드 챌린지 시즌 1
 *
 * Started : 2024-07-16
 * Solved : 2024-07-16
 *
 * 문제
 * 길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.
 * 이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a, b의 길이)
 *
 * 제한사항
 * a, b의 길이는 1 이상 1,000 이하입니다.
 * a, b의 모든 수는 -1,000 이상 1,000 이하입니다.
 *
 * 입출력 예
 * a	        b	        result
 * [1,2,3,4]	[-3,-1,0,2]	3
 * [-1,0,1]	    [1,0,-1]	-2
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * a와 b의 내적은 1*(-3) + 2*(-1) + 3*0 + 4*2 = 3 입니다.
 * 입출력 예 #2
 * a와 b의 내적은 (-1)*1 + 0*0 + 1*(-1) = -2 입니다.
 *
 */
public class DotProduct {
    public static int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i < a.length; ++i) {
            answer += a[i]*b[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] spStrA = str.split(",");
        int[] a = new int[spStrA.length];
        for(int i = 0; i < spStrA.length; ++i) {
            a[i] = Integer.valueOf(spStrA[i]);
        }
        str = input.nextLine();
        String[] spStrB = str.split(",");
        int[] b = new int[spStrB.length];
        for(int i = 0; i < spStrB.length; ++i) {
            b[i] = Integer.valueOf(spStrB[i]);
        }

        System.out.println(solution(a, b));

    }
}
