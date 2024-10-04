package java_problemsolving.levelzero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/**
 * Level : 0
 * Title : 배열 만들기 4
 * 문제 유형 : 코딩 기초 트레이닝
 *
 * Started : 2024-06-30
 * Solved : 2024-06-30
 *
 *
 */

public class MakeArray4 {
    public static int[] solution(int[] arr) {
        int[] stk = {};
        List<Integer> stkList = new ArrayList<>();
        int i = 0;
        while(i < arr.length){
            if(stkList.size() == 0) stkList.add(arr[i++]);
            else {
                if(stkList.get(stkList.size() - 1) < arr[i]) {
                    stkList.add(arr[i++]);
                } else {
                    stkList.remove(stkList.size() - 1);
                }
            }
        }
        stk = stkList.stream().mapToInt(e -> e).toArray();

        return stk;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] spStr = str.split(", ");
        int[] arr = new int[spStr.length];
        for(int i = 0; i < spStr.length; ++i) {
            arr[i] = Integer.valueOf(spStr[i]);
        }

        int[] answer = solution(arr);
        System.out.print("[");
        for(int i = 0; i < answer.length; ++i) {
            System.out.print(answer[i]);
            if(i < answer.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
