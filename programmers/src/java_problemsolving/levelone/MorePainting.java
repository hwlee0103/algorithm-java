package java_problemsolving.levelone;

import java.util.*;

/**
 * Level : 1
 * Title : 덧칠하기
 * 문제 유형 : 연습문제
 *
 * Started : 2024-10-18
 * Solved : 2024-10-18
 *
 *
 */
public class MorePainting {
//    class Zone {
//        private int start;
//        private int end;
//
//        Zone(int start, int end) {
//            this.start = start;
//            this.end = end;
//        }
//    }

    public int solution(int n, int m, int[] section) {
        int answer = 0;

        if(m == 1) return section.length;

        // queue로 풀려고 했으나, 방법을 찾지 못함
        // 정답 확인
        int distance = 0;
        for(int i = 0; i < section.length; ++i) {
            if(section[i] <= distance) continue;
            distance = section[i] + m - 1;
            answer++;
        }


//        Queue<Zone> queue = new LinkedList<>();
//        int start = 0;
//        int end = 0;
//
//        for(int i = 0; i < section.length; i++) {
//            if(start == 0) start = section[i];
//            else {
//                if(end == 0) end = section[i];
//                else if(section[i] - end == 1) {
//                    end = section[i];
//                }
//            }
//
//            queue.add(new Zone(start, end));
//        }
//
//        for(int i = 1; i < n - m; ++i) {
//            int rollerStart = i;
//            int rollerEnd = i + m - 1;
//
//            if(queue.peek().start >= rollerStart && queue.peek().end <= rollerEnd) {
//                queue.poll();
//            }
//        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        input.nextLine();
        int[] section = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(new MorePainting().solution(n, m, section));
    }
}
