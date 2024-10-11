package java_problemsolving.levelzero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 리스트 자르기
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-07-17
 * Solved : 2024-07-17
 *
 *
 */
public class CuttingList {
    public static int[] solution(int n, int[] slicer, int[] num_list) {
        int start = 0;
        int end = num_list.length - 1;
        int diff = 0;
        switch (n) {
            case 1:
                end = slicer[1];
                break;
            case 2:
                start = slicer[0];
                break;
            case 3:
                start = slicer[0];
                end = slicer[1];
                break;
            case 4:
                start = slicer[0];
                end = slicer[1];
                diff = slicer[2];
                break;
        }
        List<Integer> ans = new ArrayList<>();
        if(diff == 0) {
            for(int i = start; i <= end; ++i) {
                ans.add(num_list[i]);
            }
        } else {
            for(int i = start; i <= end; i += diff) {
                ans.add(num_list[i]);
            }
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String str = input.nextLine();
        String[] spStr = str.split(", ");
        int[] slicer = new int[spStr.length];
        for(int i = 0; i < spStr.length; ++i) {
            slicer[i] = Integer.valueOf(spStr[i]);
        }
        str = input.nextLine();
        spStr = str.split(", ");
        int[] num_list = new int[spStr.length];
        for(int i = 0; i < spStr.length; ++i) {
            num_list[i] = Integer.valueOf(spStr[i]);
        }

        int[] answer = solution(n, slicer, num_list);
        System.out.print("[");
        for(int i = 0; i < answer.length; ++i) {
            System.out.print(answer[i]);
            if(i < answer.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
