package java_problemsolving.levelzero;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 조건에 맞게 수열 변환하기 2
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-08-03
 * Solved : 2024-08-03
 *
 *
 */
public class ConvertingArrayInCondition2 {
    public static int solution(int[] arr) {
        int answer = 0;
        int[] temp;
        do {
            temp = Arrays.copyOf(arr, arr.length);
            for(int i = 0; i < arr.length; ++i) {
                if(arr[i] >= 50 && arr[i]%2 == 0) {
                    arr[i] /= 2;
                } else if(arr[i] < 50 && arr[i]%2 != 0) {
                    arr[i] = arr[i]*2 + 1;
                }
            }
            answer++;
        } while(!Arrays.equals(temp, arr));

        return answer - 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::valueOf).toArray();
        System.out.println(solution(arr));
    }
}
