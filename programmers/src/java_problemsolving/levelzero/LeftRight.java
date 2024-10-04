package java_problemsolving.levelzero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 왼쪽 오른쪽
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-07-25
 * Solved : 2024-07-25
 *
 *
 */
public class LeftRight {
    public static String[] solution(String[] str_list) {
        String[] answer = {};
        List<String> ansList = new ArrayList<>();
        for(int i = 0; i < str_list.length; ++i) {
            if(str_list[i].equals("l")) {
                for(int j = 0; j < i; ++j) {
                    ansList.add(str_list[j]);
                }
                break;
            } else if(str_list[i].equals("r")) {
                for(int j = i+1; j < str_list.length; ++j) {
                    ansList.add(str_list[j]);
                }
                break;
            }
        }
        answer = new String[ansList.size()];
        for(int i = 0; i < ansList.size(); ++i) {
            answer[i] = ansList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] str_list = input.nextLine().replaceAll("\"", "").split(", ");
        String[] answer = solution(str_list);
        System.out.print("[");
        for(int i = 0; i < answer.length; ++i) {
            System.out.print(answer[i]);
            if(i<answer.length-1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
