package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 최빈값 구하기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-22
 * Solved : 2024-04-22
 *
 *
 */
public class GetMostFrequentValue {
    public static int solution(int[] array) {
        int maxCnt = 0; // 수량체크
        int[] check = new int[1001];
        int idx = 0;

        for(int item : array) {
            check[item]++;
        }
        for(int i = 0; i < 1001; ++i) {
            if(check[i] > maxCnt) {
                maxCnt = check[i];
                idx = i;
            } else if(check[i] == maxCnt) {
                idx = -1;
            }
        }

        return (idx == -1) ? -1 : idx;
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
