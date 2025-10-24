package java_problemsolving.levelthree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

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
            inputArr[0] = inputArr[0].replaceAll("\\[", "");
            inputArr[1] = inputArr[1].replaceAll("]", "");
            String[] genres = inputArr[0].replaceAll("\"", "").split(", ");
            String[] play = inputArr[1].split(", ");
            int[] plays = Arrays.stream(play).mapToInt(Integer::parseInt).toArray();

            System.out.println("Query No: " + String.valueOf(idx + 1));
            System.out.println("genres: " + Arrays.toString(genres));
            System.out.println("plays: "  + Arrays.toString(plays));
            String ans = outputLines.get(idx);
//            System.out.println("------------");
            int[] answer = solution(genres, plays);

            System.out.println("------------");
            if(ans.equals(Arrays.toString(answer))) {
                System.out.println("Success!");
            } else System.out.println("Failed!");
            System.out.println("======================");
        }
    }

    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        // 장르별 총 플레이 수 & 내림차순 정렬
        Map<String, Integer> genreScore = new HashMap<String, Integer>();
        for(int i = 0; i < genres.length; ++i) {
            genreScore.put(genres[i], genreScore.getOrDefault(genres[i], 0) + plays[i]);
        }
//        System.out.println("GenreScore: " + genreScore);

        Map<String, Integer> sortedGenreScore = genreScore.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder())
                .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        // 장르별 곡별플레이수, 고유번호(i) & 내림차순 정렬
        Set<Map.Entry<String, Integer>> entry = sortedGenreScore.entrySet();
//        System.out.println("entry: " + entry);
        List<Integer> ans = new ArrayList<>();
        for(Map.Entry<String, Integer> item: entry) {
//            System.out.println("now: " + item);
            Map<Integer, Integer> idxScore = new HashMap<>();
            for(int i = 0; i < genres.length; ++i) {
                if(item.getKey().equals(genres[i])) {
                    idxScore.put(i, plays[i]);
                }
            }

            Map<Integer, Integer> sortedScore = idxScore.entrySet().stream()
                    .sorted(Map.Entry.<Integer, Integer>comparingByValue(Comparator.reverseOrder())
                            .thenComparing(Map.Entry.comparingByKey()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

//            System.out.println("sorted: " + sortedScore);

            // 2개 이상이면 2개 추가 & 1개면 다음 정렬
            Set<Map.Entry<Integer, Integer>> entrySet = sortedScore.entrySet();
            int idx = 0;
            for(Map.Entry<Integer, Integer> Item: entrySet) {
                if(idx < 2) {
                    ans.add(Item.getKey());
                    idx++;
                } else break;
            }
        }
//        System.out.println("ans: " + ans);
        answer = ans.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

}
