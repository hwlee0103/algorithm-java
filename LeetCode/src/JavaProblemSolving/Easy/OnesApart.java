package JavaProblemSolving.Easy;

/**
 * Level : Easy
 * Title : 1437. Check If All 1's Are at Least Length K Places Away
 * Topic : Array, Weekly Contest 187
 *
 * Started : 2025-11-17
 * Solved : 2025-11-7
 * Time: -
 * Algorithm: Simulation
 *
 *
 *
 */
public class OnesApart {

    public boolean kLengthApart(int[] nums, int k) {
        int distance = 0;
        int prevIdx = -1;
        boolean answer = true;
        for(int i = 0; i < nums.length; ++i) {
            System.out.println("prev: " + prevIdx +", now: " + i);
            if(nums[i] == 1) {
                if(prevIdx != -1) {
                    distance = i - (prevIdx + 1);
                    if(distance >= k) answer = true;
                    else {
                        answer = false;
                        break;
                    }
                }
                prevIdx = i;
            }
        }

        return answer;
    }
}
