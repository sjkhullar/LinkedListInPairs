package org.learn.Question;

import org.learn.List.Node;

public class ReverseLinkedListInPair {
	
	public static Node reverseLinkedListInPair(Node head) {
		Node prev = head;
		Node newHead = head.next;
		Node temp = head.next;
		//1 -> 2 -> 3
	    while(head != null && head.next != null){
	        prev.next = head.next;
	        head.next = temp.next;
	        temp.next = head;
	        if(head.next != null){
	            prev = head;
	            head = head.next;
	            temp = head.next;
	        }
	    }
	    return newHead;
	}
	
	public static void insert(Node head, int data) {
		while(head.next != null) 
			head = head.next;
		head.next = new Node(data);
	}
	
	public static void print(Node head) {
		while(head != null) {
			System.out.printf("%d ",head.data);
			head = head.next;
		}
		System.out.println("");		
	}
}
