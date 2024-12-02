package java_problemsolving.levelthree;

import java.util.*;

/**
 * Level : 3
 * Title : 단어 변환
 * 문제 유형 : 깊이/너비 우선 탐색(DFS/BFS)
 *
 * Started : 2024-11-27
 * Solved : 2024-12-
 *
 * 너무 어렵게 생각하지 말 것! 다시 풀어보기
 *
 */
public class WordConversion {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        boolean[] visited = new boolean[words.length];

        answer = dfs(begin, target, words, visited, 0);

        return answer;
    }

    public int dfs(String begin, String target, String[] words, boolean[] visited, int cnt) {
        int answer = 0;
//        if(answer <= cnt) return 1000000;
        if(begin.equals(target)) {
            return cnt;
        }

        for (int i = 0; i < words.length; i++) {
            if(!visited[i] && wordDiff(begin, words[i])) {
                visited[i] = true;
                answer = dfs(words[i], target, words, visited, cnt + 1);
                visited[i] = false;
            }
        }

        return answer;
    }

    public boolean wordDiff(String a, String b) {
        boolean answer = false;
        int n = a.length();
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            if(a.charAt(i) != b.charAt(i)) {
                cnt++;
            }
        }
        if(cnt == 1) {
            answer = true;
        }

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
