package java_problemsolving;

import java.util.Scanner;

public class NumAlphabetMapping {
    public static int solution(String s) {
        int answer = 0;
        String[] button = new String[10];
        for(int i = 0; i < button.length; ++i) {
            button[i] = "";
        }

        boolean flag = false;
        int btn = 1;
        for(int i = 0; i < s.length(); i++) {
            // 존재여부
            for(int j = 1; j < button.length; j++) {
                if(button[j].contains(s.charAt(i) + "")) {
                    answer += button[j].indexOf(s.charAt(i) + "") + 1;
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }
            if(flag) {
                continue;
            }
            button[btn] += s.charAt(i) + "";
            answer += button[btn].length();
            btn = (btn + 1) % 10;
        }

        return answer;
    }
//    public static int solution(String s) {
//        int answer = 0;
//        Map<Character, Map<Integer, Integer>> map = new HashMap<>();
//
//        int button = 0;
//        int[] btnCnt = new int[10];
//
//        for(int i = 0; i < s.length(); i++) {
//            button = (button + 1) % 10;
//            if(map.containsKey(s.charAt(i))) {
//                Map<Integer, Integer> map2 = map.get(s.charAt(i));
//                Set<Integer> set = map2.keySet();
//                answer += map2.getOrDefault(set, 1);
//            } else {
//                btnCnt[button]++;
//                Map<Integer, Integer> tmp = new HashMap<>();
//                tmp.put(button, btnCnt[button]);
//                map.put(s.charAt(i), tmp);
//                answer += btnCnt[button];
//            }
//        }
//
//        return answer;
//    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextLine()));
    }
}
