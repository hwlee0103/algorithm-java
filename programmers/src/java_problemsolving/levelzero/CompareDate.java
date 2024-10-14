package java_problemsolving.levelzero;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 날짜 비교하기
 * 문제 유형 : 조건문 활용
 *
 * Started : 2024-09-10
 * Solved : 2024-09-10
 *
 *
 */
public class CompareDate {
    public static int solution(int[] date1, int[] date2) {
        int answer = 0;

        if(date1[0] < date2[0]) {
            answer = 1;
        } else if(date1[0] == date2[0]){
            if(date1[1] < date2[1]) {
                answer = 1;
            } else if(date1[1] == date2[1]) {
                if(date1[2] < date2[2]) {
                    answer = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] date1 = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] date2 = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(date1, date2));
    }
}
