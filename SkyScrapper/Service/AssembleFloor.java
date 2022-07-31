package com.greatLearning.SkyScrapper.Service;

import com.greatLearning.SkyScrapper.Service.LinkedList.Node;

public class AssembleFloor {
	
    
    public void checkAssembleFloors(LinkedList floorSizeList,int noFloors, int maxFloorSize) {
	/* Initialize node with head */
	floorSizeList.node = floorSizeList.head;
	
	/* traverse through the linked list for each day */
	for(int i=1; i<=noFloors; i++) {
		
		System.out.println("Day: " + i);
		/* store the node in the currnode 
		 * - used to repoint node to currnode 
		 * after reverse traversal */ 
		floorSizeList.currNode = floorSizeList.node;
		/* if max is found, then reverse traverse linked list */			
		if(floorSizeList.node.data == maxFloorSize) {		    
		while(floorSizeList.node!=null) {
			if(floorSizeList.node.data == maxFloorSize)
			 {
				System.out.print(floorSizeList.node.data + " ");
				maxFloorSize--; /* decrement maxFloorSize */
				
			}
			/* Moving to prev Node for reverse traversing */
			floorSizeList.node = floorSizeList.node.prev;
		}
		/* Pointing node to currNode.next 
		 * to start the next iteration from this node */
		floorSizeList.node = floorSizeList.currNode.next;
		}
		else {
			/* Moving the node to next node 
			 * if the current node is not equal to maxFloorSize */
			if(floorSizeList.node.next!=null)
			floorSizeList.node = floorSizeList.node.next;
		}
		
		System.out.println("");			
	}
    }
}
