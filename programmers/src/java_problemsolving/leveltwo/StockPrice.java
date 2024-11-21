package java_problemsolving.leveltwo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 2
 * Title : 주식가격
 * 문제 유형 : 스택/큐
 *
 * Started : 2024-11-21
 * Solved : 2024-
 *
 *
 */
public class StockPrice {
    public int[] solution(int[] prices) {
        int[] answer = {};


        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] prices = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(new StockPrice().solution(prices)));
    }
}
