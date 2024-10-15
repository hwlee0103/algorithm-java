package java_problemsolving.pcceproblems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : [PCCE 기출문제] 6번 / 물 부족
 * 문제 유형 : [PCCE 기출문제]
 *
 * Started : 2024-10-15
 * Solved : 2024-10-15
 *
 *
 */
public class WaterShortage {
    public static int solution(int storage, int usage, int[] change) {
        int total_usage = 0;
        for(int i=0; i<change.length; i++){
            usage = usage + (usage * change[i] / 100);
            total_usage += usage;
            if(total_usage > storage){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int storage = input.nextInt();
        int usage = input.nextInt();
        input.nextLine();
        System.out.println(solution(storage, usage, Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::valueOf).toArray()));
    }
}
