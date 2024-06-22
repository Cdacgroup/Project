package Short;

import java.util.*;

class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
    }
}

public class Main {
    
    public static ListNode insertValues(int[] values) {
        ListNode dummy = new ListNode(0); 
        ListNode tail = dummy;
        
        for (int value : values) {
            tail.next = new ListNode(value);
            tail = tail.next;
        }
        
        return dummy.next; 
    }
    
    public static void findCommon(ListNode h1, ListNode h2) {
        Set<Integer> set = new HashSet<>();
        
        while (h1 != null) {
            set.add(h1.val);
            h1 = h1.next;
        }
        
        System.out.print("Common elements: ");
        while (h2 != null) {
            if (set.contains(h2.val)) {
                System.out.print(h2.val + " ");
            }
            h2 = h2.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] values1 = {10, 23, 30, 34, 44, 50, 52, 55, 60, 61};
        int[] values2 = {8, 10, 13, 25, 30, 33, 50, 55, 61, 65};
        
        ListNode h1 = insertValues(values1);
        ListNode h2 = insertValues(values2);
        
        System.out.println("Linked List h1:");
        printList(h1);
        System.out.println("Linked List h2:");
        printList(h2);
        
        findCommon(h1, h2);
    }
    
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
