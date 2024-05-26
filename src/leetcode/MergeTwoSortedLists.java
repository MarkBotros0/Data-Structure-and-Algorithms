package leetcode;

import dataStructures.graph.Node;

public class MergeTwoSortedLists implements TestSolution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode currNode1 = list1;
        ListNode currNode2 = list2;

        ListNode newNode = null;
        ListNode currNode = null;

        while (currNode1.next != null || currNode2.next != null) {
            if (currNode1.next.val >= currNode2.next.val) {
                newNode.val = currNode1.val;
            } else {
                newNode.val = currNode2.val;
            }
        }

        return newNode;

    }

    @Override
    public void test() {
        this.mergeTwoLists(
                new ListNode(1, new ListNode(2, new ListNode(4))),
                new ListNode(1, new ListNode(3, new ListNode(4)))
        );
    }

    public class ListNode {
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
    }
}
