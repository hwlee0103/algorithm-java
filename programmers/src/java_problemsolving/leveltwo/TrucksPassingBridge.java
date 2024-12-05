package java_problemsolving.leveltwo;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Level : 2
 * Title : 다리를 지나는 트럭
 * 문제 유형 : 스택/큐
 *
 * Started : 2024-12-05
 * Solved : 2024-12-
 *
 *
 */

public class TrucksPassingBridge {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int weightSum = 0;
        Stack<Integer> stack = new Stack<>();


        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bridge_length = input.nextInt();
        int weight = input.nextInt();
        input.nextLine();
        int[] truck_weights = Arrays.stream(input.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println(new TrucksPassingBridge().solution(bridge_length, weight, truck_weights));
    }
}
