package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자열 바꿔서 찾기
 * 문제 유형 : 문자열
 *
 * Started : 2024-08-20
 * Solved : 2024-08-20
 *
 * 문제
 * 문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어집니다.
 * myString의 "A"를 "B"로, "B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 중
 * pat이 있으면 1을 아니면 0을 return 하는 solution 함수를 완성하세요.
 *
 * 제한사항
 * 1 ≤ myString의 길이 ≤ 100
 * 1 ≤ pat의 길이 ≤ 10
 * myString과 pat는 문자 "A"와 "B"로만 이루어진 문자열입니다.
 *
 * 입출력 예
 * myString	pat	    result
 * "ABBAA"	"AABB"	1
 * "ABAB"	"ABAB"	0
 *
 * 입출력 예 설명
 *
 * 입출력 예 #1
 * "ABBAA"에서 "A"와 "B"를 서로 바꾸면 "BAABB"입니다.
 * 여기에는 부분문자열 "AABB"가 있기 때문에 1을 return 합니다.
 *
 * 입출력 예 #2
 * "ABAB"에서 "A"와 "B"를 서로 바꾸면 "BABA"입니다.
 * 여기에는 부분문자열 "BABA"가 없기 때문에 0을 return 합니다.
 * ※ 2023년 05월 15일 제한사항 및 테스트 케이스가 수정되었습니다.
 * 기존에 제출한 코드가 통과하지 못할 수 있습니다.
 *
 */
public class SwitchAndFindString {
    public static int solution(String myString, String pat) {
        int answer = 0;
        for(int i = 0; i < myString.length(); ++i) {
            if(myString.charAt(i) == 'A') {
                myString = myString.substring(0, i) + 'B' + myString.substring(i + 1, myString.length());
            } else if(myString.charAt(i) == 'B') {
                myString = myString.substring(0, i) + 'A' + myString.substring(i + 1, myString.length());
            }
        }
        if(myString.indexOf(pat) > -1) {
            answer = 1;
        }
        return answer;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextLine(), input.nextLine()));
    }
}
