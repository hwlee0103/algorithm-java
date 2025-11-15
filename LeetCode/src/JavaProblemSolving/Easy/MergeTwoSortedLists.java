package JavaProblemSolving.Easy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Level : Easy
 * Title : 21. Merge Two Sorted Lists
 * 문제 유형 : Linked List, Recursion
 *
 * Started : 2025-11-03
 * Solved : 2025-11-03
 * Time: 12 min 11 sec
 * Algorithm: Simulation 사용
 *
 *
 */
public class MergeTwoSortedLists {
    public static void main(String[] args) throws IOException {
        String currentLevel = "JavaProblemSolving/Easy";
        String currentClass = "MergeTwoSortedLists";
        Path inputPath = Paths.get("LeetCode/src/" + currentLevel +"/input/"+ currentClass + "_input.txt");
        Path outputPath = Paths.get("LeetCode/src/" + currentLevel +"/output/"+ currentClass + "_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        for(int i = 0; i < inputLines.size(); i++) {
            System.out.println("Query #" + String.valueOf(i + 1));
            String[] query = inputLines.get(i).split(" ");
            System.out.println("list1: " + query[0] + " list2: " + query[1]);
            ListNode l1Head = new ListNode(0);
            ListNode l1now = l1Head;
            String[] l1String = query[0].replaceAll("\\[", "").replaceAll("]", "").split(",");
            for(int j = 0; j < l1String.length; j ++) {
                if(l1String[j].equals("")) { break; }
                ListNode node = new ListNode(Integer.parseInt(l1String[j]));
                l1now.next = node;
                l1now = l1now.next;
            }
            ListNode l1 = l1Head.next;

            ListNode l2Head = new ListNode(0);
            ListNode l2now = l2Head;
            String[] l2String = query[1].replaceAll("\\[", "").replaceAll("]", "").split(",");
            for(int j = 0; j < l2String.length; j ++) {
                if(l2String[j].equals("")) { break; }
                ListNode node = new ListNode(Integer.parseInt(l2String[j]));
                l2now.next = node;
                l2now = l2now.next;
            }
            ListNode l2 = l2Head.next;

            System.out.println("-------------");
            // answer
            ListNode answer = mergeTwoLists(l1, l2);

            String ansString = "[";
            while(answer != null) {
                ansString += String.valueOf(answer.val);
                if(answer.next != null) {
                    ansString += ",";
                }
                answer = answer.next;
            }
            ansString += "]";
            System.out.println("Answer: " + ansString);
            System.out.print(" ==> ");
            if(ansString.equals(outputLines.get(i))) {
                System.out.println("Success!");
            } else System.out.println("Failed!");

            System.out.println("==================");
        }
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {this.val = val; this.next = next; }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        while(list1 != null || list2 != null) {
            ListNode now = new ListNode();
            if(list1 == null) {
                if(list2 == null) {
                    break;
                } else {
                    now.val = list2.val;
                    list2 = list2.next;
                }
            } else {
                if(list2 == null) {
                    now.val = list1.val;
                    list1 = list1.next;
                } else {
                    if(list1.val > list2.val) {
                        now.val = list2.val;
                        list2 = list2.next;
                    } else {
                        now.val = list1.val;
                        list1 = list1.next;
                    }
                }
            }
            curr.next = now;
            curr = now;
        }
        return head.next;
    }
}
