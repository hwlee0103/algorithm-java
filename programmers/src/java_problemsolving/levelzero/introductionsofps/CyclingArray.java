package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 배열 회전시키기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-02
 * Solved : 2024-05-02
 *
 * 문제
 * 정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다.
 * 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 3 ≤ numbers의 길이 ≤ 20
 * direction은 "left" 와 "right" 둘 중 하나입니다.
 *
 * 제한사항
 * numbers	                    direction	result
 * [1, 2, 3]	                "right"	    [3, 1, 2]
 * [4, 455, 6, 4, -1, 45, 6]	"left"	    [455, 6, 4, -1, 45, 6, 4]
 *
 */
public class CyclingArray {
    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int dir = (direction.equals("right")) ? 1 : -1;
        int idx = 0;
        for(int i = 0;i < numbers.length; ++i) {
            idx = i + dir;
            if(idx < 0) idx = i+dir+numbers.length;
            answer[idx%numbers.length] = numbers[i];
        }
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
        String direction = input.nextLine();

        int[] answer = solution(numbers, direction);
        System.out.print("[");
        for(int i = 0;i < answer.length; ++i) {
            System.out.print(answer[i]);
            if(i < answer.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
