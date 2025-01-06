package java_problemsolving.pcceproblems;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * Level : 1
 * Title : [PCCE 기출문제] 10번 / 공원
 * 문제 유형 : [PCCE 기출문제]
 *
 * Started : 2025-01-06
 * Solved : 2025-01-06
 *
 *
 */
public class Park {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;

        Arrays.sort(mats);
        boolean flag = false;
        for (int i = mats.length - 1; i >= 0; i--) {
            for(int x = 0; x < park.length; x++) {
                for(int y = 0; y < park[x].length; y++) {
                    String now = park[x][y];
                    if(!now.equals("-1")) continue;
                    else {
                        flag = checkPark(x, y, park, mats[i]);
                        if(flag){
                            answer = mats[i];
                            break;
                        }
                    }
                }
                if(flag) break;
            }
            if(flag) break;
        }

        return answer;
    }

    public boolean checkPark(int startX, int startY, String[][] park, int mat) {
        boolean answer = true;

        for(int x = 0; x < mat; ++x) {
            for(int y = 0; y < mat; ++y) {
                int nowX = startX + x;
                int nowY = startY + y;
                if(nowX < 0 || nowY < 0 || nowX >= park.length || nowY >= park[x].length) {
                    answer = false;
                    break;
                }
                if(!park[nowX][nowY].equals("-1")) {
                    answer = false;
                    break;
                }
            }
            if(!answer) break;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("programmers/src/java_problemsolving/pcceproblems/Park_input.txt");
        Path outputPath = Paths.get("programmers/src/java_problemsolving/pcceproblems/Park_output.txt");
        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        String[] testCases = inputLines.toArray(new String[0]);
        String[] tcOutputs = outputLines.toArray(new String[0]);
        for(int i = 0; i < testCases.length; i++) {
            // tc 별로 확인
            String[] tcData = testCases[i].split("] \\[");
            System.out.println(Arrays.toString(tcData));
            String[] matsStr = tcData[0].replaceAll("\\[", "").replaceAll("]", "").split(",");
            int[] mats = Arrays.stream(matsStr).mapToInt(Integer::parseInt).toArray();
            String[] parkStr1 = tcData[1].split("], \\[");
            String[][] park = new String[parkStr1.length][];
            for(int j = 0; j < parkStr1.length; j++) {
                park[j] = parkStr1[j].replaceAll("\\[", "").replaceAll("]", "").replaceAll("\"", "").split(", ");
            }

            System.out.println("Test Case 1 >>");
            System.out.println("mats: ");
            System.out.println(Arrays.toString(mats));
            System.out.println("park: ");
            for(int j = 0; j < park.length; j++) {
                System.out.println(Arrays.toString(park[j]));
            }

            // solution 호출
            int answer = -1;
            answer = new Park().solution(mats, park);
            System.out.println("answer: " + answer + "\n            --------> " + ((answer == Integer.parseInt(tcOutputs[i])) ? "success" : "fail"));
            System.out.println("=====================================");
        }

    }
}
