package java_problemsolving.levelzero;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 커피 심부름
 * 문제 유형 : 조건문 활용
 *
 * Started : 2024-09-11
 * Solved : 2024-09-11
 *
 *
 */
public class CoffeeBuying {
    public static int solution(String[] order) {
        int answer = 0;

        Map<String, Integer> price = new HashMap<>();
        price.put("iceamericano", 4500);
        price.put("americanoice", 4500);
        price.put("hotamericano", 4500);
        price.put("americanohot", 4500);
        price.put("americano", 4500);
        price.put("anything", 4500);
        price.put("icecafelatte", 5000);
        price.put("cafelatteice", 5000);
        price.put("hotcafelatte", 5000);
        price.put("cafelattehot", 5000);
        price.put("cafelatte", 5000);

        for(int i = 0; i < order.length; i++) {
            answer += price.getOrDefault(order[i], 0);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] order = input.nextLine().replaceAll("\"", "").split(", ");
        System.out.println(solution(order));
    }
}
