package java_problemsolving.levelzero;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 조건에 맞게 수열 변환하기 3
 * 문제 유형 : 반복문 활용
 *
 * Started : 2024-09-12
 * Solved : 2024-09-12
 *
 *
 */
public class ConvertArray3 {
    public static int[] solution(int[] arr, int k) {
        for(int i = 0; i < arr.length; ++i) {
            arr[i] = (k%2==0) ? arr[i] + k : arr[i] * k;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int k = input.nextInt();
        System.out.println(Arrays.toString(solution(arr, k)));
    }
}
