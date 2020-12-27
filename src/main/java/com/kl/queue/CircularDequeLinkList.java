package com.kl.queue;

class Node {
    int val;
    Node prev, next;

    Node(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

public class CircularDequeLinkList {

    int count;
    int capacity;
    Node head, tail;

    public CircularDequeLinkList(int k) {
        this.count = 0;
        this.capacity = k;
    }

    public boolean insertFront(int value) {
        if (this.count == this.capacity) {
            return false;
        }
        Node newNode = new Node(value);
        if (this.count == 0) {
            this.head = this.tail = newNode;
        } else {
            this.head.prev = newNode;
            newNode.next = this.head;
            this.head = this.head.prev;
        }
        this.count++;
        return true;
    }

    public boolean insertLast(int value) {
        if (this.count == this.capacity) {
            return false;
        }
        Node newNode = new Node(value);
        if(this.count == 0){
            this.head = this.tail = newNode;
        }else{
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = this.tail.next;
        }
        this.count++;
        return true;
    }

    public boolean deleteFront(){
        if(this.count==0){
            return false;
        }
        if(this.count == 1){
            this.head = this.tail = null;
        }
        else{
            Node newHead = this.head.next;
            this.head.next = null;
            this.head = newHead;
            this.head.prev = null;
        }
        this.count--;
        return true;
    }
    public boolean deleteLast(){
        if(this.count == 0){
            return false;
        }
        if(this.count == 1){
            this.head = this.tail = null;
        }
        else{
            Node newTail = this.tail.prev;
            this.tail.prev = null;
            this.tail = newTail;
            this.tail.next = null;
        }
        this.count--;
        return true;
    }
    public int getFront(){
        return this.count > 0 ? this.head.val : -1;
    }

    public  int getRear(){
        return this.count > 0 ? this.tail.val : -1;
    }
    public boolean isEmpty(){
        return  this.count == 0;
    }
    public boolean isFull(){
        return this.count == this.capacity;
    }
}
