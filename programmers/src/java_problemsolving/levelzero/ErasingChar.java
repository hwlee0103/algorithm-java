package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 글자 지우기
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-07-15
 * Solved : 2024-07-15
 *
 * 문제
 * 문자열 my_string과 정수 배열 indices가 주어질 때, my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
 *
 * 제한사항
 * 1 ≤ indices의 길이 < my_string의 길이 ≤ 100
 * my_string은 영소문자로만 이루어져 있습니다
 * 0 ≤ indices의 원소 < my_string의 길이
 * indices의 원소는 모두 서로 다릅니다.
 *
 * 입출력 예
 * my_string	            indices	                        result
 * "apporoograpemmemprs"	[1, 16, 6, 15, 0, 10, 11, 3]	"programmers"
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * 예제 1번의 my_string의 인덱스가 잘 보이도록 표를 만들면 다음과 같습니다.
 *
 * index	0	1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16	17	18
 * my_string	a	p	p	o	r	o	o	g	r	a	p	e	m	m	e	m	p	r	s
 * indices에 있는 인덱스의 글자들을 지우고 이어붙이면 "programmers"가 되므로 이를 return 합니다.
 *
 */
public class ErasingChar {
    public static String solution(String my_string, int[] indices) {
        String answer = "";

        char[] temp = my_string.toCharArray();
        for(int i = 0; i < indices.length; ++i) {
            temp[indices[i]] = '0';
        }
        for(int i = 0; i < temp.length; ++i) {
            if(temp[i] != '0') {
                answer += temp[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();
        String str = input.nextLine();
        String[] spStr = str.split(", ");
        int[] indices = new int[spStr.length];
        for(int i = 0; i < spStr.length; ++i) {
            indices[i] = Integer.valueOf(spStr[i]);
        }

        System.out.println(solution(my_string, indices));
    }
}
