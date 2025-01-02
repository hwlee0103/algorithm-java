package java_problemsolving.pcceproblems;

import java.util.*;

/**
 * Level : 1
 * Title : [PCCE 기출문제] 10번 / 데이터 분석
 * 문제 유형 : PCCE 기출문제
 *
 * Started : 2025-01-02
 * Solved : 2025-01-02
 *
 */
/*
[[1, 20300104, 100, 80], [2, 20300804, 847, 37], [3, 20300401, 10, 8]]
date
20300501
remain
-->
[[3,20300401,10,8],[1,20300104,100,80]]
*
* */
public class DataAnalysis {
    // 정렬 문제로 추정
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        // ext에 따라 몇 번째 index인지 찾기 위해서는
        Map<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);
        int idx = map.getOrDefault(ext, 0);
        // val_ext가 기준으로, 그 미만인 애들만 골라내기
        List<int[]> list = new ArrayList<>();
        for(int[] item: data) {
            if(item[idx] < val_ext) list.add(item);
        }

        // TODO: 왜 comparator를 사용한 게 선택정렬/버블정렬과 결과가 다른가?
        int compIdx = map.getOrDefault(sort_by, 0);
        list.sort(Comparator.comparing(x -> x[compIdx]));

        // answer에 넣기
        answer = list.toArray(new int[list.size()][]);
        // 옮기고 나서 정렬 - 선택정렬?
//        int compIdx = map.getOrDefault(sort_by, 0);
//        answer = bubbleSort(answer, compIdx);
//        answer = selectionSort(answer, compIdx);

        return answer;
    }

    // 잘못 구현함.. 이거 버블정렬 아님! -> 다시 구현해보기!
    public int[][] bubbleSort(int[][] data, int comparatorIdx) {
        for(int i = 0; i < data.length - 1; i++) {
            for(int j = 0; j < data.length; j++) {
                if(data[i][comparatorIdx] > data[j][comparatorIdx]) {
                    int[] temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                }
            }
        }
        return data;
    }

    public int[][] selectionSort(int[][] arr, int comparatorIdx) {
//        int now = arr[0][comparatorIdx];
        int minComp = 100000;
        int idx = 0;
        for(int i = 1; i < arr.length; i++) {
            minComp = Math.min(minComp, arr[i][comparatorIdx]);
            for(int j = i + 1; j < arr.length; j++) {
                if(minComp > arr[j][comparatorIdx]) {
                    idx = j;
                    minComp = Math.min(minComp, arr[i][comparatorIdx]);
                }
            }
            // Swap
//            int tmp = arr[i][comparatorIdx];
//            arr[i][comparatorIdx] = arr[idx][comparatorIdx];
//            arr[idx][comparatorIdx] = tmp;
            int[] tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }

        return arr;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] str = input.nextLine().split("], \\[");
        int[][] data = new int[str.length][];
        for(int i = 0; i < str.length; i++) {
            data[i] = Arrays.stream(str[i].replaceAll("\\[", "").replaceAll("]", "").split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        String ext = input.nextLine();
        int val_ext = input.nextInt();
        input.nextLine();
        String sort_by = input.nextLine();

        int[][] ans = new DataAnalysis().solution(data, ext, val_ext, sort_by);
        System.out.println(Arrays.deepToString(ans));
        // TODO: deepToString?
    }
}
