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
 * 문제
 * 선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
 * 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
 * 삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
 * 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.
 *
 *
 * 제한사항
 * sides의 원소는 자연수입니다.
 * sides의 길이는 3입니다.
 * 1 ≤ sides의 원소 ≤ 1,000
 *
 * 입출력 예
 * sides	        result
 * [1, 2, 3]	    2
 * [3, 6, 2]	    2
 * [199, 72, 222]	1
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
