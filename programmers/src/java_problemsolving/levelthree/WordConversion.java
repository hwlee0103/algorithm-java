package java_problemsolving.levelthree;

import java.util.*;

/**
 * Level : 3
 * Title : 단어 변환
 * 문제 유형 : 깊이/너비 우선 탐색(DFS/BFS)
 *
 * Started : 2024-11-27
 * Solved : 2024-12-
 *
 * 너무 어렵게 생각하지 말 것! 다시 풀어보기
 *
 */
public class WordConversion {
    public class Node {
        String word;
        int dist;
        boolean visited = false;
        LinkedList<Node> nextNodes = new LinkedList<>();

        public Node(String word, int dist, boolean visited, LinkedList<Node> nextNodes) {
            this.word = word;
            this.dist = dist;
            this.visited = visited;
            nextNodes = new LinkedList<>();
        }
    }

    public int solution3(String begin, String target, String[] words) {
        int answer = 0;

        // 그래프 만들기 - ArrayList로 만들어보기
        ArrayList<ArrayList<String>> wordGraph = new ArrayList<>();
        for(int i = 0; i <= words.length; i++) { // node 수 만큼 add
            wordGraph.add(new ArrayList<>());
        }

        String now = "";
        for(int i = 0; i < wordGraph.size(); i++) { // 모든 node 수 만큼
            if(i == 0) now = begin;
            else now = words[i - 1];
            for(int j = i; j < words.length; j++) {
                int cnt = 0;
                for(int k = 0; k < words[j].length(); k++) {
                    if(words[j].charAt(k) != now.charAt(k)) {
                        cnt++;
                    }
                }
                if(cnt == 1) {
                    // 그래프 연결
                    wordGraph.get(i).add(words[j]);
                    wordGraph.get(j + 1).add(now);
                }
            }
            // 출력
            System.out.println("now Node : " + now);
            for(int j = 0; j < wordGraph.get(i).size(); j++) {
                System.out.println("     next Node : " + wordGraph.get(i).get(j));
            }
        }


        return answer;
    }

    public int solution2(String begin, String target, String[] words) {
        int answer = 0;
        ArrayList<Node> graph = new ArrayList<>();

        // 1: 1개 차이인 단어 연결 - 그래프 구현
        // 1-1: graph 뼈대 생성
        graph.add(new Node(begin, 0, false, new LinkedList<>()));
        for (String word : words) {
            graph.add(new Node(word, 0, false, new LinkedList<>()));
        }
        // 1-2: graph 연결 / 조건: 알파벳 1개 차이
        for(int k = 0; k < graph.size(); ++k) { // 모든 word에 대해
            Node node = graph.get(k);
            String now = node.word;
            for(int i = k; i < words.length; ++i) { // 단어 전부 확인
                int cnt = 0;
                for(int j = 0; j < words[i].length(); j++) {
                    if(words[i].charAt(j) != now.charAt(j)) {
                        cnt++;
                    }
                }
                if(cnt == 1) {
                    // 양방향 그래프 ? - 그래프 다시 만들기 - 어떻게 '연결'할 수 있을까?
                    node.nextNodes.add(new Node(words[i], 0, false, new LinkedList<>()));
                    graph.get(i + 1).nextNodes.add(new Node(now, 0, false, new LinkedList<>()));
                }
            }
            // 출력
            System.out.println("now node : " + now);
            System.out.println("    dist : " + node.dist);
            System.out.println("    visited : " + node.visited);
            for(int i = 0 ; i < node.nextNodes.size(); ++i) {
                System.out.println("    nextNodes(" + i + ") : " + node.nextNodes.get(i).word);
            }
        }

        answer = bfs2(graph, target);
        return answer;
    }

    public int bfs2(List<Node> graph, String target) {
        int answer = 1000001;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(graph.get(0));

        while(!queue.isEmpty()) {
            Node node = queue.poll();
            String now = node.word;
            int dist = node.dist;
            List<Node> nextNodes = node.nextNodes; // 여기서 hot을 가져와도, hot에 nextNodes가 없음 -> 어떻게 해줘야 할 지?

            if(now.equals(target)) {
                // 현재까지의 distance
                answer = Math.min(answer, dist);
                break;
            }

            for(int i = 0; i < nextNodes.size(); ++i) {
                Node nextNode = nextNodes.get(i);
                if(nextNode.visited) continue;
                nextNode.visited = true;
                nextNode.dist = dist + 1; // TODO: 값 잘 들어가는지 확인
                queue.offer(nextNode);
            }
        }

        return answer;
    }


    public int solution(String begin, String target, String[] words) {
        int answer = 0;
//        List<Node> wordGraph = new ArrayList<>();
//        wordGraph.add(new Node(begin));
//        for (String word : words) {
//            wordGraph.add(new Node(word));
//        }
        List<String> list = new ArrayList<>();
        list.add(begin);
        list.addAll(Arrays.asList(words));
        Map<String, Boolean> visited = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            visited.put(list.get(i), false);
            System.out.println("list(" + i + ") : " + list.get(i));
        }

        // 1개차이인 애들을 넣어줄 Map
        Map<String, List<String>> map = new HashMap<>();

        // 1: words를 1개차이인 애들을 graph로 연결(begin 부터 words 까지)
        for(int k = 0; k < list.size(); k++) {
            String now = list.get(k);
            System.out.println("now : " + now);
            for(int i = 0; i < words.length;i++) {
                String next = words[i];
//                System.out.println("next : " + next);
                int cnt = 0;
                for(int j = 0 ; j < words[i].length();j++) {
                    if(now.charAt(j) != words[i].charAt(j)) {
                        cnt++;
                    }
                }
                if(cnt == 1) {
//                    wordGraph.get(k).nextNodes.add(new Node(words[i]));
                    map.computeIfAbsent(now, k1 -> new ArrayList<>()).add(words[i]);
                }
            }
        }

        for(String now : map.keySet()) {
            System.out.println("now: " + now);
            System.out.println("// map: " + map.get(now));
        }
//        for(int i = 0; i < wordGraph.size(); i++) {
//            System.out.print("word: " + wordGraph.get(i).word);
//            for(int j = 0; j < wordGraph.get(i).nextNodes.size(); j++) {
//                System.out.print(" // nextNodes(" + j + "): " + wordGraph.get(i).nextNodes.get(j).word + " ");
//            }
//            System.out.println();
//        }

        // 2: dfs나 bfs로 탐색, 최단거리 return

        // map으로 어떻게 탐색할거냐, List에서 찾아서 map에서 연결된 애들 찾기? 방문 여부는 List랑 똑같은 visited로 해줄건지?
//        boolean[] visited = new boolean[list.size()];
//        answer = new WordConversion().bfs(begin, target, );

        return answer;
    }

    public class Item {
        String word;
//        boolean visited = false;
        int distance;

        public Item(String word, int distance) {
            this.word = word;
//            this.visited = visited;
            this.distance = distance;
        }
    }

    public int bfs(String begin, String target, List<String> list, Map<String, List<String>> map) {
        int answer = 100000000;
        Queue<Item> queue = new LinkedList<>();
//        queue.add(new Item(list.get(0), true, 0));

        while(!queue.isEmpty()) {
            Item item = queue.poll();
            if(item.word.equals(target)) { answer = Math.min(answer, item.distance); }
            List<String> nextList = map.getOrDefault(item.word, new ArrayList<>());
            for(int i = 0; i < nextList.size(); i++) {
//                if(visited[i+1]) continue;
//                visited[i] = true;
//                queue.add(new Item(nextList.get(i), true, item.distance + 1));
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String begin = input.nextLine();
        String target = input.nextLine();
        String[] words = input.nextLine().replaceAll("\"", "").split(", ");
//        System.out.println(new WordConversion().solution(begin, target, words));
//        System.out.println(new WordConversion().solution2(begin, target, words));
        System.out.println(new WordConversion().solution3(begin, target, words));
    }
}
