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
