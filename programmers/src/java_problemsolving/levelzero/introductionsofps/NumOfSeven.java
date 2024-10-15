package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 7의 개수
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-26
 * Solved : 2024-05-26
 *
 *
 *
 */
public class NumOfSeven {
    public static int solution(int[] array) {
        int answer = 0;
        String arrStr = "";
        for(int i = 0; i < array.length; ++i) {
            arrStr += String.valueOf(array[i]);
        }
        for(int i = 0; i <arrStr.length(); ++i) {
            if(arrStr.charAt(i) == '7') answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str = str.replace("[", "");
        str = str.replace("]", "");
        String[] spStr = str.split(", ");
        int[] num_list = new int[spStr.length];
        for(int i = 0; i < spStr.length; ++i) {
            num_list[i] = Integer.valueOf(spStr[i]);
        }

        System.out.println(solution(num_list));
    }


}
