package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 첫 번째로 나오는 음수
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-07-17
 * Solved : 2024-07-17
 *
 *
 */
public class FirstNegative {
    public static int solution(int[] num_list) {
        int answer = -1;
        for(int i = 0; i < num_list.length ;++i) {
            if(num_list[i] < 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] spStr = str.split(", ");
        int[] num_list = new int[spStr.length];
        for(int i = 0; i < spStr.length; ++i) {
            num_list[i] = Integer.valueOf(spStr[i]);
        }
        System.out.println(solution(num_list));
    }
}
