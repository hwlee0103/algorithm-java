package JavaProblemSolving.Medium;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Level : Medium
 * Title : 2. Add Two Numbers
 * 문제 유형 : Linked List, Math, Recursion
 *
 * Started : 2025-11-02
 * Solved : 2025-11-02
 * 기출 C
 *
 */

public class AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int x) { val = x; }
        ListNode(int x, ListNode next) {
            val = x;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;
            current.next = new ListNode(sum % 10);
            current = current.next;

            carry = sum / 10;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        return head.next;
    }

    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("LeetCode/src/Medium/input/AddTwoNumbers_input.txt");
        Path outputPath = Paths.get("LeetCode/src/Medium/output/AddTwoNumbers_output.txt");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        for(int i = 0; i < inputLines.size(); i ++) {
            System.out.println("Query #" + String.valueOf(i + 1));
            System.out.println("input: " + inputLines.get(i));
            String[] inputLine = inputLines.get(i).split(" ");
            ListNode l1Head = new ListNode(0);
            ListNode l1now = l1Head;
            String[] l1String = inputLine[0].replaceAll("\\[", "").replaceAll("]", "").split(",");
            for(int j = 0; j < l1String.length; j ++) {
                ListNode node = new ListNode(Integer.parseInt(l1String[j]));
                l1now.next = node;
                l1now = l1now.next;
            }
            ListNode l1 = l1Head.next;

            ListNode l2Head = new ListNode(0);
            ListNode l2now = l2Head;
            String[] l2String = inputLine[1].replaceAll("\\[", "").replaceAll("]", "").split(",");
            for(int j = 0; j < l2String.length; j ++) {
                ListNode node = new ListNode(Integer.parseInt(l2String[j]));
                l2now.next = node;
                l2now = l2now.next;
            }
            ListNode l2 = l2Head.next;

            ListNode answer = addTwoNumbers(l1, l2);

            String ansString = "[";
            while(answer != null) {
                ansString += String.valueOf(answer.val);
                if(answer.next != null) {
                    ansString += ",";
                }
                answer = answer.next;
            }
            ansString += "]";

            System.out.println("---------------");
            System.out.println("answer: " + ansString);
            System.out.print(" ==> ");
            if(ansString.equals(outputLines.get(i))){
                System.out.println("Success!");
            } else System.out.println("Failed!");
            System.out.println("===================");
        }
    }
}
