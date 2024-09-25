package java_problemsolving.leveltwo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 2
 * Title : N개의 최소공배수
 * 문제 유형 : 연습문제
 *
 * Started : 2024-08-28
 * Solved : 2024-08-28
 *
 *
 */
public class NLcm {
    public static int solution(int[] arr) {
        return lcm(arr);
    }

    public static int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b, a%b);
    }

    public static int lcm(int[] arr) {
        int result = arr[0];
        for(int i = 1; i < arr.length; ++i) {
            result = getLcm(result, arr[i]);
        }
        return result;
    }

    public static int getLcm(int a, int b) {
        return (a * b)/gcd(Math.max(a, b), Math.min(a, b));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(Arrays.stream(input.nextLine().split(",")).mapToInt(Integer::valueOf).toArray()));
    }
}
