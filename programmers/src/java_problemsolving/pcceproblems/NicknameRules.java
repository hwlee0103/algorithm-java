package java_problemsolving.pcceproblems;

import java.util.Scanner;

/**
 * Level : 0
 * Title : [PCCE 기출문제] 8번 / 닉네임 규칙
 * 문제 유형 : [PCCE 기출문제]
 *
 * Started : 2024-10-14
 * Solved : 2024-10-14
 *
 *
 */
public class NicknameRules {
    public static String solution(String nickname) {
        String answer = "";
        for(int i=0; i<nickname.length(); i++){
            if(nickname.charAt(i) == 'l'){
                answer += "I";
            }
            else if(nickname.charAt(i) == 'w'){
                answer += "vv";
            }
            else if(nickname.charAt(i) == 'W'){
                answer += "VV";
            }
            else if(nickname.charAt(i) == 'O'){
                answer += "0";
            }
            else{
                answer += nickname.charAt(i);
            }
        }
        if(answer.length() < 3){
            answer += "o".repeat(4 - answer.length());
        }
        if(answer.length() > 8){
            answer = answer.substring(0, 8);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextLine()));
    }
}
