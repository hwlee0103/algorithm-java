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
 * Solved : 2025-10-29
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
            System.out.println("Answer: " + answer);
            if(answer == Integer.parseInt(outputLines.get(idx++))) {
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
        Queue<TruckOn> queue = new LinkedList<>();

        int weight_now = 0;
        int sec = 0;
        int idx = 0;
        // 첫 번째 트럭
        queue.add(new TruckOn(truck_weights[idx], sec));
        weight_now += truck_weights[idx++];

        List<Integer> finish = new ArrayList<>(); // 다 건넌 트럭 확인용 - todo: 추후 삭제

        while(!queue.isEmpty()) {
            TruckOn truck = queue.peek();
//            System.out.println("truck: " + truck.truck_weight + ", sec: " + truck.truck_on_sec);

            // 다리를 건너고 있는 트럭 중 맨 앞 트럭 확인
            if(bridge_length - (sec - truck.truck_on_sec) <= 0) {
                // 다 건넘
                queue.remove();
                finish.add(truck.truck_weight);
//                System.out.println("finish: " + finish.toString());
                weight_now -= truck.truck_weight;
            } else {
                // 아직 건너는 중 - pass
            }

            // 아직 트럭이 남아있을 때
            if(idx < truck_weights.length) {
                // 다음 트럭을 다리에 올릴 지 확인
                if(weight - weight_now >= truck_weights[idx]) {
                    // 무게가 가능할 때
                    if(bridge_length - queue.size() > 0) {
                        // 다리 위에 올라갈 공간이 있을 때
                        queue.add(new TruckOn(truck_weights[idx], sec));
                        weight_now += truck_weights[idx];
                        idx++;
                    } else {
                        // 다리 위에 올라갈 공간이 없을 때 - pass
                    }
                } else {
                    // 무게가 불가능 - pass
                }
            }

            sec++;
        }

        return sec;
    }
}
