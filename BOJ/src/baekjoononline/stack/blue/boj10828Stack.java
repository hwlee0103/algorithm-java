package baekjoononline.stack.blue;

import java.util.Scanner;

/**
 * Level : Blue 4
 * Title : 스택
 * 문제 유형 : 스택
 *
 * Started : 2024-12-04
 * Solved : 2024-12-04
 *
 * TODO: list구현?
 *
 */
public class boj10828Stack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String[] strList = new String[n];
        for (int i = 0; i < n; i++) {
            strList[i] = input.nextLine();
        }
        int[] arr = new int[n];
        int idx = 0;

        for(int i = 0; i < n; i++){
            if(strList[i].contains("push")) {
                String[] sp = strList[i].split(" ");
                int number = Integer.parseInt(sp[1]);
                arr[idx++] = number;
            } else if(strList[i].contains("pop")) {
                if(idx == 0) {
                    System.out.println("-1");
                } else {
                    System.out.println(arr[--idx]);
                    arr[idx] = 0;
                }
            } else if(strList[i].contains("size")) {
                System.out.println(idx);
            } else if(strList[i].contains("empty")) {
                if(idx == 0) System.out.println("1");
                else System.out.println("0");
            } else if(strList[i].contains("top")) {
                if(idx == 0) System.out.println("-1");
                else System.out.println(arr[idx - 1]);
            }
        }
    }
}
