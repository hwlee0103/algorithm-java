package basictraining.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : n보다 커질 때까지 더하기
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-03-24
 * Solved : 2024-03-24
 *
 *
 */
public class AddOverN {
    public static int solution(int[] numbers, int n) {
        int answer = 0;

        // Do-While 풀이
//        int index = 0;
//
//        do {
//            answer += numbers[index];
//            index++;
//        } while(answer <= n);

        for(int now : numbers) {
            answer += now;
            if(answer > n) break;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int[] numbers = new int[size];

        for(int i = 0; i < size; ++i) {
            int now = input.nextInt();
            numbers[i] = now;
        }

        int n = input.nextInt();

        System.out.println(solution(numbers, n));
    }
}
