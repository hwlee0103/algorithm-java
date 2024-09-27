package java_problemsolving.levelzero;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 배열 조각하기
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-07-20
 * Solved : 2024-07-21
 *
 *
 */
public class SculptingArray {
    public static int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        Deque<Integer> nums = new ArrayDeque<>();
        for(int i = 0; i < arr.length; i++) {
            nums.addLast(arr[i]);
        }
        for(int i = 0; i < query.length; i++) {
            int cnt = 0;
            if(i%2 == 0){
                cnt = nums.size() - (query[i] + 1);
                while(cnt > 0) {
                    nums.removeLast();
                    cnt--;
                }
            } else {
                cnt = query[i];
                while(cnt > 0) {
                    nums.removeFirst();
                    cnt--;
                }
            }
        }

        answer = new int[nums.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = nums.pollFirst();
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] spStr = str.split(", ");
        int[] arr = new int[spStr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(spStr[i]);
        }
        str = input.nextLine();
        spStr = str.split(", ");
        int[] query = new int[spStr.length];
        for (int i = 0; i < query.length; i++) {
            query[i] = Integer.parseInt(spStr[i]);
        }

        int[] answer = solution(arr, query);
        System.out.print("[");
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]);
            if (i < answer.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
