package java_problemsolving.leveltwo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Level : 2
 * Title : 스킬트리
 * 문제 유형 : Summer/Winter Coding(~2018)
 *
 * Started : 2024-11-06
 * Solved : 2024-11-06
 *
 *
 */
public class SkillTree {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < skill.length(); ++i) {
            map.put(skill.charAt(i), map.getOrDefault(skill.charAt(i), i));
        }

        for(int i = 0; i < skill_trees.length; ++i) {
            int cnt = 0;
            boolean flag = true;
            for(int j = 0; j < skill_trees[i].length(); ++j) {
                if(map.getOrDefault(skill_trees[i].charAt(j), -1) >= 0) {
                    if(map.get(skill_trees[i].charAt(j)) == cnt) {
                        cnt++;
                    } else {
                        flag = false;
                        break;
                    }
                }
            }

            if(flag) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String skill = input.nextLine();
        String[] skill_trees = input.nextLine().replaceAll("\"", "").split(", ");
        System.out.println(new SkillTree().solution(skill, skill_trees));
    }
}
