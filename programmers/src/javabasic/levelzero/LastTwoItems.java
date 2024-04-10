package javabasic.levelzero;

import javax.swing.*;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 마지막 두 원소
 * 문제 유형 : 조건문
 *
 * Started : 2024-04-10
 * Solved : 2024-04-10
 *
 *
 */
public class LastTwoItems {
    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int lastItem = num_list[num_list.length - 1];
        int preItem = num_list[num_list.length - 2];

        for(int i = 0; i <= num_list.length ; ++i) {
            if(i == num_list.length) answer[i] = ((preItem < lastItem) ? lastItem - preItem : lastItem * 2);
            else answer[i] = num_list[i];
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
