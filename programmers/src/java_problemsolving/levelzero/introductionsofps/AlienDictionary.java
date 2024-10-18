package java_problemsolving.levelzero.introductionsofps;

import java.util.*;

/**
 * Level : 0
 * Title : 외계어 사전
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-06-04
 * Solved : 2024-06-06
 *
 *
 */
public class AlienDictionary {
    public static int solution(String[] spell, String[] dic) {
        int answer = 2;

        Map<String, Integer> map = new HashMap<String, Integer>();
//        List<String> dicList = Arrays.stream(dic).toList();
//        List<String> dicList = Arrays.stream(dic).collect(Collectors.toList());
        List<String> dicList = new ArrayList<>();
        for (String s : dic) {
            dicList.add(s);
        }
//        List<String> spellList = Arrays.stream(spell).toList();
        List<String> spellList = new ArrayList<>();
        for (String s : spell) {
            spellList.add(s);
        }
//        List<String> spellList = Arrays.stream(spell).collect(Collectors.toList());

        for(int i = 0; i < dicList.size(); ++i) {
            for(int m = 0; m < spellList.size(); ++m) {
                map.put(spellList.get(m), 0);
            }

            for(char c : dicList.get(i).toCharArray()) {
                if(map.containsKey(String.valueOf(c))) {
                    map.put(String.valueOf(c), map.get(String.valueOf(c)) + 1);
                } else {
                    continue;
                }
            }

            for(int item : map.values()) {
                if(item != 1) {
                    answer = 2;
                    break;
                }
                else answer = 1;
            }
            map.clear();

            if(answer == 1) break;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str = str.replaceAll("\"", "");
        String[] spell = str.split(", ");
        String str2 = input.nextLine();
        str2.replaceAll("\"", "");
        String[] dic = str2.split(", ");
        System.out.println(solution(spell, dic));
    }

}
