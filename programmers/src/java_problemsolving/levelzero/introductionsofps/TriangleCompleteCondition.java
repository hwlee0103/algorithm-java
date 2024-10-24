package java_problemsolving.levelzero.introductionsofps;
/**
 * Level : 0
 * Title : 삼각형의 완성조건 (2)
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-06-04
 * Solved : 2024-06-04
 *
 *
 */
public class TriangleCompleteCondition {
    public static int solution(int[] sides) {
        int answer = 0;
        //주어진 두 변 중 하나가 최장길이 일 때
        int maxSide = Math.max(sides[0], sides[1]);
        int minSide = Math.min(sides[0], sides[1]);
        for(int i = maxSide - minSide + 1; i <= maxSide ; ++i) {
            answer++;
        }

        // 새로운 변의 길이가 최장길이 일 때
        for(int i = maxSide + 1; i < maxSide + minSide; ++i) {
            answer++;
        }
        return answer;
    }
}
