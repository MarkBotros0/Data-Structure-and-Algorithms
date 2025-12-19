package leetcode.recursion;

import java.util.LinkedList;
import java.util.Queue;

public class _206_ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

//        System.out.println(reverseList(head));
        System.out.println(reverseList1(head));
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "val: " + val + ", next: " + next;
        }
    }
    public static ListNode reverseList1(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode h2 = reverseList1(head.next);
        head.next.next = head;
        head.next=prev;
        return h2;
    }

    public static ListNode reverseList(ListNode head) {
        Queue<Integer> queue = new LinkedList<>();
        helper(head, queue);
        return head;
    }

    private static void helper(ListNode head, Queue<Integer> queue) {
        if (head == null) {
            return;
        }
        queue.add(head.val);
        helper(head.next, queue);
        head.val = queue.poll();
    }
}
