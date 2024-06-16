package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 옹알이 (1)
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-06-16
 * Solved : 2024-06-16
 *
 * 문제
 * 머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다.
 * 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다.
 * 문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ babbling의 길이 ≤ 100
 * 1 ≤ babbling[i]의 길이 ≤ 15
 * babbling의 각 문자열에서 "aya", "ye", "woo", "ma"는 각각 최대 한 번씩만 등장합니다.
 * 즉, 각 문자열의 가능한 모든 부분 문자열 중에서 "aya", "ye", "woo", "ma"가 한 번씩만 등장합니다.
 * 문자열은 알파벳 소문자로만 이루어져 있습니다.
 *
 * 입출력 예
 * babbling	                                    result
 * ["aya", "yee", "u", "maa", "wyeoo"]	        1
 * ["ayaye", "uuuma", "ye", "yemawoo", "ayaa"]	3
 *
 *
 */
public class Babbling {
    public static int solution(String[] babbling) {
        int answer = 0;

        for(String item : babbling) {
            int[] check = new int[4];
            String now = item;
            if(now.indexOf("aya") > -1) {
                now = now.replace("aya", " ");
                check[0]++;
                if(check[0] > 1) continue;
            }
            if(now.indexOf("ye") > -1) {
                now = now.replace("ye", " ");
                check[1]++;
                if(check[1] > 1) continue;
            }
            if(now.indexOf("woo") > -1) {
                now = now.replace("woo", " ");
                check[2]++;
                if(check[2] > 1) continue;
            }
            if(now.indexOf("ma") > -1) {
                now = now.replace("ma", " ");
                check[3]++;
                if(check[3] > 1) continue;
            }

            now = now.replaceAll(" ", "");

            if(now.length() == 0) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] babbling = str.replaceAll("\"", "").split(", ");
        System.out.println(solution(babbling));
    }
}
