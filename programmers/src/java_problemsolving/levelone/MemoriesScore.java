package java_problemsolving.levelone;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Level : 1
 * Title : 추억 점수
 * 문제 유형 : 연습문제
 *
 * Started : 2024-09-30
 * Solved : 2024-09-30
 *
 *
 */
public class MemoriesScore {
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < name.length; ++i) {
            map.put(name[i], yearning[i]);
        }

        for(int i = 0; i < photo.length; ++i) {
            for(int j = 0; j < photo[i].length; ++j) {
                answer[i] += map.getOrDefault(photo[i][j], 0);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] name = input.nextLine().replaceAll("\"", "").split(", ");
        int[] yearning = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        String[] photoInput = input.nextLine().replaceAll("\"", "").split("], \\[");
        String[][] photo = new String[photoInput.length][];
        for(int i = 0; i < photo.length; ++i) {
            photo[i] = photoInput[i].replaceAll("\\[", "").replaceAll("]", "").split(", ");
        }
        System.out.println(Arrays.toString(solution(name, yearning, photo)));
    }
}
