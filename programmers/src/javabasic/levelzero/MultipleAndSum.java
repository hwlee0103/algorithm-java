package javabasic.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 원소들의 곱과 합
 * 문제 유형 : 조건문
 *
 * Started : 2024-04-08
 * Solved : 2024-04-08
 *
 *
 */
public class MultipleAndSum {
    public static int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;

        for(int i = 0; i < num_list.length; ++i) {
            sum += num_list[i];
            mul *= num_list[i];
        }

        return (mul < Math.pow(sum, 2)) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String strlist = input.nextLine();
        strlist = strlist.replace("[", "");
        strlist = strlist.replace("]", "");
        String[] splitlist = strlist.split(", ");
        int[] num_list = new int[splitlist.length];
        for(int i = 0; i < splitlist.length; ++i) {
            num_list[i] = Integer.valueOf(splitlist[i]);
        }

        System.out.println(solution(num_list));
    }
}
