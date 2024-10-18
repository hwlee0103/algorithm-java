package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 특이한 정렬
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-06-10
 * Solved : 2024-06-13
 *
 *
 */
public class UnusualArrangement {
    public static int[] solution(int[] numlist, int n) {
        int[] differ = new int[numlist.length];

        for(int i = 0; i < numlist.length; ++i) {
            differ[i] = Math.abs(n - numlist[i]);
        }

        int tmp = 0;
        for(int i = 0; i < numlist.length; ++i) {
            for(int j = 0; j < i ; ++j) {
                if(differ[i] < differ[j]) {
                    tmp = numlist[j];
                    numlist[j] = numlist[i];
                    numlist[i] = tmp;

                    tmp = differ[j];
                    differ[j] = differ[i];
                    differ[i] = tmp;
                } else if(differ[i] == differ[j]) {
                    if(numlist[i] > numlist[j]) {
                        tmp = numlist[j];
                        numlist[j] = numlist[i];
                        numlist[i] = tmp;

                        tmp = differ[j];
                        differ[j] = differ[i];
                        differ[i] = tmp;
                    }
                }
            }
        }

        return numlist;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] numlist = new int[size];
        for(int i = 0; i < size; ++i) {
            numlist[i] = input.nextInt();
        }
        int n = input.nextInt();

        int[] answer = solution(numlist, n);
        System.out.print("[");
        for(int i = 0; i < size; ++i) {
            System.out.print(answer[i]);
            if(i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }
}
