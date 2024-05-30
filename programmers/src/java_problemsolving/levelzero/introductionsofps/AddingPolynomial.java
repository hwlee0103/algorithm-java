package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 다항식 더하기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-29
 * Solved :
 *
 * 문제
 * 한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다.
 * 다항식을 계산할 때는 동류항끼리 계산해 정리합니다.
 * 덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때,
 * 동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요.
 * 같은 식이라면 가장 짧은 수식을 return 합니다.
 *
 * 제한사항
 * 0 < polynomial에 있는 수 < 100
 * polynomial에 변수는 'x'만 존재합니다.
 * polynomial은 양의 정수, 공백, ‘x’, ‘+'로 이루어져 있습니다.
 * 항과 연산기호 사이에는 항상 공백이 존재합니다.
 * 공백은 연속되지 않으며 시작이나 끝에는 공백이 없습니다.
 * 하나의 항에서 변수가 숫자 앞에 오는 경우는 없습니다.
 * " + 3xx + + x7 + "와 같은 잘못된 입력은 주어지지 않습니다.
 * 0으로 시작하는 수는 없습니다.
 * 문자와 숫자 사이의 곱하기는 생략합니다.
 * polynomial에는 일차 항과 상수항만 존재합니다.
 * 계수 1은 생략합니다.
 * 결괏값에 상수항은 마지막에 둡니다.
 * 0 < polynomial의 길이 < 50
 *
 * 입출력 예
 * polynomial	result
 * "3x + 7 + x"	"4x + 7"
 * "x + x + x"	"3x"
 *
 */
public class AddingPolynomial {
    public static String solution(String polynomial) {
        String answer = "";
        String[] splitPoly = polynomial.split(" \\+ ");
        String x = "";
        String num = "";

        for(String item : splitPoly) {
            String nowX = "0";
            if(x.indexOf("x") > -1) {
                nowX = x.replace("x", "").equals("") ? "1" : x.replace("x", "");
            }
            if(item.indexOf("x") > -1) {
                String itemX = item.replace("x", "").equals("") ? "1" : item.replace("x", "");
                x = String.valueOf(Integer.parseInt(nowX) + Integer.parseInt(itemX)) + "x";
            } else {
                num += String.valueOf(Integer.parseInt((num.equals("") ? "0" : num) + Integer.parseInt((item.replace("x", "").equals("")) ? "0" : item.replace("x", ""))));
            }
        }
        if(num.length() > 0) {
            if(x.length() > 0) {
                answer += x + " + " + num;
            } else {
                answer += num;
            }
        } else{
            if(x.length() > 0){
                answer += x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String polynomial = input.nextLine();
        System.out.println(solution(polynomial));
    }
}
