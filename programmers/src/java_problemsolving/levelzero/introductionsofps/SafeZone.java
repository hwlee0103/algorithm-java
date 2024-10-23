package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 안전지대
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-06-02
 * Solved : 2024-06-04
 *
 *
 */
public class SafeZone {
    public static int solution(int[][] board) {
        int answer = 0;
        int[][] effects = {{-1, -1}, {0, -1}, {1, -1}, {-1, 0}, {1, 0}, {-1, 1}, {0, 1}, {1, 1}};
        for(int i = 0; i < board.length; ++i) {
            for(int j = 0; j < board[i].length; ++j) {
                if(board[i][j] != 1) continue;
                for(int k = 0; k < effects.length ; ++k) {
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
// 5
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
//        String buf = input.nextLine();
//        List<String[]> inputStr = new ArrayList<>();
//        for(int i = 0;i < row ; ++i) {
//            String str = input.nextLine();
//            String[] spStr = str.split(", ");
//            inputStr.add(spStr);
//        }
        int[][] board = new int[row][row];
//        for(int i = 0;i < inputStr.size(); ++i) {
//            for(int j = 0; j < inputStr.get(0).length; ++j) {
////                board[i][j] = Stream.of(inputStr.get(i).).mapToInt(Integer::parseInt).toArray();
//            }
//        }
        for(int i = 0;i < row ; ++i ) {
            for(int j = 0;  j < row; ++j) {
                board[i][j] = input.nextInt();
            }
        }
        System.out.println(solution(board));
    }
}
