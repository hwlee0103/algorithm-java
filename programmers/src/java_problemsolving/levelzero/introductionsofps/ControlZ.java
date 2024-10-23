package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 컨트롤 제트
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-08
 * Solved : 2024-05-08
 *
 *
 */
public class ControlZ {
    public static int solution(String s) {
        int answer = 0;
        String[] spStr = s.split(" ");
        for(int i = 0; i < spStr.length; ++i) {
            if(spStr[i].equals("Z")) {
                answer -= Integer.valueOf(spStr[i-1]);
            } else {
                answer += Integer.valueOf(spStr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();
        System.out.println(solution(my_string));
    }
}
