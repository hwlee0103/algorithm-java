package java_problemsolving.levelone;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 1
 * Title : 로또의 최고 순위와 최저 순위
 * 문제 유형 : 2021 Dev-Matching: 웹 백엔드 개발자(상반기)
 *
 * Started : 2024-10-22
 * Solved : 2024-10-22
 *
 *
 */
public class HighestLowestLotto {
    public int wins(int cnt) {
        int answer = 0;
        switch(cnt) {
            case 6:
                answer = 1;
                break;
            case 5:
                answer = 2;
                break;
            case 4:
                answer = 3;
                break;
            case 3:
                answer = 4;
                break;
            case 2:
                answer = 5;
                break;
            default:
                answer = 6;
                break;
        }
        return answer;
    }

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int cnt = 0;
        int zeroCnt = 0;
        for(int i = 0; i < lottos.length; ++i) {
            if(lottos[i] == 0) {
                zeroCnt++;
                continue;
            }
            for(int j = 0; j < win_nums.length; ++j) {
                if(lottos[i] == win_nums[j]) {
                    cnt++;
                }
            }
        }

        // 최저
        answer[1] = wins(cnt);

        if(answer[1] == 1) {
            answer[0] = answer[1];
            return answer;
        }

        answer[0] = wins(cnt + zeroCnt);

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] lottos = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] win_nums = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(new HighestLowestLotto().solution(lottos, win_nums)));
    }
}
