package java_problemsolving.levelone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Level : 1
 * Title : 크기가 작은 부분문자열
 * 문제 유형 : 연습문제
 *
 * Started : 2024-07-26
 * Solved : 2024-07-26
 *
 *
 */
public class LittleSizeSubstrings {
    public static int solution(String t, String p) {
        int answer = 0;
        List<String> strList = new ArrayList<>();
        for(int i = 0; i < t.length() - p.length() + 1; ++i) {
            strList.add(t.substring(i, i+p.length()));
        }
        strList.sort(Comparator.naturalOrder());
        for(String item : strList) {
            if(Long.valueOf(item) <= Long.valueOf(p)) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String t = input.nextLine();
        String p = input.nextLine();
        System.out.println(solution(t, p));
    }
}
