/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

 */

public class Problem2AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode result = new ListNode(0);
        ListNode currentResultNode = result;
        int first = 0;
        int second = 0;
        int sum = 0;
        int remainder = 0;
        
        while (l1 != null || l2 != null || remainder != 0){
           if (l1 != null){ first = l1.val;}
           else { first = 0;}
           if (l2 != null){ second = l2.val;}
           else { second = 0;}
           
           sum = first + second + remainder; 
           if (sum >= 10){
               currentResultNode.val = sum % 10;
               remainder = (sum - currentResultNode.val) / 10; 
           }
           else {
               currentResultNode.val = sum;
               remainder = 0;
           }
           if (l1 != null) { l1 = l1.next; }
           if (l2 != null) { l2 = l2.next; }
           if (l1 != null || l2 != null || remainder != 0){
               currentResultNode.next = new ListNode(0);
               currentResultNode = currentResultNode.next;
           }
           
        }
        return result;
        
    }
}
