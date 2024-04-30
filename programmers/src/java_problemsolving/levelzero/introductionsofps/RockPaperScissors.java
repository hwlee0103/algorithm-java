package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

public class RockPaperScissors {
    public static String solution(String rsp) {
        String answer = "";
        for(int i = 0; i < rsp.length(); ++i) {
            String c = String.valueOf(rsp.charAt(i));
            switch (c) {
                case "2":
                    answer += "0";
                    break;
                case "0":
                    answer += "5";
                    break;
                case "5":
                    answer += "2";
                    break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String rsp = input.nextLine();
        System.out.println(solution(rsp));
    }
}
