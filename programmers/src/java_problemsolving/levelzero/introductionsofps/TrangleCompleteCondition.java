package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 삼각형의 완성조건 (1)
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-09
 * Solved : 2024-05-09
 *
 *
 */
public class TrangleCompleteCondition {
    public static int solution(int[] sides) {
        int answer = 2;
        if(sides[0] >= sides[1] && sides[0] > sides[2] && sides[0] < sides[1] + sides[2]
        || sides[1] >= sides[0] && sides[1] > sides[2] && sides[1] < sides[0] + sides[2]
        || sides[2] >= sides[1] && sides[2] > sides[0] && sides[2] < sides[0] + sides[1]) {
            answer = 1;
        } else if (sides[0] == sides[1] && sides[1] == sides[2]) answer = 1;

//        int sum = 0;
//        for(int i = 0; i < 3; ++i) {
//            if(sides[i] > sides[(i+1)%3] && sides[i] > sides[(i+2)%3]) {
//                if(sides[i] < sides[(i+1)%3] + sides[(i+2)%3]) answer = 1;
//            }
//        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String strlist = input.nextLine();
        input.reset();
        strlist = strlist.replace("[", "");
        strlist = strlist.replace("]", "");
        String[] splitlist = strlist.split(", ");
        int[] numbers = new int[splitlist.length];
        for(int i = 0; i < splitlist.length; ++i) {
            numbers[i] = Integer.valueOf(splitlist[i]);
        }

        System.out.println(solution(numbers));
    }
}
