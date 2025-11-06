package Easy;

/**
 * Level : Easy
 * Title : 50. Length of Last Word
 * Topic : String
 *
 * Started : 2025-11-06
 * Solved : 2025-11-06
 * Time: 01 min 43 sec
 * Algorithm: String 라이브러리 사용 -> 구현
 * 구현이 더 빠름!
 *
 *
 */

public class LengthOfLastWord {

    public int lengthOfLastWord2(String s) {
        int cnt = 0;
        for(int i = s.length() - 1; i >= 0; --i) {
            char now = s.charAt(i);
            if(now == ' ' && cnt > 0) break;
            else if(now != ' ') {
                cnt++;
            }
        }
        return cnt;
    }

    public int lengthOfLastWord(String s) {
        String[] splitStr = s.split(" ");
        return splitStr[splitStr.length-1].length();
    }
}
