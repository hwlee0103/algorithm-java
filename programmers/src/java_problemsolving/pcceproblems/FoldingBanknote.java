package java_problemsolving.pcceproblems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 1
 * Title : [PCCE 기출문제] 9번 / 지폐 접기
 * 문제 유형 : [PCCE 기출문제]
 *
 * Started : 2024-10-22
 * Solved : 2024-10-22
 *
 *
 */
public class FoldingBanknote {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        while((Math.min(bill[0], bill[1]) > Math.min(wallet[0], wallet[1])) || (Math.max(bill[0], bill[1]) > Math.max(wallet[0], wallet[1]))) {
            if(bill[0] > bill[1]) {
                bill[0] /=2;
            } else {
                bill[1] /=2;
            }
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] wallet = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] bill = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(new FoldingBanknote().solution(wallet, bill));
    }
}
