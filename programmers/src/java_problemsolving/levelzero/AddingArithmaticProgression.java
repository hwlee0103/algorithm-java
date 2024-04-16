package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 등차수열의 특정한 항만 더하기
 * 문제 유형 : 조건문
 *
 * Started : 2024-04-07
 * Solved : 2024-04-07
 *
 *
 */
public class AddingArithmaticProgression {
    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for(int i = 0; i < included.length; ++i) {
            if(included[i] == true) {
                answer += a + (d * i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int a = input.nextInt();
        int d = input.nextInt();
        str = str.replace("[", "");
        str = str.replace("]", "");
        String[] spstr = str.split(", ");

        boolean[] included = new boolean[spstr.length];

        for(int i = 0; i < spstr.length; ++i) {
            included[i] = Boolean.parseBoolean(spstr[i]);
        }

        System.out.println(solution(a, d, included));

    }
}
