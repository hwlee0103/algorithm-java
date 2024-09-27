package java_problemsolving.levelzero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자열 잘라서 정렬하기
 * 문제 유형 : 문자열
 *
 * Started : 2024-08-18
 * Solved : 2024-08-18
 *
 *
 */
public class SplitAndSortString {
    public static String[] solution(String myString) {
        String[] splitString = myString.split("x");
        List<String> strList = new ArrayList<>();
        for(int i = 0;i < splitString.length; ++i) {
            if(!splitString[i].equals("")) {
                strList.add(splitString[i]);
            }
        }
        strList.sort(String::compareTo);
        return strList.stream().toArray(String[]::new);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(solution(input.nextLine())));
    }
}
