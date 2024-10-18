package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 이진수 더하기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-06-19
 * Solved : 2024-06-19
 *
 *
 */
public class AddingBinaries {
    public static String solution(String bin1, String bin2) {
        String answer = "";

        int n1 = bin1.length();
        int n2 = bin2.length();
        long up = 0;
        long now1 = 0;
        long now2 = 0;

        while(n1 > 0 || n2 > 0) {
            if(n1 <= 0) now1 = 0;
            else now1 = Integer.valueOf(bin1.substring(n1-1, n1));
            if(n2 <= 0) now2 = 0;
            else now2 = Integer.valueOf(bin2.substring(n2-1, n2));

            long now = (now1 + now2 + up)%2;
            up = (now1 + now2 + up)/2;
            answer = String.valueOf(now) + answer;
            n1--;
            n2--;
        }

        if(up == 1) answer = String.valueOf(up) + answer;

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bin1 = input.nextLine();
        String bin2 = input.nextLine();
        System.out.println(solution(bin1, bin2));
    }
}
