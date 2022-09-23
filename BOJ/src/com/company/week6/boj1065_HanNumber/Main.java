package com.company.week6.boj1065_HanNumber;

import java.util.Scanner;

/**
 * BOJ 1065 한수
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int cnt = 0;

        if(n < 100) {
            cnt = n;
            System.out.println(cnt);
            return;
        } else {
            cnt = 99;
            for (int i = 100; i <= n; ++i) {
                int tmp = i;
                Boolean flag = true;
                int diff = ((tmp / 10) % 10) - (tmp % 10);
                tmp /= 10;
                while (tmp >= 10) {
                    if (diff != ((tmp / 10) % 10) - (tmp % 10)) {
                        flag = false;
                        break;
                    }
                    tmp /= 10;
                }
                if (flag == false) continue;
                else cnt++;
            }
        }
        System.out.println(cnt);
    }
}
