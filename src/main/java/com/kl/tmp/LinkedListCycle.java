package com.kl.tmp;

import java.util.Set;
import java.util.HashSet;


public class LinkedListCycle {

    public boolean hasCycle(ListNode head){
        Set<ListNode> nodesSeen = new HashSet();
        while (head != null){
            if (nodesSeen.contains(head)){
                return true;
            }else{
                nodesSeen.add(head);
            }
            head = head.next;
        }
        return false;
    }

    public boolean fastSlowPointer(ListNode head){
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast){
            if(fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }


}



