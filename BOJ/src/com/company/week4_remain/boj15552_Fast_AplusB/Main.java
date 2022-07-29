package com.company.week4_remain.boj15552_Fast_AplusB;

/**
 * BOJ 15552 빠른 A + B
 */

import java.io.*;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Character.getNumericValue(input.read());
        System.out.println(t);
        for(int i = 0; i < t; ++i) {
            int a = Character.getNumericValue(input.read());
            //System.out.println("a: "+ a);
            //output.write(String.valueOf(a));
            int b = Character.getNumericValue(input.read());
            //System.out.println("b: "+ b);
            //output.write(String.valueOf(b));
            output.write(String.valueOf(a+b));
        }
        output.flush();
        output.close();
    }
}
