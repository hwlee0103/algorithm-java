package java_problemsolving.levelzero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 할 일 목록
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-07-30
 * Solved : 2024-07-30
 *
 *
 */
public class ToDoLists {
    public static String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        List<String> ansList = new ArrayList<>();
        for(int i = 0; i < todo_list.length; ++i) {
            if(!finished[i]) {
                ansList.add(todo_list[i]);
            }
        }
        answer = ansList.toArray(String[]::new);
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] todo_list = input.nextLine().replaceAll("\"", "").split(", ");
        String[] str = input.nextLine().split(", ");
        boolean[] finished = new boolean[todo_list.length];
        for(int i = 0; i < todo_list.length; ++i) {
           finished[i] = Boolean.parseBoolean(str[i]);
        }

        String[] answer = solution(todo_list, finished);
        System.out.println(Arrays.toString(answer));
    }
}
