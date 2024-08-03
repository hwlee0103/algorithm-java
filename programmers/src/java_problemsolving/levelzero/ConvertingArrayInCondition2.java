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
 * 문제
 * 정수 배열 arr가 주어집니다. arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱하고 다시 1을 더합니다.
 * 이러한 작업을 x번 반복한 결과인 배열을 arr(x)라고 표현했을 때, arr(x) = arr(x + 1)인 x가 항상 존재합니다.
 * 이러한 x 중 가장 작은 값을 return 하는 solution 함수를 완성해 주세요.
 * 단, 두 배열에 대한 "="는 두 배열의 크기가 서로 같으며, 같은 인덱스의 원소가 각각 서로 같음을 의미합니다.
 *
 *
 * 제한사항
 * 1 ≤ arr의 길이 ≤ 1,000,000
 * 1 ≤ arr의 원소의 값 ≤ 100
 *
 * 입출력 예
 * arr	                    result
 * [1, 2, 3, 100, 99, 98]	5
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * 위 작업을 반복하면 다음과 같이 arr가 변합니다.
 * 반복 횟수	arr
 * 0	[1, 2, 3, 100, 99, 98]
 * 1	[3, 2, 7, 50, 99, 49]
 * 2	[7, 2, 15, 25, 99, 99]
 * 3	[15, 2, 31, 51, 99, 99]
 * 4	[31, 2, 63, 51, 99, 99]
 * 5	[63, 2, 63, 51, 99, 99]
 * 6	[63, 2, 63, 51, 99, 99]
 * 이후로 arr가 변하지 않으며, arr(5) = arr(6)이므로 5를 return 합니다.
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
