package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 두 수의 합
 * 문제 유형 : 함수(메소드)
 *
 * Started : 2024-09-03
 * Solved : 2024-09-
 *
 * 문제
 * 0 이상의 두 정수가 문자열 a, b로 주어질 때,
 * a + b의 값을 문자열로 return 하는 solution 함수를 작성해 주세요.
 *
 * 제한사항
 * 1 ≤ a의 길이 ≤ 100,000
 * 1 ≤ b의 길이 ≤ 100,000
 * a와 b는 숫자로만 이루어져 있습니다.
 * a와 b는 정수 0이 아니라면 0으로 시작하지 않습니다.
 *
 * 입출력 예
 * a	                    b	                    result
 * "582"	                "734"	                "1316"
 * "18446744073709551615"	"287346502836570928366"	"305793246910280479981"
 * "0"	                    "0"	                    "0"
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * 예제 1번의 a, b는 각각 582, 734이고 582 + 734 = 1316입니다. 따라서 "1316"을 return 합니다.
 *
 * 입출력 예 #2
 * 예제 2번의 a, b는 각각 18446744073709551615, 287346502836570928366이고 18446744073709551615 + 287346502836570928366 = 305793246910280479981입니다. 따라서 "305793246910280479981"을 return 합니다.
 *
 * 입출력 예 #3
 * 예제 3번의 a, b는 각각 0, 0이고 0 + 0 = 0입니다. 따라서 "0"을 return 합니다.
 *
 */
public class SumOfTwoNums {
    public static String solution(String a, String b) {
        String answer = "";
        int aLen = a.length();
        int bLen = b.length();
        int flag = 0;
        while(aLen > 0 || bLen > 0) {
            int nowA = 0;
            int nowB = 0;
            if(aLen > 0) {
                nowA = Integer.parseInt(a.substring(aLen - 1, aLen));
                aLen--;
            }
            if(bLen > 0) {
                nowB = Integer.parseInt(b.substring(bLen - 1, bLen));
                bLen--;
            }
            int now = nowA + nowB + flag;
            if(now >= 10) {
                answer = String.valueOf(now%10) + answer;
                flag = now/10;
            } else {
                answer = String.valueOf(now) + answer;
                flag = 0;
            }
        }
        if(flag == 1) {
            answer = String.valueOf(flag) + answer;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextLine(), input.nextLine()));
    }
}
