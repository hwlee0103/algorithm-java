package java_problemsolving.pcceproblems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : [PCCE 기출문제] 5번 / 산책
 * 문제 유형 : PCCE 기출문제
 *
 * Started : 2024-09-27
 * Solved : 2024-09-27
 *
 *
 */
public class Walk {
    public int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int [2];
        for(int i=0; i<route.length(); i++){
            switch(route.charAt(i)){
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    east--;
                    break;
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String route = input.nextLine();
        System.out.println(Arrays.toString(new Walk().solution(route)));
    }
}
