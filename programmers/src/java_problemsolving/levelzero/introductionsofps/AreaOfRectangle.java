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
 * 문제
 * 2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다.
 * 직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때,
 * 직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * dots의 길이 = 4
 * dots의 원소의 길이 = 2
 * -256 < dots[i]의 원소 < 256
 * 잘못된 입력은 주어지지 않습니다.
 *
 * 입출력 예
 * dots	                                result
 * [[1, 1], [2, 1], [2, 2], [1, 2]]	    1
 * [[-1, -1], [1, 1], [1, -1], [-1, 1]]	4
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
