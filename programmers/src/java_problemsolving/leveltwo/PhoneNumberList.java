package java_problemsolving.leveltwo;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Level : 2
 * Title : 전화번호 목록
 * 문제 유형 : 해시
 *
 * Started : 2024-11-18
 * Solved : 2024-
 *
 *
 */
public class PhoneNumberList {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> map = new HashMap<>();
        // TODO: 해결 방법 먼저 생각하기
        for(int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] phone_book = input.nextLine().replaceAll("\"", "").split(", ");
        System.out.println(new PhoneNumberList().solution(phone_book));
    }
}
