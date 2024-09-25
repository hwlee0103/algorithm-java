package java_problemsolving.leveltwo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Level : 2
 * Title : 영어 끝말잇기
 * 문제 유형 : Summer/Winter Coding(~2018)
 *
 * Started : 2024-08-31
 * Solved : 2024-08-31
 *
 *
 */
public class EnglishEnding {
    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        // 사람당 횟수
        int[] count = new int[n + 1];
        // 나온 단어
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < words.length; i++) {
            count[i%n + 1]++;

            if(!map.containsKey(words[i]) &&
                    ((i != 0 && words[i-1].charAt(words[i-1].length() - 1) == words[i].charAt(0)))
                    || (i == 0)) {
                map.put(words[i], 1);
            } else {
                answer[0] = i % n + 1;
                break;
            }
        }
        if(answer[0] == 0) {
            answer[1] = 0;
        } else {
            answer[1] = count[answer[0]];
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String[] words = input.nextLine().replaceAll("\"", "").split(", ");
        System.out.println(Arrays.toString(solution(n, words)));
    }
}
