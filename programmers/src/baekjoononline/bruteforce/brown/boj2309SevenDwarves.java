package baekjoononline.bruteforce.brown;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : Brown 1
 * Title : 일곱난쟁이
 * 문제 유형 : Bruteforce
 *
 * Started : 2024-11-05
 * Solved : 2024-11-05
 *
 *
 */
public class boj2309SevenDwarves {
    public static int[] solution(int[] dwarves) {
        // 반복문 풀이
        int[] answer = new int[7];
        int height = 100;
        int total = 0;
        for(int i = 0; i < dwarves.length; i++) {
            total += dwarves[i];
        }

        for(int i = 0; i < dwarves.length; i++) {
            for(int j = i+1; j < dwarves.length; j++) {
                if(total - (dwarves[i] + dwarves[j]) == height) {
                    dwarves[i] = 1000;
                    dwarves[j] = 1000;
                    break;
                }
            }
            if(dwarves[i] == 1000) {
                break;
            }
        }
        Arrays.sort(dwarves);

        for(int i = 0; i < 7; ++i) {
            answer[i] = dwarves[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dwarves = new int[9];
        for(int i = 0; i < 9 ; ++i) {
            dwarves[i] = input.nextInt();
        }
//        int[] answer = new int[7];
//        int height = 100;
//        int total = 0;
//        for(int i = 0; i < dwarves.length; i++) {
//            total += dwarves[i];
//        }
//
//        for(int i = 0; i < dwarves.length; i++) {
//            for(int j = 0; j < dwarves.length; j++) {
//                if(i == j) continue;
//                if(total - (dwarves[i] + dwarves[j]) == height) {
//                    dwarves[i] = 1000;
//                    dwarves[j] = 1000;
//                    break;
//                }
//            }
//            if(dwarves[i] == 1000) {
//                break;
//            }
//        }
//        Arrays.sort(dwarves);
//
//        for(int i = 0; i < 7; ++i) {
//            answer[i] = dwarves[i];
//        }


//        System.out.println(Arrays.toString(solution(dwarves)));
        int[] answer = solution(dwarves);
        for(int i = 0; i < answer.length; ++i) {
            System.out.println(answer[i]);
        }
    }

}
