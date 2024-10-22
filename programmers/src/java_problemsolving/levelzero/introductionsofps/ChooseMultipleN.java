package java_problemsolving.levelzero.introductionsofps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Level : 0
 * Title : n의 배수 고르기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-19
 * Solved : 2024-05-21
 *
 *
 */
public class ChooseMultipleN {
    public static int[] solution(int n, int[] numlist) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < numlist.length; ++i) {
            if(numlist[i]%n == 0) list.add(numlist[i]);
        }
        answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        input.reset();
        int n = input.nextInt();
//        input.remove();
        String[] spStr = str.split(", ");
        int[] numlist = new int[spStr.length];
        for(int i = 0; i < spStr.length ; ++i) {
            numlist[i] = Integer.valueOf(spStr[i]);
        }

        int[] ansArr = solution(n, numlist);
        String ans = "[";
        for(int i = 0; i < ansArr.length; ++i) {
            ans += String.valueOf(ansArr[i]);
            if(i != ansArr.length - 1) ans += ", ";
        }
        ans += "]";
        System.out.println(ans);
    }
}
