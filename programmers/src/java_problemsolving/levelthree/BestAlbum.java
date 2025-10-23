package java_problemsolving.levelthree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Level : 3
 * Title : 베스트앨범 BestAlbum / 42579
 * 문제 유형 : 해시 Hash
 *
 * Started : 2025-10-23
 * Solved : 2025-
 *
 *
 */

public class BestAlbum {
    public static void main(String[] args) throws IOException {
        Path inputPath =  Paths.get("programmers/src/java_problemsolving/levelthree/input/BestAlbum_input.txt");
        Path outputPath =  Paths.get("programmers/src/java_problemsolving/levelthree/output/BestAlbum_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        int idx = 0;
        for(String line : inputLines) {
            String[] inputArr = line.split("], \\[");
            inputArr[0] = inputArr[0].replace("\\[", "");
            inputArr[1] = inputArr[1].replace("]", "");
            String[] genres = inputArr[0].replaceAll("\"", "").split(",");
            String[] plays = inputArr[1].split(",");
            

            List<Integer> answer = new ArrayList<>();

            System.out.println("Query No: " + String.valueOf(idx + 1));
            System.out.println("genres: ");
            System.out.println("plays: ");
            String ans = outputLines.get(idx);
            System.out.println("------------");
            if(ans.equals(answer.toString())) {
                System.out.println("Success!");
            } else System.out.println("Failed!");
            System.out.println("======================");
        }
    }

    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        // 장르별 총 플레이 수 & 내림차순 정렬
        Map<String, Integer> genreScore = new HashMap<String, Integer>();
        for(int i = 0; i < genres.length; ++i) {
            genreScore.put(genres[i], genreScore.getOrDefault(genres[i], 0) + plays[i]);
        }

        // 장르별 곡별플레이수, 고유번호(i) & 내림차순 정렬

        // 2개 이상이면 2개 추가 & 1개면 다음 정렬

        return answer;
    }

}
