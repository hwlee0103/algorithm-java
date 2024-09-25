package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 정사각형으로 만들기
 * 문제 유형 : 이차원 리스트(배열)
 *
 * Started : 2024-09-25
 * Solved : 2024-09-25
 *
 */
public class MakeSquare {
    public static int[][] solution(int[][] arr) {
        int[][] answer = new int[Math.max(arr.length, arr[0].length)][Math.max(arr.length, arr[0].length)];
        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr[0].length; ++j) {
                answer[i][j] = arr[i][j];
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
        int[][] answer = solution(arr);
        for(int i = 0; i < answer.length; ++i) {
            System.out.print("[");
            for(int j = 0; j < answer[0].length; ++j) {
                System.out.print(answer[i][j]);
                if(j != answer[0].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
