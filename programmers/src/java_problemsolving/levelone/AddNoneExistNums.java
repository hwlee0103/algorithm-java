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
