package java_problemsolving.levelzero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Level : 0
 * Title : ad 제거하기
 * 문제 유형 : 문자열
 *
 * Started : 2024-08-14
 * Solved : 2024-08-14
 *
 *
 */
public class RemoveAd {
    public static String[] solution(String[] strArr) {
        List<String> ansList = new ArrayList<>();
        for(int i = 0; i < strArr.length; ++i) {
            if(strArr[i].contains("ad")) {
                continue;
            } else {
                ansList.add(strArr[i]);
            }
        }
//        return ansList.toArray(new String[ansList.size()]);
        return ansList.stream().toArray(String[]::new);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(solution(input.nextLine().replaceAll("\"", "").split(","))));
    }

}
