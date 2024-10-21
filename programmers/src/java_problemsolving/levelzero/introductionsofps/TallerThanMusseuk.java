package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 머쓱이보다 키 큰 사람
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-28
 * Solved : 2024-05-28
 *
 *
 */
public class TallerThanMusseuk {
    public static int solution(int[] array, int height) {
        int answer = 0;
        for(int now : array) {
            if(now > height) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String strArr = input.nextLine();
        strArr = strArr.replace("[", "");
        strArr = strArr.replace("]", "");
        String[] spStr = strArr.split(", ");
        int[] array = new int[spStr.length];
        for(int i = 0; i < spStr.length; ++i) {
            array[i] = Integer.parseInt(spStr[i]);
        }
        int height = input.nextInt();
        System.out.println(solution(array, height));
    }

}
