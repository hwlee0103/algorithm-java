package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 배열 뒤집기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-24
 * Solved : 2024-04-24
 *
 *
 */
public class FilpArray {
    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int idx = 0;
        for(int i = num_list.length - 1; i >= 0; --i) {
            answer[idx++] = num_list[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] spStr = str.split(", ");
        int[] num_list = new int[spStr.length];
        for(int i = 0; i < spStr.length ; ++i) {
            num_list[i] = Integer.valueOf(spStr[i]);
        }

        int[] ansArr = solution(num_list);
        String ans = "[";
        for(int i = 0; i < ansArr.length; ++i) {
            ans += String.valueOf(ansArr[i]);
            if(i != ansArr.length - 1) ans += ", ";
        }
        ans += "]";
        System.out.println(ans);
    }
}
