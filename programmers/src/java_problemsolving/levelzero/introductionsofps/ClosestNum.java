package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

import static java.lang.Math.min;

/**
 * Level : 0
 * Title : 가까운 수
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-13
 * Solved : 2024-05-13
 *
 *
 */
public class ClosestNum {
    public static int solution(int[] array, int n) {
        int answer = 101;
        int diff = 101;
        for(int item : array) {
            if(Math.abs(n - item) < diff) {
                diff = Math.abs(n - item);
                answer = item;
            } else if(Math.abs(n - item) == diff) {
                answer = Math.min(item, answer);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] spStr = str.split(", ");
        int[] array = new int[spStr.length];
        for(int i = 0;i < spStr.length; ++i) {
            array[i] = Integer.valueOf(spStr[i]);
        }
        input.reset();
        int n = input.nextInt();
        System.out.println(solution(array, n));
    }
}
