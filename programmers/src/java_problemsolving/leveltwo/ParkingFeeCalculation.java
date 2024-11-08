package java_problemsolving.leveltwo;

import java.util.*;

/**
 * Level : 2
 * Title : 주차 요금 계산
 * 문제 유형 : 2022 KAKAO BLIND RECRUITMENT
 *
 * Started : 2024-11-07
 * Solved : 2024-11-07
 *
 *
 * 180, 5000, 10, 600
 * "05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"
 *
 * 120, 0, 60, 591
 * "16:00 3961 IN", "16:00 0202 IN", "18:00 3961 OUT", "18:00 0202 OUT", "23:58 3961 IN"
 *
 * 180, 5000, 10, 600
 * "05:34 5961 IN", "06:34 5961 OUT", "07:34 5961 IN", "08:34 5961 OUT", "09:34 5961 IN", "10:34 5961 OUT", "11:34 5961 IN", "12:34 5961 OUT"
 * 8600
 *
 */
public class ParkingFeeCalculation {
    public int[] solution(int[] fees, String[] records) {
        int[] answer;
        // map 차량번호/입차시간
        Map<String, String> timeMap = new HashMap<>();
        // map 차량번호/총 시간
        Map<String, Integer> totalTimeMap = new HashMap<>();
        // map 차량번호/금액
        Map<String, Integer> feeMap = new HashMap<>();

        for(int i = 0; i < records.length; i++) {
            String[] record = records[i].split(" ");
            if(record[2].equals("IN")) {
                timeMap.put(record[1], record[0]);
            } else {
                // 시간 계산
                int totalTime = getTotalTime(timeMap.get(record[1]), record[0]);
                totalTimeMap.put(record[1], totalTimeMap.getOrDefault(record[1], 0) + totalTime);
                timeMap.remove(record[1]);
            }
        }

        // 남아있는 시간 계산
        for(Map.Entry<String, String> now : timeMap.entrySet()){
            int totalTime = getTotalTime(now.getValue(), "23:59");
            totalTimeMap.put(now.getKey(), totalTimeMap.getOrDefault(now.getKey(), 0) + totalTime);
        }

        // totalTimeMap에 대하여 요금 계산
        for(Map.Entry<String, Integer> now : totalTimeMap.entrySet()){
            int fee = getTimeFee(now.getValue(), fees);
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
    public int getTotalTime(String in, String out) {
        int[] inTime = Arrays.stream(in.split(":")).mapToInt(Integer::parseInt).toArray();
        int[] outTime = Arrays.stream(out.split(":")).mapToInt(Integer::parseInt).toArray();
        int totalTime = 0;
        if(inTime[1] > outTime[1]) {
            totalTime += 60 - inTime[1] + outTime[1];
            outTime[0]--;
        } else {
            totalTime += outTime[1] - inTime[1];
        }
        totalTime += (outTime[0] - inTime[0]) * 60;
        return totalTime;
    }

    // 시간 별 비용 계산
    public int getTimeFee(int time, int[] fees) {
        int fee = fees[1];
        fee += time > fees[0] ? (Math.ceil((time - fees[0]) / (double)fees[2])) * fees[3] : 0;
        return fee;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] fees = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        String[] records = input.nextLine().replaceAll("\"", "").split(", ");
        System.out.println(Arrays.toString(new ParkingFeeCalculation().solution(fees, records)));
    }
}
