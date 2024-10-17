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
