package java_problemsolving.leveltwo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 2
 * Title : 구명보트
 * 문제 유형 : 탐욕법(Greedy)
 *
 * Started : 2024-08-20
 * Solved : 2024-08-20
 *
 *
 */
public class Lifeboat {
    public static int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int idx = 0;
        for(int i = people.length - 1; i >= 0; --i) {
            if(idx > i) break;
            if(people[i] + people[idx] > limit) {
                answer++;
            } else {
                answer++;
                idx++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] people = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int limit = input.nextInt();
        input.nextLine();
        System.out.println(solution(people, limit));
    }
}
