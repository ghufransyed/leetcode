/**
 * Created by ghufran on 3/18/17.
 */
public class ListNode {
    int val;
    ListNode next;
    
    ListNode(int n) { val = n;}
    
    public boolean equals(ListNode l2){
        ListNode l1 = this;
        boolean result = true;
        
        while (l1 != null && l2 != null){
           result = result && (l1.val == l2.val);
           l1 = l1.next;
           l2 = l2.next;
        }
        result = result && (l1 == null && l2 == null);
        return result;
    }
}
