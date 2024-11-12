package java_problemsolving.leveltwo;

import java.util.*;

/**
 * Level : 2
 * Title : 튜플
 * 문제 유형 : 2019 카카오 개발자 겨울 인턴십
 *
 * Started : 2024-11-12
 * Solved : 2024-11-12
 *
 *
 */
public class Tuple {
    public int[] solution(String s) {
        int[] answer = {};
        String[] spStr = s.split("},\\{");
        String[][] spsp = new String[spStr.length][];
        for(int i = 0; i < spStr.length; i++) {
            spsp[i] = spStr[i].replaceAll("}", "").replaceAll("\\{", "").split(",");
        }

        // 각 튜플을 길이순으로 정렬
        for(int i = 0; i < spsp.length; i++) {
            for(int j = i+1; j < spsp.length; j++) {
                if(spsp[i].length > spsp[j].length) {
                    String[] temp = spsp[i];
                    spsp[i] = spsp[j];
                    spsp[j] = temp;
                }
            }
        }
        // 길이 1이면 answer에 추가
        List<Integer> ansList = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < spsp.length; i++) {
            if(spsp[i].length == 1) {
                ansList.add(Integer.valueOf(spsp[i][0]));
                map.put(Integer.valueOf(spsp[i][0]), map.getOrDefault(i, 0) + 1);
            } else {
                for(int j = 0; j < spsp[i].length; j++) {
                    if(!map.containsKey(Integer.valueOf(spsp[i][j])) || map.get(Integer.valueOf(spsp[i][j])) < 1) {
                        ansList.add(Integer.valueOf(spsp[i][j]));
                        map.put(Integer.valueOf(spsp[i][j]), map.getOrDefault(i, 0) + 1);
                    }
                }
            }
        }

        answer = ansList.stream().mapToInt(i -> i).toArray();
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(Arrays.toString(new Tuple().solution(s)));
    }
}
