package com.company.week4_remain.boj2480_ThreeDice;

import java.util.Scanner;

/**
 * BOJ 2480 주사위 세개
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int diceOne = input.nextInt();
        int diceTwo = input.nextInt();
        int diceThree = input.nextInt();

        int reward = 0;
        if(diceOne == diceTwo && diceTwo == diceThree) {
            reward = 10000 + (diceOne*1000);
        } else if(diceOne == diceTwo && diceTwo != diceThree) {
            reward = 1000 + (diceOne * 100);
        } else if(diceOne == diceThree && diceThree != diceTwo) {
            reward = 1000 + (diceOne * 100);
        } else if(diceTwo == diceThree && diceThree != diceOne) {
            reward = 1000 + (diceTwo * 100);
        } else {
            reward = Math.max(diceOne, Math.max(diceTwo, diceThree)) * 100;
        }
        System.out.println(reward);
    }
}
