package com.company.ibmtest.num1;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {
    public static int getMinLength(String seq){
        int minLen = 1000000;

        for(int i = 0; i < seq.length() - 1; ++i) {
            if(seq.substring(i, i + 1).equals("AB") || seq.substring(i, i + 1).equals("BB")) {
                String str = seq.substring(0, i) + seq.substring(i+2, seq.length());

                int res = getMinLength(str);
                minLen = (minLen > res) ? res : minLen;
            } else continue;
        }

        return minLen;


    }

}


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String seq = input.next();

        int result = Result.getMinLength(seq);

        System.out.println(result);
    }
}
