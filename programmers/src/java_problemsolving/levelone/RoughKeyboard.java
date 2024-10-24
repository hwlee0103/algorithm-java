package java_problemsolving.levelone;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 1
 * Title : 대충 만든 자판
 * 문제 유형 : 연습문제
 *
 * Started : 2024-10-24
 * Solved : 2024-10-24
 *
 *
 */
public class RoughKeyboard {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        // 알파벳 배열을 만들어서, 각 알파벳을 클릭하는 최소 개수 확인해서 넣어주기. 없으면 -1
        // 그리고 타겟 탐색해서 찾아서 넣어주면 됨.
        // string. index of 활용해보기
        int[] alpha = new int[26];
        for(int i = 0; i < 26; ++i) alpha[i] = -1;

        for(int al = 0; al < 26; ++al) {
            for(int i = 0; i < keymap.length; ++i) {
                char now = (char)(65 + al);
                if(keymap[i].indexOf(now) >= 0
                        && ((alpha[al] == -1 ) || (alpha[al] > 0 && keymap[i].indexOf(now) + 1 < alpha[al]))){
                    alpha[al] = keymap[i].indexOf(now) + 1;
                }
                // System.out.println(now);
            }
        }
//        System.out.println(Arrays.toString(alpha));

        for(int i = 0; i < targets.length; ++i) {
            for(int j = 0; j <targets[i].length(); ++j) {
                if(alpha[targets[i].charAt(j) - 65] == -1) {
                    answer[i] = -1;
                    break;
                }
                answer[i] += alpha[targets[i].charAt(j) - 65];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] keymap = input.nextLine().replaceAll("\"", "").split(", ");
        String[] targets = input.nextLine().replaceAll("\"", "").split(", ");
        System.out.println(Arrays.toString(new RoughKeyboard().solution(keymap, targets)));
    }
}
