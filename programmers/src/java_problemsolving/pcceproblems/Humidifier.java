package java_problemsolving.pcceproblems;

import java.util.Scanner;

/**
 * Level : 0
 * Title : [PCCE 기출문제] 7번 / 가습기
 * 문제 유형 : PCCE 기출문제
 *
 * Started : 2024-10-04
 * Solved : 2024-10-04
 *
 *
 */
public class Humidifier {
    public int func1(int humidity, int val_set){
        if(humidity < val_set)
            return 3;
        return 1;
    }

    public int func2(int humidity){
        if(humidity >= 50)
            return 0;
        else if (humidity >= 40)
            return 1;
        else if (humidity >= 30)
            return 2;
        else if (humidity >= 20)
            return 3;
        else if (humidity >= 10)
            return 4;
        else
            return 5;
    }

    public int func3(int humidity, int val_set){
        if(humidity < val_set)
            return 1;
        return 0;
    }

    public int solution(String mode_type, int humidity, int val_set) {
        int answer = 0;

        if(mode_type.equals("auto")){
            answer = func2(humidity);
        }
        else if(mode_type.equals("target")){
            answer = func1(humidity, val_set);
        }
        else if(mode_type.equals("minimum")){
            answer = func3(humidity, val_set);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mode_type = input.nextLine();
        int humidity = input.nextInt();
        int val_set = input.nextInt();
        System.out.println(new Humidifier().solution(mode_type, humidity, val_set));
    }
}
