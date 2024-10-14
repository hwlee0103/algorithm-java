package java_problemsolving.pcceproblems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : [PCCE 기출문제] 5번 / 심폐소생술
 * 문제 유형 : [PCCE 기출문제]
 *
 * Started : 2024-10-14
 * Solved : 2024-10-14
 *
 *
 */
public class Cpr {
    public static int[] solution(String[] cpr) {
        int[] answer = {0, 0, 0, 0, 0};
        String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};

        for(int i=0; i< cpr.length; i++){
            for(int j=0; j< basic_order.length; j++){
                if(cpr[i].equals(basic_order[j])){
                    answer[i] = j+1;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] cpr = input.nextLine().replaceAll("\"", "").split(", ");
        System.out.println(Arrays.toString(solution(cpr)));
    }
}
