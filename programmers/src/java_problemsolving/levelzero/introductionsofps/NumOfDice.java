package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 주사위의 개수
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-02
 * Solved : 2024-05-02
 *
 *
 */
public class NumOfDice {
    public static int solution(int[] box, int n) {
        int answer = 1;
        for(int now : box) {
            answer *= now/n;
        }

        return answer;
        // return (box[0]/n)*(box[1]/n)*(box[2]/n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String strlist = input.nextLine();
        input.reset();
        strlist = strlist.replace("[", "");
        strlist = strlist.replace("]", "");
        String[] splitlist = strlist.split(", ");
        int[] box = new int[splitlist.length];
        for(int i = 0; i < splitlist.length; ++i) {
            box[i] = Integer.valueOf(splitlist[i]);
        }
        int n = input.nextInt();
        System.out.println(solution(box, n));
    }
}
