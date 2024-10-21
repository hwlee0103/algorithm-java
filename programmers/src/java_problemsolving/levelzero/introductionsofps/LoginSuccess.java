package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 로그인 성공?
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-06-17
 * Solved : 2024-06-17
 *
 *
 */
public class LoginSuccess {
    public static String solution(String[] id_pw, String[][] db) {
        String answer = "";

        for(String[] item : db) {
            if(item[0].equals(id_pw[0])) {
                if(item[1].equals(id_pw[1])) {
                    answer = "login";
                    break;
                } else {
                    answer = "wrong pw";
                    break;
                }
            } else{
                answer = "fail";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str = str.replaceAll("\"", "");
        String[] id_pw = str.split(", ");
        int n = input.nextInt();
        String[][] db = new String[n][2];
        String buf = input.nextLine();
        String tmp = input.nextLine();
        String[] tmpSp = tmp.split("], ");
        for(int i = 0 ;i < n; ++i) {
            tmpSp[i] = tmpSp[i].replaceAll("\"", "");
            tmpSp[i] = tmpSp[i].replaceAll("\\[", "");
            tmpSp[i] = tmpSp[i].replaceAll("]", "");
            String[] item = tmpSp[i].split(", ");
            db[i][0] = item[0];
            db[i][1] = item[1];
        }
        System.out.println(solution(id_pw, db));
    }
}
