package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    // TODO: 추후 다른 조건으로 만들어보기
    public void graphArrayList(String[] words, String begin) {
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

    }

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

    public void graphNodeList(String begin, String[] words) {
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
    }

    public static void main(String[] args) {

    }
}
