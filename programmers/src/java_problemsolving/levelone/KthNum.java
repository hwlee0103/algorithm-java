package java_problemsolving.levelone;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 1
 * Title : K번째 수
 * 문제 유형 : 정렬
 *
 * Started : 2024-12-09
 * Solved : 2024-12-09
 *
 *
 */
public class KthNum {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; ++i) {
            int size = commands[i][1] - commands[i][0] + 1;
            int[] arr = new int[size];
            for(int j = 0; j < size; ++j) {
                arr[j] = array[j + commands[i][0] - 1];
            }
//            System.out.println("splited :: " + Arrays.toString(arr));
            // 정렬
            for(int j = 0; j < size; ++j) {
                int tmp = 0;
                for(int k = j + 1; k < size; ++k) {
                    if(arr[k] < arr[j]) {
                        tmp = arr[k];
                        arr[k] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
            answer[i] = arr[commands[i][2] - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        String cmdStr = input.nextLine();
        String[] spStr = cmdStr.split("], \\[");
        int[][] commands = new int[spStr.length][];
        for(int i = 0; i < spStr.length; ++i) {
            commands[i] = Arrays.stream(spStr[i].replaceAll("]", "").replaceAll("\\[", "").split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        int[] answer = new KthNum().solution(array, commands);
        System.out.println(Arrays.toString(answer));
    }
}
