package com.company.week4.boj14681_Quadrant_Selection;

import java.util.Scanner;

/**
 * BOJ 14681 Quadrant Selection
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        if(x>0) {
            if(y>0)
                System.out.println("1");
            else
                System.out.println("4");
        } else {
            if(y>0)
                System.out.println("2");
            else
                System.out.println("3");
        }
    }
}
