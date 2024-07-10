package java_problemsolving.levelzero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 배열 만들기 5
 * 문제 유형 : 코딩 기초 트레이닝 - 문자열
 *
 * Started : 2024-07-10
 * Solved : 2024-07-10
 *
 * 문제
 * 문자열 배열 intStrs와 정수 k, s, l가 주어집니다.
 * intStrs의 원소는 숫자로 이루어져 있습니다.
 * 배열 intStrs의 각 원소마다 s번 인덱스에서 시작하는 길이 l짜리 부분 문자열을 잘라내 정수로 변환합니다.
 * 이때 변환한 정수값이 k보다 큰 값들을 담은 배열을 return 하는 solution 함수를 완성해 주세요.
 *
 * 제한사항
 * 0 ≤ s < 100
 * 1 ≤ l ≤ 8
 * 10l - 1 ≤ k < 10l
 * 1 ≤ intStrs의 길이 ≤ 10,000
 * s + l ≤ intStrs의 원소의 길이 ≤ 120
 *
 * 입출력 예
 * intStrs	                                    k	    s	l	result
 * ["0123456789","9876543210","9999999999999"]	50000	5	5	[56789, 99999]
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * idx에 따라 잘라낸 문자열과 그에 따른 ret의 변화를 표시하면 다음 표와 같습니다.
 * idx	잘라낸 문자열	ret
 * 0	"56789"	[56789]
 * 1	"43210"	[56789]
 * 2	"99999"	[56789, 99999]
 * 따라서 [56789, 99999]를 return 합니다.
 *
 */
public class MakingArray5 {
    public static int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        List<Integer> ansList = new ArrayList<>();

        for(String nowStr : intStrs) {
            int now = Integer.valueOf(nowStr.substring(s, s + l));
            if(k < now) {
                ansList.add(now);
            }
        }

        answer = new int[ansList.size()];

        for(int i = 0;i < ansList.size(); ++i) {
            answer[i] = ansList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str = str.replaceAll("\"", "");
        String[] intStrs = str.split(",");
        int k = input.nextInt();
        int s = input.nextInt();
        int l = input.nextInt();

        int[] answer = solution(intStrs, k, s, l);
        System.out.print("[");
        for(int i = 0; i < answer.length; ++i) {
            System.out.print(answer[i]);
            if(i < answer.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
