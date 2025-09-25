package java_problemsolving.leveltwo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Level : 2
 * Title : 더 맵게
 * 문제 유형 : 힙 Heap
 *
 * Started : 2025-09-25
 * Solved : 2025-09-25
 *
 *
 */
public class Spicier {
    public static void main(String[] args) {
        // todo - file input
        Path inputPath = Paths.get("programmers/src/java_problemsolving/leveltwo/Spicier_input.txt");
        Path outputPath = Paths.get("programmers/src/java_problemsolving/leveltwo/Spicier_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        int n = 2;
        int[] scoville = new int[n];
        int k = 0;
    }

    public static int solution(int[] scoville, int K) {
        PriorityQueue<Long> scovilles = new PriorityQueue<Long>();
        for(int i = 0; i < scoville.length; ++i) {
            scovilles.offer(Long.valueOf(scoville[i]));
            // System.out.println(i + "th: " + scoville[i]);
        }

        int cnt = 0;
        while(!scovilles.isEmpty() && scovilles.peek() < K) {
            long top = scovilles.poll();
            // System.out.println("top: " + top);

            if(scovilles.size() >= 1) {
                long next = scovilles.poll();
                // System.out.println("next: " + next);
                // System.out.println("------------");
                long newScoville = top + (next * 2);
                scovilles.offer(newScoville);
                // System.out.println("new: " + newScoville);
                // System.out.println("");
                cnt++;
            } else {
                break;
            }
        }

        return (scovilles.isEmpty() || (!scovilles.isEmpty() && scovilles.peek() < K )) ? -1 : cnt;
    }
}
