package java_problemsolving.leveltwo;

import java.util.*;

/**
 * Level : 2
 * Title : 가장 큰 수
 * 문제 유형 : 정렬
 *
 * Started : 2024-12-18
 * Solved : 2024-12-
 *
 */

public class BiggestNum {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String[] strNums = new String[numbers.length];
        for(int i = 0; i < numbers.length; ++i) {
            strNums[i] = String.valueOf(numbers[i]);
        }

        // 시간초과 --..

        for(int i = 0; i < strNums.length - 1; ++i) {
            for(int j = i + 1; j < strNums.length; ++j) {
                String a = strNums[i];
                String b = strNums[j];

                while(true) {
                    if (Objects.equals(a, "")){
                        break;
                    } else if(Objects.equals(b, "")) {
                        String temp = strNums[i];
                        strNums[i] = strNums[j];
                        strNums[j] = temp;
                        break;
                    }

                    if ((int) a.charAt(0) < (int) b.charAt(0)) {
                        String temp = strNums[i];
                        strNums[i] = strNums[j];
                        strNums[j] = temp;
                        break;
                    } else if ((int) a.charAt(0) == (int) b.charAt(0)) {
                        if(a.length() != 1) {
                            a = a.substring(1);
                        }
                        if(b.length() != 1) {
                            b = b.substring(1);
                        }
                    } else {
                        break;
                    }
                }
            }
        }

        for(String str: strNums) {
            answer.append(str);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(new BiggestNum().solution(numbers));
    }
}
