package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : OX퀴즈
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-22
 * Solved : 2024-05-22
 *
 *
 */
public class OXQuiz {
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; ++i) {
            String now = quiz[i];
            String[] splitNow = now.split(" ");
            int sum = Integer.valueOf(splitNow[0]);
            for(int j = 1; j < splitNow.length; ++j) {
                if(splitNow[j].equals("=")) {
                    answer[i] = (sum == Integer.valueOf(splitNow[j+1])) ? "O" : "X";
                }
                else {
                    if(splitNow[j].equals("+")) {
                        sum += Integer.valueOf(splitNow[j+1]);
                    } else if(splitNow[j].equals("-")){
                        sum -= Integer.valueOf(splitNow[j+1]);
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] quiz = new String[n];
        input.nextLine();
        for(int i = 0; i < n; ++i) {
            quiz[i] = input.nextLine();
        }
        String[] ans = solution(quiz);
        System.out.print("[");
        for(int i = 0; i <ans.length; ++i) {
            System.out.print("\"" + ans[i] + "\"");
            if(i != ans.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
