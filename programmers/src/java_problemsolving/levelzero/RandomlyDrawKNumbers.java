package java_problemsolving.levelzero;

import java.util.*;

/**
 * Level : 0
 * Title : 무작위로 K개의 수 뽑기
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-08-26
 * Solved : 2024-08-26
 *
 *
 */
public class RandomlyDrawKNumbers {
    public static int[] solution(int[] arr, int k) {
        List<Integer> ansList = new ArrayList<>();
        Boolean flag = false;
        for(int i = 0; i < arr.length; i++) {
            if(ansList.size() == k) {
                break;
            }
            flag = false;
            for(int j = 0; j < ansList.size(); ++j) {
                if(ansList.get(j) == arr[i]) {
                    flag = true;
                    continue;
                }
            }
            if(!flag) {
                ansList.add(arr[i]);
            }
        }

        if(ansList.size() < k) {
            for(int i = ansList.size(); i < k; ++i) {
                ansList.add(-1);
            }
        }

        return ansList.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(solution(Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::valueOf).toArray(), input.nextInt())));
    }
}
