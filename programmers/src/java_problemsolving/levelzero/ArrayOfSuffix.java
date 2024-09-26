package java_problemsolving.levelzero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 접미사 배열
 * 문제 유형 : 코딩 기초 트레이닝 - 문자열
 *
 * Started : 2024-07-10
 * Solved : 2024-07-10
 *
 *
 */
public class ArrayOfSuffix {
    public static String[] solution(String my_string) {
        String[] answer = {};

        ArrayList<String> ansStr = new ArrayList<>();
        for(int i = my_string.length() - 1; i >= 0; --i) {
            ansStr.add(my_string.substring(i, my_string.length()));
        }
        Collections.sort(ansStr);

        answer = new String[ansStr.size()];
        for(int i = 0; i < ansStr.size(); ++i) {
            answer[i] = ansStr.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();
        String[] answer = solution(my_string);

        System.out.print("[");
        for(int i = 0; i < answer.length; ++i) {
            System.out.print("\"" + answer[i] + "\"");
            if(i < answer.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
