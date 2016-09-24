package org.learn.Client;

import org.learn.List.Node;
import org.learn.Question.ReverseLinkedListInPair;

public class DemoLinkedListInPairs {
	
	public static void main(String[] args) {
		
		int[] data = { 10, 20, 30, 40, 50 };
		Node head = new Node(data[0]);
		
		for (int count = 1; count < data.length; count++) {
			ReverseLinkedListInPair.insert(head, data[count]);
		}
		
		System.out.printf("1. Single linked list is : ");
		ReverseLinkedListInPair.print(head);

		System.out.printf("2. Reverse single linked list in pairs : ");
		head = ReverseLinkedListInPair.reverseLinkedListInPair(head);
		ReverseLinkedListInPair.print(head);
	}
}