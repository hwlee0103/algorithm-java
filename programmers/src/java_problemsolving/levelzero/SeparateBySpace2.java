package java_problemsolving.levelzero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 공백으로 구분하기 2
 * 문제 유형 : 문자열
 *
 * Started : 2024-08-16
 * Solved : 2024-08-16
 *
 *
 */
public class SeparateBySpace2 {
    public static String[] solution(String my_string) {
        String[] strSp = my_string.split(" ");
        List<String> strList = new ArrayList<>();
        for(int i = 0; i < strSp.length; ++i) {
            if(!strSp[i].equals("") && !strSp[i].equals(" ")) {
                strList.add(strSp[i]);
            }
        }
        return strList.toArray(new String[strList.size()]);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(solution(input.nextLine())));
    }
}
