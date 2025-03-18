package java_problemsolving;

import java.io.IOException;
import java.util.*;
import java.nio.file.*;

// TODO: input_text file 만들어서 가져오는 방법?
public class Practice {
    public static class Pizza {
        public String name;
        public int price_S;
        public int price_M;
        public int price_L;

        public Pizza(String name, int price_S, int price_M, int price_L) {
            this.name = name;
            this.price_S = price_S;
            this.price_M = price_M;
            this.price_L = price_L;
        }
    }

    public static class OrderItem {
        public String name;
        public String size;
        public int quantity;

        public OrderItem(String name, String size, int quantity) {
            this.name = name;
            this.size = size;
            this.quantity = quantity;
        }
    }

    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("programmers/src/java_problemsolving/practice_input.txt");
        Path outputPath = Paths.get("programmers/src/java_problemsolving/practice_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        int idx = 1;
        int answer = 0;
        for (String line : inputLines) {
            String[] spl = line.split("], \\[");
            // menu
            String[] splm = spl[0].split("\\), \\(");
            Pizza[] menu = new Pizza[splm.length];
            int idxm = 0;
            for (String item : splm) {
                item = item.replaceAll("\\[", "").replaceAll("]", "").replaceAll("\\)", "").replaceAll("\\(", "");
                String[] spitem = item.split(", ");
                menu[idxm] = new Practice.Pizza(spitem[0], Integer.parseInt(spitem[1]), Integer.parseInt(spitem[2]), Integer.parseInt(spitem[3]));
                idxm++;
            }
            // order
            String[] splo = spl[1].split("\\), \\(");
            OrderItem[] order = new OrderItem[splo.length];
            int idxo = 0;
            for (String item : splo) {
                item = item.replaceAll("\\[", "").replaceAll("]", "").replaceAll("\\)", "").replaceAll("\\(", "");
                String[] spitem = item.split(", ");
                order[idxo] = new OrderItem(spitem[0], spitem[1], Integer.parseInt(spitem[2]));
                idxo++;
            }

            answer = solution(menu, order);
            System.out.println("TestCase " + idx + ": " + answer + " / " + outputLines.get(idx - 1) + " ---> " + (answer == Integer.parseInt(outputLines.get(idx - 1)) ? "success" : "fail"));
            idx++;
        }
    }

    public static int solution(Pizza[] menu, OrderItem[] order) {
        int answer = 0;
        int total = 0;

        Map<String, Integer> pizzaPrice = new HashMap<>();
        String[] sz = {"Small", "Medium", "Large"};
        for(Pizza pizza : menu) {
            pizzaPrice.put(pizza.name + "_" + sz[0], pizza.price_S);
            pizzaPrice.put(pizza.name + "_" + sz[1], pizza.price_M);
            pizzaPrice.put(pizza.name + "_" + sz[2], pizza.price_L);
        }

        int totalCnt = 0;
        int minPrice = Integer.MAX_VALUE;
        Map<String, Integer> orderCount = new HashMap<>();
        Map<String, Integer> sameNameCount = new HashMap<>();
        int largeCnt = 0;
        for(OrderItem orderItem : order) {
            if(orderItem.size.equals("Large")) largeCnt += orderItem.quantity;
            totalCnt += orderItem.quantity;
            if(pizzaPrice.containsKey(orderItem.name + "_" + orderItem.size)) {
                total += pizzaPrice.get(orderItem.name + "_" + orderItem.size) * orderItem.quantity;
                minPrice = Math.min(minPrice, pizzaPrice.get(orderItem.name + "_" + orderItem.size));
            }
            orderCount.put(orderItem.name + "_" + orderItem.size, orderItem.quantity);
            sameNameCount.put(orderItem.name, sameNameCount.getOrDefault(orderItem.name, 0) + orderItem.quantity);
        }

        // no discount
        answer = total;

        // discount 1
        if(totalCnt >= 3) {
            answer = Math.min(answer, answer - minPrice);
        }

        // discount 2
        for(Map.Entry<String, Integer> entry : sameNameCount.entrySet()) {
            String nowName = entry.getKey();
            int nowQuantity = entry.getValue();
            if(nowQuantity >= 5) {
                //그럼 nowName을 할인하는 함수
                // 함수 내에서 order 탐색해서 nowName과 같으면 할인적용, 5개가 안되면 될 때 까지 이어서 탐색
                // 5개 채우면 비교
                // 시작 order탐색 // 그 안에서 5가 채워질 때 까지 나머지 탐색 - 이중 for문
                discountOptionTwo(pizzaPrice, orderCount, total, nowName);
            }
        }

        // discount 3
        answer = Math.min(answer, discountOptionThree(pizzaPrice, orderCount));

        // discount 4
        if(largeCnt >= 3) {
//            answer = Math.min(answer, discountOptionFour(pizzaPrice, orderCount, total, sameNameCount));
        }

        return answer;
    }

    public static int discountOptionTwo(Map<String, Integer> pizzaPrice, Map<String, Integer> orderCount, int total, String nowName) {
        int answer = 0;

        int cnt = 5;
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(orderCount.entrySet());
        for(int i = 0; i < entryList.size(); i++) {
            String key = entryList.get(i).getKey();
            int quantity = entryList.get(i).getValue();

            // 이름 포함할 경우
            if(key.contains(nowName)) {
                for(int j = 0; j < entryList.size(); j++) {
                    if(j == i) continue;
                    if(cnt <= 0) break;
                    // 할인 대상이면 숫자 빼주기
                }
                // 할인 할 애를 선택하면 할인 후(제외 후) 총가격 계산

                // 할인한 5개는 100만 더해주기
                answer += 100;
            }
        }

        return answer;
    }

    public static int discountOptionThree(Map<String, Integer> pizzaPrice, Map<String, Integer> orderCount) {
        int answer = 0;
        Map<String, Integer> order = orderCount;
        for(Map.Entry<String, Integer> entry : order.entrySet()) {
            String nowKey = entry.getKey();

            if(nowKey.endsWith("Large")) {
                String nowName = nowKey.substring(0, nowKey.indexOf("_"));
                int nowQuantity = entry.getValue();
                if(order.containsKey(nowName + "_Small")) {
                    order.put(nowName + "_Small", order.get(nowName + "_Small") - nowQuantity);
                }
            }
        }

        // 계산
        for(Map.Entry<String, Integer> entry : order.entrySet()) {
            String nowKey = entry.getKey();
            int nowQuantity = entry.getValue();
            if(nowQuantity > 0) {
                answer += pizzaPrice.getOrDefault(nowKey, 0) * nowQuantity;
            }
        }

        return answer;
    }


}