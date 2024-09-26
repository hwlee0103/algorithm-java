package java_problemsolving.leveltwo;

import java.util.*;

/**
 * Level : 2
 * Title : 귤 고르기
 * 문제 유형 : 연습문제
 *
 * Started : 2024-09-12
 * Retry : 2024-09-26
 * Solved : 2024-09-26
 *
 */
public class SelectingTangerine {
    public static int solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for(Map.Entry<Integer, Integer> entry : list) {
            if(k > 0) {
                answer++;
                k -= entry.getValue();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        int[] tangerine = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(n, tangerine));
    }
}
