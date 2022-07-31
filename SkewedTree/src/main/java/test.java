
public class test {

	// Driver Code
	 public static void main (String[] args)
	 {
	    
	     RightSkewedTree tree = new RightSkewedTree();
	     tree.insert(50);
	     tree.insert(30);
	     tree.insert(60);
	     tree.insert(10);
	     tree.insert(55);
	     tree.inorder();
	        
	     tree.convertBSTToSkewed(tree.node);
	     tree.displayRightSkewed(tree.head);
	 }
}

