package java_problemsolving.levelzero;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 1로 만들기
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-08-03
 * Solved : 2024-08-03
 *
 *
 */
public class MakeToOne {
    public static int solution(int[] num_list) {
        int answer = 0;
        for(int i = 0; i < num_list.length; ++i) {
            int now = num_list[i];
            while(now > 1) {
                if(now%2==0) {
                    now /=2;
                } else {
                    now = (now - 1)/2;
                }
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num_list = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::valueOf).toArray();
        System.out.println(solution(num_list));
    }
}
