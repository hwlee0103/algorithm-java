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
 * 문제
 * 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
 * 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
 *
 * 제한사항
 * 0 < array의 길이 < 100
 * 0 ≤ array의 원소 < 1000
 *
 * 입출력 예
 * array	            result
 * [1, 2, 3, 3, 3, 4]	3
 * [1, 1, 2, 2]	        -1
 * [1]	                1
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
