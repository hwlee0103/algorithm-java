package java_problemsolving.levelzero.introductionsofps;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Level : 0
 * Title : 외계어 사전
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-06-04
 * Solved : 2024-06-
 *
 * 문제
 * PROGRAMMERS-962 행성에 불시착한 우주비행사 머쓱이는 외계행성의 언어를 공부하려고 합니다.
 * 알파벳이 담긴 배열 spell과 외계어 사전 dic이 매개변수로 주어집니다.
 * spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 1, 존재하지 않는다면 2를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * spell과 dic의 원소는 알파벳 소문자로만 이루어져있습니다.
 * 2 ≤ spell의 크기 ≤ 10
 * spell의 원소의 길이는 1입니다.
 * 1 ≤ dic의 크기 ≤ 10
 * 1 ≤ dic의 원소의 길이 ≤ 10
 * spell의 원소를 모두 사용해 단어를 만들어야 합니다.
 * spell의 원소를 모두 사용해 만들 수 있는 단어는 dic에 두 개 이상 존재하지 않습니다.
 * dic과 spell 모두 중복된 원소를 갖지 않습니다.
 *
 * 입출력 예
 * spell	            dic	                                    result
 * ["p", "o", "s"]	    ["sod", "eocd", "qixm", "adio", "soo"]	2
 * ["z", "d", "x"]	    ["def", "dww", "dzx", "loveaw"]	        1
 * ["s", "o", "m", "d"]	["moos", "dzx", "smm", "sunmmo", "som"]	2
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
