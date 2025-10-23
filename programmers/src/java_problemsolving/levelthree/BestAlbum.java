package java_problemsolving.levelthree;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
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
    public static void main(String[] args) {
        Path inputPath =  Paths.get("programmers/src/java_problemsolving/levelthree/input/BestAlbum_input.txt");
        Path outputPath =  Paths.get("programmers/src/java_problemsolving/levelthree/output/BestAlbum_output.txt");

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
