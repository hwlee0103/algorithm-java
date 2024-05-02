package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 2차원으로 만들기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-02
 * Solved : 2024-05-02
 *
 * 문제
 * 정수 배열 num_list와 정수 n이 매개변수로 주어집니다. num_list를 다음 설명과 같이 2차원 배열로 바꿔 return하도록 solution 함수를 완성해주세요.
 * num_list가 [1, 2, 3, 4, 5, 6, 7, 8] 로 길이가 8이고 n이 2이므로 num_list를 2 * 4 배열로 다음과 같이 변경합니다.
 * 2차원으로 바꿀 때에는 num_list의 원소들을 앞에서부터 n개씩 나눠 2차원 배열로 변경합니다.
 *
 * num_list	                n	result
 * [1, 2, 3, 4, 5, 6, 7, 8]	2	[[1, 2], [3, 4], [5, 6], [7, 8]]
 *
 * 제한사항
 * num_list의 길이는 n의 배 수개입니다.
 * 0 ≤ num_list의 길이 ≤ 150
 * 2 ≤ n < num_list의 길이
 *
 * 제한사항
 * num_list	                            n	result
 * [1, 2, 3, 4, 5, 6, 7, 8]	            2	[[1, 2], [3, 4], [5, 6], [7, 8]]
 * [100, 95, 2, 4, 5, 6, 18, 33, 948]	3	[[100, 95, 2], [4, 5, 6], [18, 33, 948]]
 *
 */
public class MakeTwoD {
    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        for(int i = 0; i < num_list.length/n; ++i) {
            for(int j = 0 ;j < n; ++j) {
                answer[i][j] = num_list[i*n+j];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String strlist = input.nextLine();
        input.reset();
        strlist = strlist.replace("[", "");
        strlist = strlist.replace("]", "");
        String[] splitlist = strlist.split(", ");
        int[] num_list = new int[splitlist.length];
        for(int i = 0; i < splitlist.length; ++i) {
            num_list[i] = Integer.valueOf(splitlist[i]);
        }
        int n = input.nextInt();

        int[][] result = solution(num_list, n);
        String ans = "";
//        System.out.print("[[");
        ans += "[[";
        for(int i = 0; i < result.length; ++i) {
            for(int j = 0; j < result[i].length; ++j) {
//                System.out.print(result[i][j]);
                ans += String.valueOf(result[i][j]);
                if(j < result[i].length - 1) {
//                    System.out.print(", ");
                    ans += ", ";
                }

            }
            if(i < result.length - 1) {
//                System.out.print("], [");
                ans += "], [";
            }

        }
//        System.out.println("]]");
        ans += "]]";
        System.out.println(ans);
    }
}
