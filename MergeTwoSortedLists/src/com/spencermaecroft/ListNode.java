package com.spencermaecroft;

/**
 * Created by SMC on 08/08/2020
 */

public class ListNode {
    public int val;
    public ListNode next;

    ListNode(){};
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
