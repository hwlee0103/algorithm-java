package java_problemsolving.levelone;

import java.util.Scanner;

/**
 * Level : 1
 * Title : 카드 뭉치
 * 문제 유형 : 연습문제
 *
 * Started : 2024-10-02
 * Solved : 2024-10-02
 *
 *
 */
public class PackOfCards {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int index1 = 0;
        int index2 = 0;

        for(int i = 0; i < goal.length; ++i) {
            if(index1 < cards1.length && cards1[index1].equals(goal[i])) {
                index1++;
            } else if(index2 < cards2.length && cards2[index2].equals(goal[i])) {
                index2++;
            } else {
                return answer = "No";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] cards1 = input.nextLine().replaceAll("\"", "").split(", ");
        String[] cards2 = input.nextLine().replaceAll("\"", "").split(", ");
        String[] goal = input.nextLine().replaceAll("\"", "").split(", ");
        System.out.println(new PackOfCards().solution(cards1, cards2, goal));
    }
}
