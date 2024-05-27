package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 잘라서 배열로 저장하기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-27
 * Solved : 2024-05-27
 *
 * 문제
 * 문자열 my_str과 n이 매개변수로 주어질 때,
 * my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ my_str의 길이 ≤ 100
 * 1 ≤ n ≤ my_str의 길이
 * my_str은 알파벳 소문자, 대문자, 숫자로 이루어져 있습니다.
 *
 * 입출력 예
 * my_str	            n	result
 * "abc1Addfggg4556b"	6	["abc1Ad", "dfggg4", "556b"]
 * "abcdef123"	        3	["abc", "def", "123"]
 *
 */
public class CutAndSaveArray {
    public static String[] solution(String my_str, int n) {
        String[] answer = new String[my_str.length()/n + ((my_str.length()%n == 0) ? 0 : 1)];
        int idx = 0;
        for(int i = 0;i < my_str.length(); i += n) {
            if(answer.length == idx + 1) answer[idx++] = my_str.substring(i, my_str.length());
            else answer[idx++] = my_str.substring(i, i+n);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_str = input.nextLine();
        int n = input.nextInt();
        String[] ans = solution(my_str, n);
        System.out.print("[");
        for(int i = 0; i <ans.length; ++i) {
            System.out.print("\"" + ans[i] + "\"");
            if(i != ans.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
