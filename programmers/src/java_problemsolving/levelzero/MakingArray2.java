package java_problemsolving.levelzero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 배열 만들기 2
 * 문제 유형 : 코딩 기초 트레이닝
 *
 * Started : 2024-06-26
 * Solved : 2024-06-29
 *
 *
 */
public class MakingArray2 {
    public static int[] solution(int l, int r) {
        List<Integer> intArray = new ArrayList<>();
        intArray = func(l, r, 5, intArray);
        intArray.sort(Integer::compareTo);
        int[] answer = new int[intArray.size()];

        for(int i = 0; i < intArray.size(); ++i) {
            answer[i] = intArray.get(i);
        }

        if(answer.length == 0) {
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }

    public static List<Integer> func(int l, int r, int now, List<Integer> intArray) {
        if(now > r) return intArray;
        else {
            if(now >= l) {
                intArray.add(now);
            }
            intArray = func(l, r, now*10, intArray);
            intArray = func(l, r, now*10+5, intArray);
        }
        return intArray;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        int r = input.nextInt();
        int[] answer = solution(l, r);
        System.out.print("[");
        for(int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]);
            if(i < answer.length -1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
