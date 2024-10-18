package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 중앙값 구하기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-22
 * Solved : 2024-04-22
 *
 *
 */
public class GetMiddleValue {
    public static int solution(int[] array) {
        // 선택정렬 (정렬 알고리즘 적용)
        for(int i = 0; i < array.length; ++i) {
            int now = array[i];
            for(int j = i + 1; j < array.length; ++j) {
                int next = array[j];
                if(next < now) {
                    array[i] = array[j];
                    array[j] = now;
                    now = array[i];
                }
            }
        }
        return array[(array.length-1)/2];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] spStr = str.split(", ");
        int[] array = new int[spStr.length];
        for(int i = 0;i < spStr.length; ++i) {
            array[i] = Integer.valueOf(spStr[i]);
        }
        System.out.println(solution(array));
    }
}
