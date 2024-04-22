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
 * 문제
 * 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
 * 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * array의 길이는 홀수입니다.
 * 0 < array의 길이 < 100
 * -1,000 < array의 원소 < 1,000
 *
 * 입출력 예
 * array	            result
 * [1, 2, 7, 10, 11]	7
 * [9, -1, 0]	        0
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
