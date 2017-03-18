import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by ghufran on 3/18/17.
 */
class Problem2AddTwoNumbersTest {
    @Test
    void addTwoNumbers1() {
        ListNode m1 = new ListNode(2);
        ListNode m2 = new ListNode(4);
        ListNode m3 = new ListNode(3);
        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(6);
        ListNode n3 = new ListNode(4);
        m1.next = m2;
        m2.next = m3;
        n1.next = n2;
        n2.next = n3;
        
        //Problem2AddTwoNumbers.addTwoNumbers(m1,n1);

    }

}