package baekjoononline.mathematics.blue;

import java.util.Scanner;

/**
 * Level : Blue 4
 * Title : 2839 설탕 배달
 * 문제 유형 : 수학 Mathematics
 *
 * Started : 2025-02-17
 * Solved : 2025-02-
 *
 *
 */

public class boj2839SugarDelivery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] kilos = {5, 3};
        int count = 50000;
        // 5kg + 3kg 조합
        for(int i = 0; i < kilos.length; ++i) { // DP
            int tmp = n;
            int now = 0;
            for(int j = i; j < kilos.length; ++j) {
                now += tmp / kilos[j];
                tmp -= (tmp / kilos[j]) * kilos[j];
            }
            if(tmp > 0) {
                now = -1;
            }
            // count = 5000 , now = n -> min
            // count = 5000 now -1 -> min
            // count != 5000, now -1 -> count
            // count != 5000 now n -> min
            if(!(count != 50000 && now == -1)) {
                count = (count == -1) ? now : Math.min(count, now);
            }
        }

        System.out.println(count);
    }
}
