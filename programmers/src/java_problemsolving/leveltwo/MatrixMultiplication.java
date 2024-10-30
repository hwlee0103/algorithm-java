package java_problemsolving.leveltwo;

import java_problemsolving.levelzero.introductionsofps.SumOfConsecutiveNums;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 2
 * Title : 행렬의 곱셈
 * 문제 유형 : 연습문제
 *
 * Started : 2024-10-30
 * Solved : 2024-10-30
 *
 *
 */
public class MatrixMultiplication {
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for(int i = 0; i < arr1.length; ++i) {
            for(int k = 0; k < arr2[0].length; ++k) {
                int sum = 0;
                for(int j = 0; j < arr1[i].length; ++j) {
                    sum += arr1[i][j] * arr2[j][k];
                }
                answer[i][k] = sum;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] spstr = str.split("], \\[");
        int[][] arr1 = new int[spstr.length][spstr[0].length()];
        for(int i = 0; i < spstr.length; ++i) {
            arr1[i] = Arrays.stream(spstr[i].replaceAll("\\[", "").replaceAll("]", "").split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        String str2 = input.nextLine();
        String[] spstr2 = str2.split("], \\[");
        int[][] arr2 = new int[spstr2.length][spstr2[0].length()];
        for(int i = 0; i < spstr2.length; ++i) {
            arr2[i] = Arrays.stream(spstr2[i].replaceAll("\\[", "").replaceAll("]", "").split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        int[][] answer = solution(arr1, arr2);
        System.out.println("[");
        for(int i = 0; i < answer.length; ++i) {
            System.out.println(Arrays.toString(answer[i]));
        }
        System.out.println("]");
    }
}
