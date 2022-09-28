package com.company.week1to4_remain.boj15552_QuickAplusB;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * BOJ 15552 빠른 A + B
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int t = Integer.parseInt(br.readLine());

            for(int i = 0; i < t; ++i) {
                str = br.readLine();
                String[] nums = str.split(" ");
                int result = Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
                bw.write(String.valueOf(result));
                bw.newLine();
            }
            bw.flush();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
