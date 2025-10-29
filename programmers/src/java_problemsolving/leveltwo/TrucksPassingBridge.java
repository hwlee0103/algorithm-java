package java_problemsolving.leveltwo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * Level : 2
 * Title : 42583 다리를 지나는 트럭
 * 문제 유형 : 스택/큐
 *
 * Started : 2025-10-28
 * Solved : 2025-
 *
 *
 */

public class TrucksPassingBridge {
    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("programmers/src/java_problemsolving/leveltwo/input/TrucksPassingBridge_input.txt");
        Path outputPath = Paths.get("programmers/src/java_problemsolving/leveltwo/output/TrucksPassingBridge_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        int idx = 0;
        for(String line : inputLines) {
            System.out.println("Query #" + String.valueOf(idx + 1));
            String[] inputs = line.split(" ");

            int bridge_length = Integer.parseInt(inputs[0]);
            int weight = Integer.parseInt(inputs[1]);
            int[] truch_weights = Arrays.stream(inputs[2].replaceAll("\\[", "").replaceAll("]", "").split(",")).mapToInt(Integer::parseInt).toArray();

            System.out.println("bridge_length: " + bridge_length);
            System.out.println("weight: " + weight);
            System.out.println("truch_weights: " + Arrays.toString(truch_weights));
            System.out.println("-----------------");
            int answer = solution(bridge_length, weight, truch_weights);

            System.out.println("-----------------");
            System.out.println("Answer #" + answer);
            if(answer == Integer.parseInt(outputLines.get(idx))) {
                System.out.println("Success!");
            } else System.out.println("Failed!");
            System.out.println("=======================");
        }
    }

    public static class TruckOn {
        int truck_weight;
        int truck_on_sec;

        TruckOn(int truck_weight, int truck_on_sec) {
            this.truck_weight = truck_weight;
            this.truck_on_sec = truck_on_sec;
        }
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<TruckOn> queue = new LinkedList<>();

        int weight_now = 0;
        int sz = 0;
        int sec = 1;
        // todo: 반복문을 이걸로 가야하나? while(queue.size() >0)으로 해야할 지 고민해보기.
        for(int i = 0; i < truck_weights.length; i++) {
            System.out.println("queue: ");
            for(TruckOn truck_on : queue) {
                System.out.println("truck_weight: " + truck_on.truck_weight);
                System.out.println("truck_sec: " + truck_on.truck_on_sec);
            }

            // queue front 확인
            if(!queue.isEmpty()) {
                TruckOn truck = queue.poll();
                weight_now -= truck.truck_weight;
                sz = queue.size();
            }

            // weight check
            if((weight - weight_now) >= truck_weights[i]) {
                // time check
                // 큐에 없을 때 or 다리에 올라갈 수 있을 때
                if(sz == 0 || (sz - bridge_length >= 1)) {
                    queue.offer(new TruckOn(truck_weights[i], sec));
                    weight_now += truck_weights[i];
                }
            }
            sec++;
        }

        return answer;
    }
}
