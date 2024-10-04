package java_problemsolving.levelzero;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 배열의 길이를 2의 거듭제곱으로 만들기
 * 문제 유형 : 함수(메소드)
 *
 * Started : 2024-08-26
 * Solved : 2024-08-26
 *
 *
 */
public class MakeTheLengthOfArrayPowerOf2 {
    public static int[] solution(int[] arr) {
        int[] answer = {};
        int num = 0;
        while(arr.length > Math.pow(2, num)) {
            num++;
        }
//        System.out.println(num);
        answer = new int[(int)Math.pow(2, num)];
        for(int i = 0; i < arr.length; ++i) {
            answer[i] = arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(solution(Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::valueOf).toArray())));
    }
}
