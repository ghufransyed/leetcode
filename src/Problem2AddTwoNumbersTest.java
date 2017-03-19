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
        ListNode r1 = new ListNode(7);
        ListNode r2 = new ListNode(0);
        ListNode r3 = new ListNode(8);
        m1.next = m2;
        m2.next = m3;
        n1.next = n2;
        n2.next = n3;
        r1.next = r2;
        r2.next = r3;
        
        
        assertTrue(Problem2AddTwoNumbers.addTwoNumbers(m1,n1).equals(r1));
    }
    
    @Test
    void addTwoNumbers2() {
        // change the stuff below to test edge cases;
        ListNode m1 = new ListNode(0);
        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(6);
        ListNode n3 = new ListNode(4);
        ListNode r1 = new ListNode(5);
        ListNode r2 = new ListNode(6);
        ListNode r3 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        r1.next = r2;
        r2.next = r3;


        assertTrue(Problem2AddTwoNumbers.addTwoNumbers(m1,n1).equals(r1));
    }

    @Test
    void addTwoNumbers3() {
        // change the stuff below to test edge cases;
        ListNode m1 = new ListNode(9);
        ListNode m2 = new ListNode(9);
        ListNode m3 = new ListNode(9);
        ListNode n1 = new ListNode(9);
        ListNode n2 = new ListNode(9);
        ListNode n3 = new ListNode(9);
        ListNode r1 = new ListNode(8);
        ListNode r2 = new ListNode(9);
        ListNode r3 = new ListNode(9);
        ListNode r4 = new ListNode(1);
        m1.next = m2;
        m2.next = m3;
        n1.next = n2;
        n2.next = n3;
        r1.next = r2;
        r2.next = r3;
        r3.next = r4;


        assertTrue(Problem2AddTwoNumbers.addTwoNumbers(m1,n1).equals(r1));
    }

}