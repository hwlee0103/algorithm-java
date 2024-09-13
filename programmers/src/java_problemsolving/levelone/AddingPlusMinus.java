package java_problemsolving.levelone;

import java.util.Scanner;

/**
 * Level : 1
 * Title : 음양 더하기
 * 문제 유형 : 월간 코드 챌린지 시즌2
 *
 * Started : 2024-07-12
 * Solved : 2024-07-12
 *
 */
public class AddingPlusMinus {
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0;i < absolutes.length; ++i) {
            if(signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] spSt = str.split(",");
        String bstr = input.nextLine();
        String[] bSp = bstr.split(",");

        int[] absolutes = new int[spSt.length];
        for(int i = 0; i < spSt.length; ++i) {
            absolutes[i] = Integer.valueOf(spSt[i]);
        }
        boolean[] signs = new boolean[bSp.length];
        for(int i = 0; i < bSp.length; ++i) {
            signs[i] = Boolean.valueOf(bSp[i]);
        }

        System.out.println(solution(absolutes, signs));
    }
}
