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
 * 문제
 * 1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
 * 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
 * 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
 * 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
 * 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
 * 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
 * 네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
 *
 * 제한사항
 * a, b, c, d는 1 이상 6 이하의 정수입니다.
 *
 * 입출력 예
 * a	b	c	d	result
 * 2	2	2	2	2222
 * 4	1	4	4	1681
 * 6	3	3	6	27
 * 2	5	2	6	30
 * 6	4	2	5	2
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * 예제 1번에서 네 주사위 숫자가 모두 2로 같으므로 1111 × 2 = 2222점을 얻습니다. 따라서 2222를 return 합니다.
 * 입출력 예 #2
 * 예제 2번에서 세 주사위에서 나온 숫자가 4로 같고 나머지 다른 주사위에서 나온 숫자가 1이므로 (10 × 4 + 1)2 = 412 = 1681점을 얻습니다. 따라서 1681을 return 합니다.
 * 입출력 예 #3
 * 예제 3번에서 a, d는 6으로, b, c는 3으로 각각 같으므로 (6 + 3) × |6 - 3| = 9 × 3 = 27점을 얻습니다. 따라서 27을 return 합니다.
 * 입출력 예 #4
 * 예제 4번에서 두 주사위에서 2가 나오고 나머지 다른 두 주사위에서 각각 5, 6이 나왔으므로 5 × 6 = 30점을 얻습니다. 따라서 30을 return 합니다.
 * 입출력 예 #5
 * 예제 5번에서 네 주사위 숫자가 모두 다르고 나온 숫자 중 가장 작은 숫자가 2이므로 2점을 얻습니다. 따라서 2를 return 합니다.
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
