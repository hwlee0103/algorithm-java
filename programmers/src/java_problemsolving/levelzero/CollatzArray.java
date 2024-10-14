package java_problemsolving.levelzero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 콜라츠 수열 만들기
 * 문제 유형 : 코딩 기초 트레이닝
 *
 * Started : 2024-06-30
 * Solved : 2024-06-30
 *
 *
 */
public class CollatzArray {
    public static int[] solution(int n) {
        int[] answer = {};
        List<Integer> collatz = new ArrayList<>();
        while(n != 1) {
            collatz.add(n);
            if(n%2 == 0) n /= 2;
            else {
                n = 3*n + 1;
            }
        }
        collatz.add(1);

        answer = new int[collatz.size()];
        for(int i = 0; i< collatz.size(); ++i) {
            answer[i] = collatz.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] answer = solution(n);
        System.out.print("[");
        for(int i = 0; i < answer.length; ++i) {
            System.out.print(answer[i]);
            if(i < answer.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
