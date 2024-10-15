package java_problemsolving.levelone;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Level : 1
 * Title : 폰켓몬
 * 문제 유형 : 해시
 *
 * Started : 2024-10-15
 * Solved : 2024-10-15
 *
 *
 */
public class Phoneketmon {
    public static int solution(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; ++i) {
            int now = map.getOrDefault(nums[i], 0);
            map.put(nums[i], now + 1);
        }

        if(map.size() >= nums.length/2){
            answer = nums.length/2;
        } else {
            answer = map.size();
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = Arrays.stream(input.nextLine().split(",")).mapToInt(Integer::valueOf).toArray();
        System.out.println(solution(nums));
    }
}
