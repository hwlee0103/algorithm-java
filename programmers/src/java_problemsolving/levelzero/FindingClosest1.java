package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 가까운 1 찾기
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-07-16
 * Solved : 2024-07-16
 *
 *
 */
public class FindingClosest1 {
    public static int solution(int[] arr, int idx) {
        int answer = -1;
        for(int i = idx; i < arr.length; ++i) {
            if(arr[i] == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int idx = input.nextInt();
        String[] spStr = str.split(", ");
        int[] arr = new int[spStr.length];
        for(int i = 0; i < spStr.length; ++i) {
            arr[i] = Integer.valueOf(spStr[i]);
        }

        System.out.println(solution(arr, idx));
    }
}
