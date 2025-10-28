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
 * Solved : 2025-10-24
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
//            int[] answer = solution(genres, plays);
            int[] answer = solution2(genres, plays);

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

    // 실패 - 성능 효율화 재확인
    public static int[] solution2(String[] genres, int[] plays) {
        int n = genres.length;

        // 1) 장르 총합 & 장르별 인덱스 목록 & 장르 최초 등장 위치(타이브레이크용)
        Map<String, Integer> total =  new HashMap<>();
        Map<String, List<Integer>> byGenre = new HashMap<>();
        Map<String, Integer> firstSeen = new HashMap<>();

        for(int i = 0; i < n; ++i) {
            total.put(genres[i], plays[i]);
            byGenre.computeIfAbsent(genres[i], k -> new ArrayList<>()).add(i);
            firstSeen.putIfAbsent(genres[i], i);
        }
//        System.out.println(total);

        // 2) 장르를 총합 내림차순으로 정렬 (키 리스트만)
        List<String> genreOrder = new ArrayList<>(total.keySet());
        genreOrder.sort((g1, g2) -> {
            int c = Integer.compare(total.get(g2), total.get(g1)); // desc by total
            if (c != 0) return c;
            return Integer.compare(firstSeen.get(g1), firstSeen.get(g2)); // tie-break
        });
//        System.out.println(genreOrder);

        // 3) 각 장르 내에서 정렬 없이 Top-2만 선형으로 선별
        List<Integer> ans = new ArrayList<>();
        for(String g: genreOrder) {
            List<Integer> ids = byGenre.get(g);
//            System.out.println(ids);
            int first = -1, second = -1;
            for(int idx: ids) {
                if(first == -1 || plays[idx] > plays[first] || (plays[idx] == plays[first] && idx < first)) {
                    second = first;
                    first = idx;
                } else if(second == -1 || plays[idx] > plays[second] ||  (plays[idx] == plays[second] && idx < second)) {
                    second = idx;
                }
            }
            if(first != -1) ans.add(first);
            if(second != -1) ans.add(second);
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
