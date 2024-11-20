package java_problemsolving.leveltwo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Level : 2
 * Title : 롤케이크 자르기
 * 문제 유형 : 연습문제
 *
 * Started : 2024-11-20
 * Solved : 2024-11-20
 *
 *
 */
public class CuttingRollCake {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < topping.length; i++) {
            map2.put(topping[i], map2.getOrDefault(topping[i], 0) + 1);
        }

        for(int i = 0; i < topping.length; i++) {
            map1.put(topping[i], map1.getOrDefault(topping[i], 0) + 1);
            map2.put(topping[i], map2.getOrDefault(topping[i], 0) - 1);
            if(map2.get(topping[i]) == 0) { map2.remove(topping[i]); }
            if(map1.size() == map2.size()) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] topping = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(new CuttingRollCake().solution(topping));
    }
}
