package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 점의 위치 구하기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-02
 * Solved : 2024-05-02
 *
 *
 */
public class LocationOfDot {
    public static int solution(int[] dot) {
        return (dot[0] > 0) ? ((dot[1] > 0) ? 1 : 4) : ((dot[1] > 0) ? 2 : 3);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String strlist = input.nextLine();
        strlist = strlist.replace("[", "");
        strlist = strlist.replace("]", "");
        String[] splitlist = strlist.split(", ");
        int[] dot = new int[splitlist.length];
        for(int i = 0; i < splitlist.length; ++i) {
            dot[i] = Integer.valueOf(splitlist[i]);
        }

        System.out.println(solution(dot));
    }
}
