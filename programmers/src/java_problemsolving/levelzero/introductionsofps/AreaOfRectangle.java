package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 직사각형 넓이 구하기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-28
 * Solved : 2024-05-28
 *
 *
 */
public class AreaOfRectangle {
    public static int solution(int[][] dots) {
        int answer = 1;
        int x0 = dots[0][0];
        int y0 = dots[0][1];
        for(int i = 1; i < 4; ++i) {
            if(x0 == dots[i][0]){
                answer *= Math.abs(dots[i][1] - y0);
            }
            if(y0 == dots[i][1]) {
                answer *= Math.abs(dots[i][0] - x0);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str = str.replace("[[", "");
        str = str.replace("]]", "");
        str = str.replace(" ", "");
        String[] splitStr = str.split("],");

        int[][] dots = new int[splitStr.length][2];
        for(int i = 0; i < splitStr.length ; ++i) {
            String[] splitItem = splitStr[i].split(",");
            dots[i][0] = Integer.valueOf(splitItem[0].replace("[", ""));
            dots[i][1] = Integer.valueOf(splitItem[1].replace("]", ""));
        }

        int answer = solution(dots);
        System.out.println(answer);
    }
}
