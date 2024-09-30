package java_problemsolving.levelzero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Level : 0
 * Title : x 사이의 개수
 * 문제 유형 : 문자열
 *
 * Started : 2024-08-18
 * Solved : 2024-08-18
 *
 *
 */
public class NumBetweenX {
    public static int[] solution(String myString) {
        if(myString.charAt(myString.length() - 1) == 'x') {
            myString += " ";
        }

        String[] splitMyString = myString.split("x");
        List<Integer> ansList = new ArrayList<>();
        for(int i = 0; i < splitMyString.length; ++i) {
            if(splitMyString[i].equals(" ")) {
                ansList.add(0);
            } else {
                ansList.add(splitMyString[i].length());
            }
        }

        return ansList.stream().mapToInt(Integer::valueOf).toArray();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(solution(input.nextLine())));
    }
}
