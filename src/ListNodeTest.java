import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by ghufran on 3/18/17.
 */
class ListNodeTest {
    @Test
    void equalsTrue() {
        ListNode m1 = new ListNode(1);
        ListNode m2 = new ListNode(2);
        ListNode m3 = new ListNode(3);
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        m1.next = m2;
        m2.next = m3;
        n1.next = n2;
        n2.next = n3;
        
        assertTrue(m1.equals(n1));

    }

    @Test
    void equalsFalseValue() {
        ListNode m1 = new ListNode(1);
        ListNode m2 = new ListNode(2);
        ListNode m3 = new ListNode(3);
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(4);
        m1.next = m2;
        m2.next = m3;
        n1.next = n2;
        n2.next = n3;

        assertFalse(m1.equals(n1));

    }

    @Test
    void equalsFalseLength() {
        ListNode m1 = new ListNode(1);
        ListNode m2 = new ListNode(2);
        ListNode m3 = new ListNode(3);
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        m1.next = m2;
        m2.next = m3;
        n1.next = n2;

        assertFalse(m1.equals(n1));

    }

}