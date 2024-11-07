package java_problemsolving.leveltwo;

import java.util.*;

/**
 * Level : 2
 * Title : 주차 요금 계산
 * 문제 유형 : 2022 KAKAO BLIND RECRUITMENT
 *
 * Started : 2024-11-07
 * Solved : 2024-
 *
 *
 */
public class ParkingFeeCalculation {
    public int[] solution(int[] fees, String[] records) {
        int[] answer;
        // map 차량번호/입차시간
        Map<String, String> timeMap = new HashMap<>();
        // map 차량번호/금액
        Map<String, Integer> feeMap = new HashMap<>();

        for(int i = 0; i < records.length; i++) {
            String[] record = records[i].split(" ");
            if(record[2].equals("IN")) {
                // key 중복 시 덮어씌워지는 지 확인
                timeMap.put(record[1], record[0]);
            } else {
                // 시간 계산
                int[] inTime = Arrays.stream(timeMap.get(record[1]).split(":")).mapToInt(Integer::parseInt).toArray();
                int[] outTime = Arrays.stream(record[0].split(":")).mapToInt(Integer::parseInt).toArray();
                int totalTime = 0;
                if(inTime[1] > outTime[1]) {
                    totalTime += 60 - inTime[1] + outTime[1];
                    outTime[0]--;
                } else {
                    totalTime += outTime[1] - inTime[1];
                }
                totalTime += (outTime[0] - inTime[0]) * 60;
                int fee = fees[1];
                fee += totalTime > fees[0] ? ((totalTime - fees[0]) / fees[2]) * fees[3] : 0;
                feeMap.put(record[1], feeMap.getOrDefault(record[1], 0) + fee);
                timeMap.remove(record[1]);
            }
        }

        // 남아있는 경우
        for(Map.Entry<String, String> now : timeMap.entrySet()){
            int[] inTime = Arrays.stream(now.getValue().split(":")).mapToInt(Integer::parseInt).toArray();
            int totalTime = (23 - inTime[0]) * 60 + (59 - inTime[1]);
            int fee = fees[1];
            fee += totalTime > fees[0] ? ((totalTime - fees[0]) / fees[2]) * fees[3] : 0;
            feeMap.put(now.getKey(), feeMap.getOrDefault(now.getKey(), 0) + fee);
        }

        // map을 차량번호(key) 기준으로 정렬해서 주차요금을 answer에 전달
        List<String> keySet = new ArrayList<>(feeMap.keySet());
        Collections.sort(keySet);
        answer = new int[keySet.size()];
        for(int i = 0; i < feeMap.size(); i++) {
            answer[i] = feeMap.get(keySet.get(i));
        }

        return answer;
    }

    // 시간 계산(분)
    public int getTimeCal(String in, String out) {
        int[] inTime = Arrays.stream(in.split(":")).mapToInt(Integer::parseInt).toArray();
        int[] outTime = Arrays.stream(out.split(":")).mapToInt(Integer::parseInt).toArray();
        int totalTime = 0;
        totalTime += (inTime[1] > outTime[1]) ? 60 - inTime[1] + outTime[1] : outTime[1] - inTime[1];
        totalTime += (outTime[0] - inTime[0]) * 60;

        return totalTime;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] fees = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        String[] records = input.nextLine().replaceAll("\"", "").split(", ");
        System.out.println(Arrays.toString(new ParkingFeeCalculation().solution(fees, records)));
    }
}
