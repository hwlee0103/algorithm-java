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
 * 문제
 * 두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다.
 * 예를 들어 2와 7의 최소공배수는 14가 됩니다.
 * 정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다.
 * n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.
 *
 * 제한 사항
 * arr은 길이 1이상, 15이하인 배열입니다.
 * arr의 원소는 100 이하인 자연수입니다.
 *
 * 입출력 예
 * arr	        result
 * [2,6,8,14]	168
 * [1,2,3]	    6
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
