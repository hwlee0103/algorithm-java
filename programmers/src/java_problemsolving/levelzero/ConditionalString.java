package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 조건 문자열
 * 문제 유형 : 조건문
 *
 * Started : 2024-04-05
 * Solved : 2024-04-05
 *
 *
 */
public class ConditionalString {
    public static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        switch (ineq + eq){
            case "<=":
                answer = (n <= m) ? 1 : 0;
                break;
            case ">=":
                answer = (n >= m) ? 1 : 0;
                break;
            case ">!":
                answer = (n > m) ? 1 : 0;
                break;
            case "<!":
                answer = (n < m) ? 1 : 0;
                break;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ineq = input.nextLine();
        String eq = input.nextLine();
        int n = input.nextInt();
        int m = input.nextInt();

        System.out.println(solution(ineq, eq, n, m));
    }
}
