package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 다음에 올 숫자
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-06-25
 * Solved : 2024-06-25
 *
 *
 */
public class NextNum {
    public static int solution(int[] common) {
        int answer = 0;
        // TODO 등비/등차 판별
        boolean isDiff = false;
        if((common[1] - common[0]) == (common[2] - common[1])) {
            isDiff = true;
        } else {
            isDiff = false;
        }

        if(isDiff) {
            answer = common[common.length - 1] + (common[1] - common[0]);
        } else {
            answer = common[common.length - 1] * (common[1]/common[0]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str = str.replace("[", "");
        str = str.replace("]", "");
        String[] spStr = str.split(", ");
        int[] common = new int[spStr.length];
        for(int i = 0; i < spStr.length; ++i) {
            common[i] = Integer.valueOf(spStr[i]);
        }

        System.out.println(solution(common));
    }
}
