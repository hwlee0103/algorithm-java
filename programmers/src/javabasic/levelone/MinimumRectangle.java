package javabasic.levelone;

import java.util.Scanner;

/**
 * Level : 1
 * Title : 최소직사각형
 * 문제 유형 : 완전탐색
 *
 * Started : 2024-03-19
 * Solved : 2024-03-20
 *
 * TODO : 다시 풀어보기
 *
 */
public class MinimumRectangle {
    public static int solution(int[][] sizes) {
        int answer = 0;

        int len = sizes.length;
        int maxWidth = 0;
        int maxHeight = 0;

        for(int i = 0; i < len; ++i) {
            int nowWidth = 0;
            int nowHeight = 0;

            // 현재 직사각형의 가로/세로 길이 비교
            // 둘 중 큰 걸 가로로 취급, 작은 걸 세로로 취급
            if(sizes[i][0] >= sizes[i][1]) {
                nowWidth = sizes[i][0];
                nowHeight = sizes[i][1];
            } else {
                nowWidth = sizes[i][1];
                nowHeight = sizes[i][0];
            }
            // 가로 중 최대값 maxWidth, 세로 중 최대값 maxHeight
            maxWidth = nowWidth > maxWidth ? nowWidth : maxWidth;
            maxHeight = nowHeight > maxHeight ? nowHeight : maxHeight;
        }
        answer = maxWidth * maxHeight;

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str = str.replace("[[", "");
        str = str.replace("]]", "");
        str = str.replace(" ", "");
        String[] splitStr = str.split("],");

        int[][] rectangles = new int[splitStr.length][2];
        for(int i = 0; i < splitStr.length ; ++i) {
            String[] splitItem = splitStr[i].split(",");
            rectangles[i][0] = Integer.valueOf(splitItem[0].replace("[", ""));
            rectangles[i][1] = Integer.valueOf(splitItem[1].replace("]", ""));
        }

//        int sizes;
//        do {
//            System.out.print("직사각형 개수 : ");
//            // 직사각형 개수
//            sizes = input.nextInt();
//            if (sizes > 10000 || sizes < 1) {
//                System.out.println("직사각형 개수는 1이상 10000 이하인 자연수 입니다.");
//            }
//        } while(sizes > 10000 || sizes < 1);
//
//        int[][] rectangles = new int[sizes][sizes];

        // 각각 가로/세로 입력
//        for(int i = 0; i < sizes; ++i) {
//            System.out.print((i + 1) + "번 째 직사각형 가로 길이 : ");
//            int width = input.nextInt();
//            if(width > 1000 || width < 1) {
//                System.out.println("가로 길이는 1이상 1000 이하인 자연수 입니다.");
//                i--;
//                continue;
//            }
//
//            System.out.print((i + 1) + "번 째 직사각형 세로 길이 : ");
//            int height = input.nextInt();
//            if(height > 1000 || height < 1) {
//                System.out.println("세로 길이는 1이상 1000이하인 자연수 입니다.");
//                i--;
//                continue;
//            }
//            rectangles[i][0] = width;
//            rectangles[i][1] = height;
//        }

        int answer = solution(rectangles);
        System.out.println(answer);
    }
}
