package java_problemsolving.levelzero;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Level : 0
 * Title : 주사위 게임 3
 * 문제 유형 : 코딩 기초 트레이닝
 *
 * Started : 2024-07-01
 * Solved : 2024-07-07
 *
 *
 * 입출력 예
 * a	b	c	d	result
 * 2	2	2	2	2222
 * 4	1	4	4	1681
 * 6	3	3	6	27
 * 2	5	2	6	30
 * 6	4	2	5	2
 *
 *
 */
public class DiceGame3 {
    public static int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] dice = {a, b, c, d};
        Map<Integer, Integer> diceCnt = new HashMap<>();
        for(int i = 0; i < 4; ++i) {
            if(diceCnt.isEmpty() || !diceCnt.containsKey(dice[i])) {
                diceCnt.put(dice[i], 0);
            }
            if(diceCnt.get(dice[i]) > -1) {
                diceCnt.put(dice[i], diceCnt.get(dice[i]) + 1);
            }
        }

        Set<Integer> keySet = diceCnt.keySet();

        if(diceCnt.size() == 1) answer = 1111 * dice[0];
        else if(diceCnt.size() == 2) {
            boolean flag = false;
            int p = 0;
            int q = 0;
            int tmp = 0;
            for(Integer item : keySet) {
                if(diceCnt.get(item) == 3) {
                    flag = true;
                    p = item;
                } else if (diceCnt.get(item) == 1) {
                    q = item;
                } else {
                    if(tmp == 0) {
                        p = item;
                        tmp = item;
                    } else {
                        q = item;
                    }
                }
            }
            if(flag) {
                answer = (int)Math.pow((10*p + q), 2);
            } else {
                answer = (p + q) * Math.abs(p-q);
            }
        } else if(diceCnt.size() == 3) {
            int p = 0;
            int q = 0;
            int r = 0;
            int tmp = 0;
            for(Integer item : keySet) {
                if(diceCnt.get(item) == 2) {
                    p = item;
                } else {
                    if(tmp == 0) {
                        q = item;
                        tmp = item;
                    } else {
                        r = item;
                    }
                }
            }
            answer = q * r;
        } else {
            answer = Math.min(Math.min(a, b) ,Math.min(c, d));
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        System.out.println(solution(a, b, c, d));
    }
}
