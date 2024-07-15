package java_problemsolving.levelzero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Level : 0
 * Title : 배열 만들기 1
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-07-15
 * Solved : 2024-07-15
 *
 * 문제
 * 정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
 *
 * 제한사항
 * 1 ≤ n ≤ 1,000,000
 * 1 ≤ k ≤ min(1,000, n)
 *
 * 입출력 예
 * n	k	result
 * 10	3	[3, 6, 9]
 * 15	5	[5, 10, 15]
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * 1 이상 10 이하의 3의 배수는 3, 6, 9 이므로 [3, 6, 9]를 return 합니다.
 * 입출력 예 #2
 * 1 이상 15 이하의 5의 배수는 5, 10, 15 이므로 [5, 10, 15]를 return 합니다.
 *
 */
public class MakingArray1 {
    public static int[] solution(int n, int k) {
        List<Integer> ans = new ArrayList<>();

        for(int i = k; i <= n; i +=k) {
            ans.add(i);
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] ans = solution(n, k);
        System.out.print("[");
        for(int i = 0; i < ans.length; ++i) {
            System.out.print(ans[i]);
            if(i < ans.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
