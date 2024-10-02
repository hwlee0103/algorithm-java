package java_problemsolving.levelzero;

import java.util.*;

/**
 * Level : 0
 * Title : 전국 대회 선발 고사
 * 문제 유형 : 함수(메소드)
 *
 * Started : 2024-08-29
 * Solved : 2024-08-31
 *
 *
 */
public class NationalCompetitionSelectionTest {
    public static int solution(int[] rank, boolean[] attendance) {
        int high = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int cnt = 3;
        while(cnt > 0) {
            high = rank.length + 1;
            for (int i = 0; i < rank.length; i++) {
                if (attendance[i]) {
                    if (rank[i] < high) {
                        high = rank[i];
                        if(cnt == 3) {
                            a = i;
                        } else if (cnt == 2) {
                            b = i;
                        } else {
                            c = i;
                        }
                    }
                }
            }
            if(cnt == 3) {
                attendance[a] = false;
            } else if (cnt == 2) {
                attendance[b] = false;
            } else {
                attendance[c] = false;
            }
            cnt--;
        }

        return 10000*a + 100*b + c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] rank = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::valueOf).toArray();

        String[] inputAttendance = input.nextLine().split(", ");
        boolean[] attendance = new boolean[inputAttendance.length];
        for (int i = 0; i < attendance.length; i++) {
            attendance[i] = Boolean.parseBoolean(inputAttendance[i]);
        }

        System.out.println(solution(rank, attendance));
    }
}
