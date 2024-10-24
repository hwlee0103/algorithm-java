package java_problemsolving.levelzero.introductionsofps;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 소인수분해
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-07
 * Solved : 2024-05-07
 *
 *
 */
public class Factorization {
    public static int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 2; i <= n; ++i) {
            if(n%i==0) {
                while(n%i==0) {
                    n /= i;
                }
                arr.add(i);
            }
        }
        int[] answer = new int[arr.size()];
        arr.sort(Integer::compareTo);
        for(int i = 0;i < arr.size(); ++i) {
            answer[i] = arr.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] answer = solution(n);
        System.out.print("[");
        for(int i = 0;i < answer.length; ++i) {
            System.out.print(answer[i]);
            if(i < answer.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
