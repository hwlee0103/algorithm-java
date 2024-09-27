package java_problemsolving.pcceproblems;


import java.util.Scanner;

/**
 * Level : 0
 * Title : [PCCE 기출문제] 4번 / 저축
 * 문제 유형 : PCCE 기출문제
 *
 * Started : 2024-09-27
 * Solved : 2024-09-27
 *
 *
 */
public class Save {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int before = sc.nextInt();
        int after = sc.nextInt();

        int money = start;
        int month = 1;
        while (money < 70) {
            money += before;
            month++;
        }
        while (money < 100) {
            money += after;
            month++;
        }

        System.out.println(month);
    }
}
