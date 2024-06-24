package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자열 밀기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-06-24
 * Solved : 2024-06-24
 *
 * 문제
 * 문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다.
 * 이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때,
 * A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 return하고 밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 0 < A의 길이 = B의 길이 < 100
 * A, B는 알파벳 소문자로 이루어져 있습니다.
 *
 * 입출력 예
 * A	    B	    result
 * "hello"	"ohell"	1
 * "apple"	"elppa"	-1
 * "atat"	"tata"	1
 * "abc"	"abc"	0
 *
 */
public class PushingString {
    public static int solution(String A, String B) {
        int answer = 0;
        int size = A.length();
        for(int i = 0; i < size; ++i) {
            if(A.equals(B)) {
                break;
            }
            String tmp = String.valueOf(A.charAt(A.length()-1)) + A.substring(0, A.length() - 1);
            A = tmp;
            answer++;
        }
        return (answer == A.length()) ? -1 : answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.nextLine();
        String B = input.nextLine();
        System.out.println(solution(A, B));
    }
}
