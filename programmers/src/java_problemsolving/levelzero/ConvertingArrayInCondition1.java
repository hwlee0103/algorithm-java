package java_problemsolving.levelzero;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 조건에 맞게 수열 변환하기 1
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-08-02
 * Solved : 2024-08-02
 *
 *
 */
public class ConvertingArrayInCondition1 {
    public static int[] solution(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            if(arr[i] >= 50 && arr[i]%2 == 0) {
                arr[i] /= 2;
            } else if(arr[i] < 50 && arr[i]%2 != 0) {
                arr[i] *= 2;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::valueOf).toArray();
        System.out.println(Arrays.toString(solution(arr)));
    }
}
