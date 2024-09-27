package java_problemsolving.levelzero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 세 개의 구분자
 * 문제 유형 : 문자열
 *
 * Started : 2024-08-21
 * Solved : 2024-08-21
 *
 *
 */
public class ThreeSeparators {
    public static String[] solution(String myStr) {
        List<String> ansList = new ArrayList<>();
        int idx = 0;
        for(int i = 0; i < myStr.length(); ++i) {
            if(myStr.charAt(i) == 'a' || myStr.charAt(i) == 'b' || myStr.charAt(i) == 'c') {
                String now = myStr.substring(idx, i);
                if(!now.equals("")) {
                    ansList.add(now);
                }
                idx = i + 1;
            }
        }
        if(idx < myStr.length()) {
            ansList.add(myStr.substring(idx, myStr.length()));
        }
        if(ansList.size() == 0) {
            ansList.add("EMPTY");
        }
        return ansList.stream().toArray(String[]::new);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(solution(input.nextLine())));
    }
}
