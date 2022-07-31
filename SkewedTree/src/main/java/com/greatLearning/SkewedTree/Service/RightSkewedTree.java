package com.greatLearning.SkewedTree.Service;

import java.util.Stack;

public class RightSkewedTree {

	public Node node;
	public Node root;
	public Node head = null;
	public Node prev = null;
	public class Node
	{
		int val;

		Node left, right;

		public Node(int item)
		{
			this.val = item;
			left = right = null;
		}
	}
	public void insert(int key)
	{
		root = insertKey(root, key);
	}

	/* A recursive function to insert a new key in BST */
	Node insertKey(Node root, int data)
	{

		if (root == null) {
			root = new Node(data);
			return root;
		}

		if (data < root.val)
			root.left = insertKey(root.left, data);
		else if (data > root.val)
			root.right = insertKey(root.right, data);

		return root;
	}
	 public void inorder()
	{
		inorderRec(this.root);
	}

	// Recursive function for inorder traversal of the tree
	void inorderRec(Node node)
	{
		if (node == null)
			return;

		inorderRec(node.left);
		//convertBSTToSkewed(node);
		inorderRec(node.right);
		convertBSTToSkewed(node);
		
	} 
    public void convertBSTToSkewed(Node root)
	{
        
		if(root == null)
		{
			return;
		}
		
			
		if(head == null)
		{
			head = root;
			root.left = null;
			System.out.println("head.val" +head.val);
		}
		else
		{
			
			head.right = root;
			root.left = null;
			//prev = root;
		}

		//convertBSTToSkewed(rightNode);

	} 
	public void displayRightSkewed(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.val + " ");
		displayRightSkewed(root.right);       
	}
	
}
