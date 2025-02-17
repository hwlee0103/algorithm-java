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
        int tmp = n;
        int now = 0;
        for(int i = 0; i < kilos.length; ++i) { // DP, 완탐
            now += tmp / kilos[i];
            tmp -= (tmp / kilos[i])  * kilos[i];
            // count = 5000 , now = n -> min
            // count = 5000 now -1 -> min
            // count != 5000, now -1 -> count
            // count != 5000 now n -> min
        }
        if(tmp > 0) {
            now = -1;
        }
        count = now;

        tmp = n;
        now = 0;
        // 3kg + 5kg 조합
        for(int i = kilos.length - 1; i >= 0; --i) {
            now += tmp / kilos[i];
            tmp -= (tmp / kilos[i])  * kilos[i];
        }
        if(tmp > 0) {
            now = -1;
        }
        if(!(count != 50000 && now == -1)) {
            count = (count == -1) ? now : Math.min(count, now);
        }

        System.out.println(count);
    }
}
