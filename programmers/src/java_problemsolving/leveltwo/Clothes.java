package java_problemsolving.leveltwo;

import java.util.*;

/**
 * Level : 2
 * Title : 의상
 * 문제 유형 : 해시
 *
 * Started : 2024-11-01
 * Solved : 2024--
 *
 *
 */
public class Clothes {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> clothesCnt = new HashMap<String, Integer>();
        for(int i = 0; i < clothes.length; ++i) {
            int cnt = clothesCnt.getOrDefault(clothes[i][1], 0);
            clothesCnt.put(clothes[i][1], cnt + 1);
        }

        if(clothesCnt.size() <= 1) return clothes.length;

        for(Map.Entry<String, Integer> entry : clothesCnt.entrySet()) {
            answer *= entry.getValue() + 1;
        }

        return answer - 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] stinput = input.nextLine().split("], \\[");
        String[][] clothes = new String[stinput.length][];
        for(int i = 0; i < clothes.length; ++i) {
            clothes[i] = stinput[i].replaceAll("\\[", "").replaceAll("]", "").split(", ");
        }
        System.out.println(new Clothes().solution(clothes));
    }
}
