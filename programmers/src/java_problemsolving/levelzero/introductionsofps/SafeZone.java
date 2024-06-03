package java_problemsolving.levelzero.introductionsofps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 안전지대
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-06-02
 * Solved : 2024-06-
 *
 * 문제
 * 다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
 * image.png
 * 지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
 * 지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * board는 n * n 배열입니다.
 * 1 ≤ n ≤ 100
 * 지뢰는 1로 표시되어 있습니다.
 * board에는 지뢰가 있는 지역 1과 지뢰가 없는 지역 0만 존재합니다.
 *
 * 입출력 예
 * board	                                                                                                                result
 * [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 1, 0, 0], [0, 0, 0, 0, 0]]	                                16
 * [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 1, 1, 0], [0, 0, 0, 0, 0]]	                                13
 * [[1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1]]	0
 *
 */
public class SafeZone {
    public static int solution(int[][] board) {
        int answer = 0;
        int[][] effects = {{-1, -1}, {0, -1}, {1, -1}, {-1, 0}, {1, 0}, {-1, 1}, {0, 1}, {1, 1}};
        for(int i = 0; i < board.length; ++i) {
            for(int j = 0; j < board[i].length; ++j) {
                if(board[i][j] != 1) continue;
                for(int k = 0; k < effects.length ; ++i) {
                    int nowX = i + effects[k][0];
                    int nowY = j + effects[k][1];
                    if(nowX >= board.length || nowX < 0) continue;
                    if(nowY >= board[i].length || nowY < 0) continue;

                    if(board[nowX][nowY] == 0) board[nowX][nowY] = 2;
                }
            }
        }
        for(int i = 0; i < board.length; ++i) {
            for(int j = 0; j < board[i].length; ++j) {
                if(board[i][j] == 0) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] spStr = str.split("], ");
//        List<List<Integer>> bd = ;
        int idx = 0;
        for(String item : spStr) {
            item = item.replace("[", "");
            item = item.replace("]", "");
            String[] nowStr = item.split(", ");
            ArrayList<Integer> a = new ArrayList<>();
            for(String nowItem : nowStr) {
                a.add(Integer.parseInt(nowItem));
            }
//            bd.add(idx++, a);
        }
//        System.out.println(solution(bd.stream().mapToInt(i -> i).toArray()));
    }
}
