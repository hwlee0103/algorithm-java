package java_problemsolving.levelzero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 5명씩
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-07-29
 * Solved : 2024-07-29
 *
 *
 */
public class FivePeopleEach {
    public static String[] solution(String[] names) {
        String[] answer = {};
        List<String> ansList = new ArrayList<>();

        for(int i = 0; i < names.length; i += 5) {
            ansList.add(names[i]);
        }
        answer = ansList.toArray(String[]::new);
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = input.nextLine().split(", ");
        System.out.println(Arrays.toString(solution(names)));
    }
}
