package java_problemsolving.leveltwo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 2
 * Title : H-Index
 * 문제 유형 : 정렬
 *
 * Started : 2024-10-31
 * Solved : 2024-10-31
 *
 *
 */
public class HIndex {
    public int solution(int[] citations) {
        int answer = 0;
        int len = citations.length;
        Arrays.sort(citations);

        for(int i = len - 1 ; i >= 0; i--) {
            if(citations[i] >= len - i) {
                answer = len - i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] citations = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(new HIndex().solution(citations));
    }
}
