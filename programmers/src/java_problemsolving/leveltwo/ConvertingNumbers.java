package java_problemsolving.leveltwo;

import java.util.*;

/**
 * Level : 2
 * Title : 숫자 변환하기
 * 문제 유형 : 연습문제
 *
 * Started : 2024-12-10
 * Solved : 2024-12-10
 *2, 10, 6
 * 2
 *
 * 2, 12, 9
 * 2
 *
 * 2, 17, 3
 * 4
 *
 */
public class ConvertingNumbers {
    public int solution(int x, int y, int n) {
        return bfs(x, y, n);
    }

    public class Item {
        int num;
        int dist;

        public Item(int num, int dist) {
            this.num = num;
            this.dist = dist;
        }
    }

    public int bfs(int x, int y, int n) {
        int cnt = 1000001;
        Map<Integer, Boolean> map = new HashMap<>();
        Queue<Item> queue = new LinkedList<>();
        queue.add(new Item(x, 0));
        map.put(x, true);

        while(!queue.isEmpty()) {
            Item now = queue.poll();
            if(now.num > y) continue;
            else if(now.num == y) cnt = Math.min(now.dist, cnt);

            if(!map.containsKey(now.num + n) && now.num + n <= y) {
                queue.add(new Item(now.num + n, now.dist + 1));
                map.put(now.num + n, true);
            }
            if(!map.containsKey(now.num * 2) && now.num * 2 <= y) {
                queue.add(new Item(now.num * 2, now.dist + 1));
                map.put(now.num * 2, true);
            }
            if(!map.containsKey(now.num * 3) && now.num * 3 <= y) {
                queue.add(new Item(now.num * 3, now.dist + 1));
                map.put(now.num * 3, true);
            }
        }

        return (cnt == 1000001 ? -1 : cnt);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int n = input.nextInt();
        ConvertingNumbers solution = new ConvertingNumbers();
        System.out.println(solution.solution(x, y, n));
    }
}
