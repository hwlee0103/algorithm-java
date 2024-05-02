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
 * 문제
 * 머쓱이는 직육면체 모양의 상자를 하나 가지고 있는데 이 상자에 정육면체 모양의 주사위를 최대한 많이 채우고 싶습니다.
 * 상자의 가로, 세로, 높이가 저장되어있는 배열 box와 주사위 모서리의 길이 정수 n이 매개변수로 주어졌을 때,
 * 상자에 들어갈 수 있는 주사위의 최대 개수를 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * box의 길이는 3입니다.
 * box[0] = 상자의 가로 길이
 * box[1] = 상자의 세로 길이
 * box[2] = 상자의 높이 길이
 * 1 ≤ box의 원소 ≤ 100
 * 1 ≤ n ≤ 50
 * n ≤ box의 원소
 * 주사위는 상자와 평행하게 넣습니다.
 *
 * 제한사항
 * box	        n	result
 * [1, 1, 1]	1	1
 * [10, 8, 6]	3	12
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
