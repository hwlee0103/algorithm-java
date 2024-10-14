package java_problemsolving.levelzero;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 배열 비교하기
 * 문제 유형 : 함수(메소드)
 *
 * Started : 2024-08-27
 * Solved : 2024-08-27
 *
 *
 */
public class ComparingArrays {
    public static int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr1.length > arr2.length) {
            answer = 1;
        } else if (arr1.length < arr2.length){
            answer = -1;
        } else {
            answer = (Arrays.stream(arr1).sum() > Arrays.stream(arr2).sum()) ? 1 : ((Arrays.stream(arr1).sum() == Arrays.stream(arr2).sum()) ? 0 : -1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr1 = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(arr1, arr2));
    }
}
