package com.kl.tmp;

public class MergeKLists {

    public ListNode mergeKListsKPoint(ListNode[] lists){
        int k = lists.length;
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        while (true){
            ListNode minNode = null;
            int minPoint = -1;
            for(int i = 0; i < k; i ++){
                if(lists[i] == null){
                    continue;
                }
                if (minNode == null || lists[i].val < minNode.val){
                    minNode = lists[i];
                    minPoint = i;
                }

            }
            if (minPoint == -1){
                break;
            }
            tail.next = minNode;
            tail = tail.next;
            lists[minPoint] = lists[minPoint].next;
        }
        return dummyHead.next;


    }
}
