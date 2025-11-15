package JavaProblemSolving.Easy;

/**
 * Level : Easy
 * Title : 2169. Count Operations to Obtain Zero
 * Topic : Math, Simulation, Weekly Contest 280
 *
 * Started : 2025-11-08
 * Solved : 2025-11-08
 * Time: 02 min 53 sec
 * Algorithm: Math, Simulation 사용
 *
 *
 *
 */
public class CountOperations {
    public int countOperations(int num1, int num2) {
        int cnt = 0;
        while(!(num1 == 0 || num2 == 0)) {
            if(num1 >= num2) num1 -= num2;
            else num2 -= num1;
            cnt++;
        }
        return cnt;
    }
}
