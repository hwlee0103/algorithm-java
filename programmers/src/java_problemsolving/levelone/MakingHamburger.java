package java_problemsolving.levelone;

import java.util.*;

/**
 * Level : 1
 * Title : 햄버거 만들기
 * 문제 유형 : 연습문제
 *
 * Started : 2024-11-04
 * Solved : 2024-11-04
 * test case 추가:
 * [1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1]
 * 3
 *
 */
public class MakingHamburger {
    public int solution(int[] ingredient) {
        int answer = 0;
        String now = "";
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < ingredient.length; ++i) {
            list.add(ingredient[i]);
            if(list.size() >= 4) {
                int j = 0;
                for(; j < 4; ++j) {
                    now += list.get(list.size() - 1 - j) + "";
                }
                if(now.equals("1321")) {
                    answer++;
                    for(int k = 0; k < j; ++k) {
                        list.remove(list.size() - 1);
                    }
                }
                now = "";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ingredient = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(new MakingHamburger().solution(ingredient));
    }
}
