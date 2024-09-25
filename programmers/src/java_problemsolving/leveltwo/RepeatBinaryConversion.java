package java_problemsolving.leveltwo;

import java.util.Scanner;

/**
 * Level : 2
 * Title : 이진 변환 반복하기
 * 문제 유형 : 월간 코드 챌린지 시즌 1
 *
 * Started : 2024-07-25
 * Solved : 2024-07-25
 *
 *
 */
public class RepeatBinaryConversion {
    public static int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        while(!s.equals("1")){
            int prelength = s.length();
            s = s.replaceAll("0", "");
            int postlength = s.length();
            answer[1] += prelength - postlength;
            int c = postlength;
            long now = 0;
            int idx = 0;
            while(c > 0) {
                now += c%2*Math.pow(10, idx++);
                c /= 2;
            }
            s = String.valueOf(now);
            cnt++;
        }
        answer[0] = cnt;
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int[] answer = solution(s);
        System.out.print("[");
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]);
            if (i < answer.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
