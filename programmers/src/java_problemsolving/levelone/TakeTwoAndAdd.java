package java_problemsolving.levelone;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 1
 * Title : 두 개 뽑아서 더하기
 * 문제 유형 : 월간 코드 챌린지 시즌 1
 *
 * Started : 2024-08-04
 * Solved : 2024-08-05
 *
 *
 */
public class TakeTwoAndAdd {
    public static int[] solution(int[] numbers) {
        int[] answer = {};
        int[] numberCheck = new int[200];
        int cnt = 0;

        for(int i = 0; i < numbers.length; ++i) {
            for(int j = i + 1; j < numbers.length; ++j) {
                numberCheck[numbers[i] + numbers[j]]++;
            }
        }

        for(int i = 0; i < numberCheck.length; ++i) {
            if(numberCheck[i] > 0) {
                cnt++;
            }
        }
        answer = new int[cnt];
        int idx = 0;
        for(int i = 0; i < numberCheck.length; ++i) {
            if(numberCheck[i] > 0) {
                answer[idx++] = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = Arrays.stream(input.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(solution(numbers)));
    }
}
