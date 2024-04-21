package java_problemsolving.levelzero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 배열 만들기 2
 * 문제 유형 : 반복문
 *
 * Started : 2024-04-20
 * Solved :
 *
 *
 */
public class MakeArray2 {
    public static int[] solution(int l, int r) {
        int[] answer = {};
        // l과 r 사이의 자릿수
        // 1자리면 5
        // 2자리수면 50 55
        // 3자리수면 500 505 550 555
        // 자리수를 얻어서
        // 5 붙이고 그다음에 뒤에를..?
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        int r = input.nextInt();
        int[] answer = solution(l, r);
        System.out.print("[");
        for(int i = 0; i < answer.length; ++i) {
            System.out.print(answer[i]);
            if(i < answer.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
