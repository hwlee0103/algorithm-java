package java_problemsolving.leveltwo;

import java.util.*;

/**
 * Level : 2
 * Title : 기능개발
 * 문제 유형 : 스택/큐
 *
 * Started : 2024-12-17
 * Solved : 2024-12-18
 *
 *
 *
95, 99, 99, 99, 99, 99
1, 1, 1, 1, 1, 1
[6]

85, 80, 90, 85
5, 5, 5, 5
[1, 3]

90, 90, 90
1, 5, 4
[3]

95, 95, 95, 95
4, 3, 2, 1
[2, 1, 1]

30, 30, 30
30, 30, 30
[3]

 99, 98
 1, 1
 [1, 1]

 99, 96, 94 // 나누고 나머지가 있을 경우 ! (각각 1일, 2일, 2일 걸림)
 1, 3, 4
 [1, 2]
 *
 */

public class FunctionDevelopment {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        List<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        int days = 0;
        for(int i = 0; i < progresses.length; i++) {
            int now = ((100 - progresses[i]) / speeds[i]) + (((100 - progresses[i]) % speeds[i]) > 0 ? 1: 0);

            if (stack.isEmpty()) {
                stack.push(now);
                days = now;
            } else {
                if (days >= now) {
                    stack.push(now);
                } else {
                    ans.add(stack.size());
                    while (!stack.isEmpty()) stack.pop();
                    stack.push(now);
                    days = now;
                }
            }
        }

        if(!stack.isEmpty()) ans.add(stack.size());
        answer = new int[ans.size()];
        for(int i = 0;i < ans.size();i++) {
            answer[i] = ans.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] progresses = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] speeds = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(new FunctionDevelopment().solution(progresses, speeds)));
    }
}
