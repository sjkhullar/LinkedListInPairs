package org.learn.Client;

import org.learn.List.Node;
import org.learn.Question.ReverseLinkedListInPair;

public class App 
{
	public static void main( String[] args )
    {
		int[] data = {10, 20, 30, 40, 50};
		Node head = new Node(data[0]);
		for(int count = 1; count < data.length; count++)
			ReverseLinkedListInPair.insert(head,data[count]);
		
		System.out.printf("Linked list is : ");
		ReverseLinkedListInPair.print(head);
		
		System.out.printf("Reverse Linked list in pairs : ");
		head = ReverseLinkedListInPair.reverseLinkedListInPair(head);
		ReverseLinkedListInPair.print(head);		
    }
}