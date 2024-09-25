package java_problemsolving.leveltwo;

import java.util.Scanner;

/**
 * Level : 2
 * Title : 예상 대진표
 * 문제 유형 : 2017 팁스타운
 *
 * Started : 2024-09-09
 * Solved : 2024-09-09
 *
 *
 */
public class ExpectedBracket {
    public static int solution(int n, int a, int b)
    {
        int answer = 0;
        int A = Math.min(a, b);
        int B = Math.max(a, b);

        while(true) {
            answer++;
            if(A%2==1 && (B-A) == 1) {
                break;
            }
            if(A%2==0) A/=2;
            else A=(A+1)/2;
            if(B%2==0) B/=2;
            else B=(B+1)/2;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextInt(), input.nextInt(), input.nextInt()));
    }

}
