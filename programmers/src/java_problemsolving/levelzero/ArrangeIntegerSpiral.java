package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 정수를 나선형으로 배치하기
 * 문제 유형 : 이차원 리스트(배열)
 *
 * Started : 2024-09-24
 * Solved : 2024-09-24
 *
 *
 */

public class ArrangeIntegerSpiral {
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        String[] direction = {"right", "down", "left", "up"};
        int minI = 0, minJ = 0;
        int maxI = n, maxJ = n;
        int dirIdx = 0, i = 0, j = 0;
        for(int num = 1; num <= n*n;) {
            switch(direction[dirIdx]) {
                case "right":
                    for(j = minJ; j < maxJ; j++) {
                        answer[i][j] = num++;
                    }
                    j--;
                    minI++;
                    break;
                case "down":
                    for(i = minI; i < maxI; i++) {
                        answer[i][j] = num++;
                    }
                    i--;
                    maxJ--;
                    break;
                case "left":
                    for(j = maxJ - 1; j >= minJ; j--) {
                        answer[i][j] = num++;
                    }
                    j++;
                    maxI--;
                    break;
                case "up":
                    for(i = maxI - 1; i >= minI; i--) {
                        answer[i][j] = num++;
                    }
                    i++;
                    minJ++;
                    break;
            }
            dirIdx = (dirIdx + 1) % 4;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] answer = solution(input.nextInt());
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                if(j == 0) {
                    System.out.print("[");
                }
                System.out.print(answer[i][j]);
                if(j == answer[i].length - 1) {
                    System.out.print("]");
                } else {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
