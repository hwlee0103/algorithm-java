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
        String answer = "";
        String[] strNums = new String[numbers.length];
        for(int i = 0; i < numbers.length; ++i) {
            strNums[i] = String.valueOf(numbers[i]);
        }

        // 1차 내림차순 정렬
//        Arrays.sort(strNums, new sComparator());
        System.out.println(Arrays.toString(strNums));

        // 2차 내림차순 정렬 - 앞 숫자가 같을 경우(3, 30) 다음 자리수 비교(3 > 32, 31, 30) - 이게 1000까지 ..
        // 300 < 3 -> 3300 > 3003
        // TODO 버블 정렬?
        List<String> ans = new ArrayList<>();
        for(int i = 0; i < strNums.length - 1; ++i) {
            for(int j = i + 1; j < strNums.length; ++j) {
                int dv = 1000;
//                int nowA = numbers[i];
//                int nowB = numbers[j];
                String a = strNums[i];
                String b = strNums[j];
                int aidx = 0;
                int bidx = 0;

                while(dv > 0) {
                    if(a > b) { // 앞 숫자가 더 클 경우
                        ans.add(String.valueOf(nowA));
                        break;
                    } else if(nowA / dv < nowB / dv) {
                        String tmp = strNums[i];
                        strNums[i] = strNums[j];
                        strNums[j] = tmp;
//                        int tmp = numbers[i];
//                        numbers[i] = numbers[j];
//                        numbers[j] = tmp;
                        break;
                    } else { // 앞자리가 같을 때 뒷자리 비교필요 --> String
                        nowA %= dv;
                        nowB %= dv;
                        dv /= 10;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(numbers));

//        for(String str: strNums) {
//            answer += str;
//        }

        return answer;
    }

    public class sComparator implements Comparator<String> {
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(new BiggestNum().solution(numbers));
    }
}
