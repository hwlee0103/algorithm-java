package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 중복된 숫자 개수
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-27
 * Solved : 2024-05-27
 *
 *
 */
public class NumOfDuplicateNums {
    public static int solution(int[] array, int n) {
        int answer = 0;
        for(int i = 0; i < array.length ; ++i) {
            if(array[i] == n) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int[] array = new int[size];

        for(int i = 0; i < size; ++i) {
            int now = input.nextInt();
            array[i] = now;
        }

        int n = input.nextInt();

        System.out.println(solution(array, n));
    }
}
