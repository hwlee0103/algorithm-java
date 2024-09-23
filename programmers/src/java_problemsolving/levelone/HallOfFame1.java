package java_problemsolving.levelone;

import java.util.*;

/**
 * Level : 1
 * Title : 명예의 전당 (1)
 * 문제 유형 : 연습문제
 *
 * Started : 2024-08-23
 * Solved : 2024-08-23
 *
 *
 */
public class HallOfFame1 {
    public static int[] solution(int k, int[] score) {
        List<Integer> ansList = new ArrayList<>();
        List<Integer> board = new ArrayList<>();
        for(int i = 0; i < score.length; ++i) {
            board.add(score[i]);
            board.sort(Comparator.reverseOrder());
            if(board.size() < k) {
                ansList.add(board.get(board.size() - 1));
            } else {
                ansList.add(board.get(k - 1));
            }
        }

        return ansList.stream().mapToInt(Integer::valueOf).toArray();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        System.out.println(Arrays.toString(solution(n, Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray())));
    }
}
