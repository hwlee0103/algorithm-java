package java_problemsolving.leveltwo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 2
 * Title : 전화번호 목록
 * 문제 유형 : 해시
 *
 * Started : 2024-11-18
 * Solved : 2024-11-21
 *
 *
 */
public class PhoneNumberList {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
//        System.out.println(Arrays.toString(phone_book));

        String nowPre = phone_book[0];
        for(int i = 1; i < phone_book.length;i++) {
            if(phone_book[i].indexOf(nowPre) == 0) {
               answer = false;
               break;
            } else {
                nowPre = phone_book[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] phone_book = input.nextLine().replaceAll("\"", "").split(",");
        System.out.println(new PhoneNumberList().solution(phone_book));
    }
}
