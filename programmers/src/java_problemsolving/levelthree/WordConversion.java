package java_problemsolving.levelthree;

import java.util.Scanner;

/**
 * Level : 3
 * Title : 단어 변환
 * 문제 유형 : 깊이/너비 우선 탐색(DFS/BFS)
 *
 * Started : 2024-11-27
 * Solved : 2024-
 *
 *
 */
public class WordConversion {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;

        // 1: words를 1개차이인 애들을 graph로 연결(begin 부터 words 까지)

        // 알파벳 한 개 차이를 어떤 방식으로 판별할 것인가? 2중 for문도 시간초과는 아님

        // 2: dfs나 bfs로 탐색, 최단거리 return

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String begin = input.nextLine();
        String target = input.nextLine();
        String[] words = input.nextLine().replaceAll("\"", "").split(", ");
        System.out.println(new WordConversion().solution(begin, target, words));
    }
}
