package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : qr code
 * 문제 유형 : 코딩 기초 트레이닝 - 문자열
 *
 * Started : 2024-07-14
 * Solved : 2024-07-14
 *
 *
 */
public class QRCode {
    public static String solution(int q, int r, String code) {
        String answer = "";
        for(int i = 0; i < code.length(); ++i) {
            if(i%q == r) {
                answer += code.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        int r = input.nextInt();
        input.nextLine();
        String code = input.nextLine();
        System.out.println(solution(q, r, code));
    }
}
