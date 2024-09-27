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
