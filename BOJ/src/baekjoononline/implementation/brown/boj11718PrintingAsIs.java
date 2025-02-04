package baekjoononline.implementation.brown;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Level : Brown 3
 * Title : 11718 그대로 출력하기
 * 문제 유형 : 구현 Implementation
 *
 * Started : 2025-02-04
 * Solved : 2025-02-04
 *
 *
 */
public class boj11718PrintingAsIs {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String line;
            while ((line = br.readLine()) != null) {  // EOF(입력 종료)까지 한 줄씩 읽기
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
