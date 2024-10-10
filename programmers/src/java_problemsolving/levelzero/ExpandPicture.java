package java_problemsolving.levelzero;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 그림 확대
 * 문제 유형 : 반복문 활용
 *
 * Started : 2024-09-11
 * Solved : 2024-09-11
 *
 *
 */
public class ExpandPicture {
    public static String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];

        int idx = 0;
        for(int i = 0; i < picture.length; ++i ) {
            String now = "";
            for(int j = 0; j < picture[0].length(); ++j) {
                for(int m = 0; m < k; ++m) {
                    now += picture[i].charAt(j) + "";
                }
            }

            for(int l = 0; l < k; l++) {
                answer[idx++] = now;
                System.out.println(now);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] picture = input.nextLine().replaceAll("\"", "").split(", ");
        System.out.println(Arrays.toString(solution(picture, input.nextInt())));
    }
}
