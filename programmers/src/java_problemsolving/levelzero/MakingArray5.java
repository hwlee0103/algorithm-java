package java_problemsolving.levelzero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 배열 만들기 5
 * 문제 유형 : 코딩 기초 트레이닝 - 문자열
 *
 * Started : 2024-07-10
 * Solved : 2024-07-10
 *
 *
 */
public class MakingArray5 {
    public static int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        List<Integer> ansList = new ArrayList<>();

        for(String nowStr : intStrs) {
            int now = Integer.valueOf(nowStr.substring(s, s + l));
            if(k < now) {
                ansList.add(now);
            }
        }

        answer = new int[ansList.size()];

        for(int i = 0;i < ansList.size(); ++i) {
            answer[i] = ansList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str = str.replaceAll("\"", "");
        String[] intStrs = str.split(",");
        int k = input.nextInt();
        int s = input.nextInt();
        int l = input.nextInt();

        int[] answer = solution(intStrs, k, s, l);
        System.out.print("[");
        for(int i = 0; i < answer.length; ++i) {
            System.out.print(answer[i]);
            if(i < answer.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
