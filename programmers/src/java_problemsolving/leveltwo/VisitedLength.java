package java_problemsolving.leveltwo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Level : 2
 * Title : 방문길이
 * Topic : Summer/Winter Coding(~2018)
 *
 * Started : 2026-02-13
 * Solved : 2026-02-
 * Time: -
 * Algorithm: Simulation?
 * 제한: dirs의 길이는 500이하의 자연수
 * bfs, 범위: +-5, 단 방문 시 포인트 방문이 아니라 '경로'가 방문되었는지 여부가 중요
 * 그리고 한 점이 아닌 '길'이므로, 그 길을 방문했다는 걸 표현 필요.
 * 그럼 각 좌표를 노드로 생각하고 연결 그래프라고 생각한다면?
 * 양방향 연결 그래프
 * 근데 노드 기준이 아니라 간선을 방문하는 걸 체크해야 한다면?
 * 범위가 정해져 있으니 모든 연결 그래프를 저장해두고
 * 명령어에 따라서 방문 체크를 한다면 ?
 * 
 *
 *
 */
public class VisitedLength {
    public static void main(String[] args) throws IOException {
        String currentLevel = "java_problemsolving/leveltwo";
        String currentClass = "VisitedLength";
        String site = "programmers";
        Path inputPath = Paths.get(site + "/src/" + currentLevel +"/input/"+ currentClass + "_input.txt");
        Path outputPath = Paths.get(site + "/src/" + currentLevel +"/output/"+ currentClass + "_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        for(int i = 0; i < inputLines.size(); i++){
            System.out.println("Query #" + String.valueOf(i + 1));
            String dirs = inputLines.get(i).replaceAll("\"", "");
            System.out.println("dirs: " + dirs);
            int answer = solution(dirs);

            System.out.println("---------------");
            System.out.println("Answer: " + answer);
            System.out.print(" ==> ");
            if(answer == Integer.parseInt(outputLines.get(i))){
                System.out.println("Success!");
            } else System.out.println("Failed!");
            System.out.println("=====================");
        }
    }

    static class Position{
        int x = 0;
        int y = 0;
        public Position(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static int solution(String dirs) {
        int answer = 0;
        Position now = new Position(0, 0);


        return answer;
    }
}
