package com.greatLearning.SkyScrapper.Service;

public class LinkedList {
	Node head;
	Node node;
	Node currNode;
	class Node {
        int data;
        Node prev;
        Node next;
		Node(int d) { data = d; }
    }
	public void append(int new_data)
    {
       Node new_node = new Node(new_data);
  
        Node last = head; /* used in step 5*/
  
        new_node.next = null;
  
        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }
  
        while (last.next != null)
            last = last.next;
  
        last.next = new_node;
        new_node.prev = last;
    }

		
	}

 

