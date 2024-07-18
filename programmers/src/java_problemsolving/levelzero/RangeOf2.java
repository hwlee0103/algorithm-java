package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 2의 영역
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-07-18
 * Solved : 2024-07-18
 *
 * 문제
 * 정수 배열 arr가 주어집니다.
 * 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.
 * 단, arr에 2가 없는 경우 [-1]을 return 합니다.
 *
 * 제한사항
 * 1 ≤ arr의 길이 ≤ 100,000
 * 1 ≤ arr의 원소 ≤ 10
 *
 * 입출력 예
 * arr	                        result
 * [1, 2, 1, 4, 5, 2, 9]	    [2, 1, 4, 5, 2]
 * [1, 2, 1]	                [2]
 * [1, 1, 1]	                [-1]
 * [1, 2, 1, 2, 1, 10, 2, 1]	[2, 1, 2, 1, 10, 2]
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * 2가 있는 인덱스는 1번, 5번 인덱스뿐이므로 1번부터 5번 인덱스까지의 부분 배열인 [2, 1, 4, 5, 2]를 return 합니다.
 * 입출력 예 #2
 * 2가 한 개뿐이므로 [2]를 return 합니다.
 * 입출력 예 #3
 * 2가 배열에 없으므로 [-1]을 return 합니다.
 * 입출력 예 #4
 * 2가 있는 인덱스는 1번, 3번, 6번 인덱스이므로 1번부터 6번 인덱스까지의 부분 배열인 [2, 1, 2, 1, 10, 2]를 return 합니다.
 *
 */
public class RangeOf2 {
    public static int[] solution(int[] arr) {
        int[] answer = {};
        int start = -1;
        int end = -1;
        for(int i = 0; i < arr.length; ++i) {
            if(arr[i] == 2) {
                if(start < 0) {
                    start = i;
                } else {
                    end = i;
                }
            }
        }
        if(end < 0) end = start;

        if(start < 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[end - start + 1];
            for(int i = start; i <= end; ++i) {
                answer[i - start] = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] spStr = str.split(", ");
        int[] arr = new int[spStr.length];
        for(int i = 0; i < spStr.length; ++i) {
            arr[i] = Integer.valueOf(spStr[i]);
        }

        int[] answer = solution(arr);
        System.out.print("[");
        for(int i = 0; i < answer.length; ++i) {
            System.out.print(answer[i]);
            if(i < answer.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
