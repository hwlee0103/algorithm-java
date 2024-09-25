package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 특별한 이차원 배열 2
 * 문제 유형 : 이차원 리스트(배열)
 *
 * Started : 2024-09-24
 * Solved : 2024-09-24
 *
 *
 */
public class UniqueTwoDimensionalArray {
    public static int solution(int[][] arr) {
        int answer = 0;

        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr.length; ++j) {
                if(arr[i][j] != arr[j][i]) {
                    return 0;
                } else {
                    answer = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] str = input.nextLine().split("], \\[");
        int[][] arr = new int[str.length][str.length];
        for(int i = 0; i < str.length; ++i) {
            String[] spStr = str[i].replaceAll("\\[", "").replaceAll("]", "").split(", ");
            for(int j = 0; j < spStr.length; ++j) {
                arr[i][j] = Integer.parseInt(spStr[j]);
            }
        }
        System.out.println(solution(arr));
    }
}
