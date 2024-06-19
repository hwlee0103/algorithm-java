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
 * 문제
 * 이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때, 두 이진수의 합을 return하도록 solution 함수를 완성해주세요.
 * 시켜먹은 치킨의 수 chicken이 매개변수로 주어질 때 받을 수 있는 최대 서비스 치킨의 수를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * return 값은 이진수를 의미하는 문자열입니다.
 * 1 ≤ bin1, bin2의 길이 ≤ 10
 * bin1과 bin2는 0과 1로만 이루어져 있습니다.
 * bin1과 bin2는 "0"을 제외하고 0으로 시작하지 않습니다.
 *
 * 입출력 예
 * bin1	    bin2	result
 * "10"	    "11"	"101"
 * "1001"	"1111"	"11000"
 * 100001   1010101  1110110
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
