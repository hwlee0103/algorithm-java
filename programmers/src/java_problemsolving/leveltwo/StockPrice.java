package java_problemsolving.leveltwo;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Level : 2
 * Title : 주식가격
 * 문제 유형 : 스택/큐
 *
 * Started : 2024-11-21
 * Solved : 2024-
 *
 * 입력값 〉 [3, 5, 2, 6, 7, 8, 1, 10, 9]
 * 기댓값 〉 [2, 1, 4, 3, 2, 1, 2, 1, 0]
 *
 */
public class StockPrice {
    public class Pair {
        int price;
        int index;

        public Pair(int price, int index) {
            this.price = price;
            this.index = index;
        }
    }

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Pair> stack = new Stack<>();
        for(int i = 0;i < prices.length;i++) {
            if(stack.empty() || (!stack.empty() && stack.peek().price <= prices[i])) {
                stack.push(new Pair(prices[i], i));
            } else {
                int cnt = 1;
                while(!stack.empty() && stack.peek().price > prices[i]) {
                    answer[stack.peek().index] = cnt++;
                    stack.pop();
                }
                stack.push(new Pair(prices[i], i));
            }
        }

        while(!stack.empty()) {
            answer[stack.peek().index] = (prices.length - 1) - stack.peek().index;
            stack.pop();
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] prices = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(new StockPrice().solution(prices)));
    }
}
