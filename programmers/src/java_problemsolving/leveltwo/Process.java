package java_problemsolving.leveltwo;

import java.util.*;

/**
 * Level : 2
 * Title : 프로세스
 * 문제 유형 : 스택/큐
 *
 * Started : 2024-11-11
 * Solved : 2024-11-11
 *
 *
 */
public class Process {
    public class Pair{
//        Character alpha; // Character로 하면 tc 8 실패, char로 하면 성공
        char alpha;
        int priority;

        public Pair(Character alpha, int priority){
            this.alpha = alpha;
            this.priority = priority;
        }
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Pair> queue = new LinkedList<>();
        int charInt = 0;
        char alpha = ' ';
        for(int i = 0;i < priorities.length;i++){
            if(i == location) alpha = (char)(charInt + 'A');
            queue.add(new Pair((char)(charInt + 'A'), priorities[i]));
            charInt++;
        }
        // sort
        for(int i = 0; i < priorities.length;i++){
            for(int j = i + 1; j < priorities.length;j++){
                if(priorities[i] < priorities[j]){
                    int temp = priorities[i];
                    priorities[i] = priorities[j];
                    priorities[j] = temp;
                }
            }
        }
//        System.out.println(Arrays.toString(priorities));

        List<Pair> answers = new ArrayList<>();
        int pidx = 0;
        while(!queue.isEmpty()){
            if(priorities[pidx] == queue.peek().priority){
                answers.add(queue.poll());
                pidx++;
            } else {
                queue.add(queue.poll());
            }
        }

        // answer에는 리스트[location-1] 저장
        for(int i = 0; i < answers.size(); i++){
            if(alpha == answers.get(i).alpha) {
                answer = i + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] priorities = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int location = input.nextInt();
        System.out.println(new Process().solution(priorities, location));
    }
}
