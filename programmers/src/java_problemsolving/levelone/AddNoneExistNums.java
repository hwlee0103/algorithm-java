package java_problemsolving.levelone;

import java.util.Scanner;

/**
 * Level : 1
 * Title : 없는 숫자 더하기
 * 문제 유형 : 월간 코드 챌린지 시즌3
 *
 * Started : 2024-07-14
 * Solved : 2024-07-14
 *
 * 문제
 * 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
 * numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ numbers의 길이 ≤ 9
 * 0 ≤ numbers의 모든 원소 ≤ 9
 * numbers의 모든 원소는 서로 다릅니다.
 *
 * 입출력 예
 * numbers	            result
 * [1,2,3,4,6,7,8,0]	14
 * [5,8,4,0,6,7,9]	    6
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * 5, 9가 numbers에 없으므로, 5 + 9 = 14를 return 해야 합니다.
 * 입출력 예 #2
 * 1, 2, 3이 numbers에 없으므로, 1 + 2 + 3 = 6을 return 해야 합니다.
 *
 */
public class AddNoneExistNums {
    public static int solution(int[] numbers) {
        int answer = 0;
        int[] cnt = new int[10];
        for(int now : numbers) {
            cnt[now]++;
        }
        for(int i = 0 ;i < 10; ++i) {
            if(cnt[i] == 0) answer += i;
        }

        // 다른 풀이
        int answer1 = 45; // 0에서 9까지이므로
        for(int now : numbers) {
            answer1 -= now;
        }
        //return answer1;

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] spStr = str.split(",");
        int[] numbers = new int[spStr.length];
        for(int i = 0; i < spStr.length; ++i) {
            numbers[i] = Integer.valueOf(spStr[i]);
        }
        System.out.println(solution(numbers));
    }
}
