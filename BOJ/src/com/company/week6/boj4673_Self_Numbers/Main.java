package com.company.week6.boj4673_Self_Numbers;

/**
 * BOJ 4673 Self Numbers - 셀프 넘버
 */
public class Main {
    public static void main(String[] args) {
        int[] selfNumberCheck = new int[10001];

        for(int i = 1; i <= 10000; ++i) {
            int d = i;
            int tmp = i;
            while(tmp > 0) {
                d += tmp%10;
                tmp /= 10;
            }
            if(d <= 10000) selfNumberCheck[d] = 1;
        }

        for(int i = 1; i <= 10000; ++i) {
            if(selfNumberCheck[i] == 0)
                System.out.println(i);
        }
    }
}
