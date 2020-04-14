//Code: BST Class
//Send Feedback
//Implement the BST class which includes following functions -
//1. search
//Given an element, find if that is present in BSt or not. Return true or false.
//2. insert -
//Given an element, insert that element in the BST at the correct position. 
//Assume unique elements will be given.
//3. delete -
//Given an element, remove that element from the BST.
//If the element which is to be deleted has both children,
//replace that with the minimum element from right sub-tree.
//4. printTree (recursive) -
//Print the BST in ithe following format -
//For printing a node with data N, you need to follow the exact format -
//N:L:x,R:y
//wherer, N is data of any node present in the binary tree.
//x and y are the values of left and right child of node N.
//Print the children only if it is not null.
//There is no space in between.
//You need to print all nodes in the recursive format in different lines.
//Note : main function is given for your reference which we are using 
//internally to test the class.

package BinarySearchTreeBST;

public class BinarySearchTree {

	private BinaryTreeNode<Integer> root;
	
	
	public void insertData( int data ) {    //time complexity-O(h)
		root = insertHelper( data, root ); // we must update root here
	}
	private BinaryTreeNode<Integer> insertHelper(int data, BinaryTreeNode<Integer> root) {

		if( root == null ) {
			BinaryTreeNode<Integer> output = new BinaryTreeNode<>(data);
			return output;
		}
		if( root.data > data ) {
			root.left = insertHelper( data, root.left );
			return root;
		}
		else {
			root.right = insertHelper( data, root.right );
			return root;
		}
	}
//=========================================================================	
	public void deleteData(int data) {       //time complexity-O(h)

		root = deleteDataHelper(data, root);   //we must update root here
	}
	private BinaryTreeNode<Integer> deleteDataHelper(int data, BinaryTreeNode<Integer> root) {

		if( root == null ) {
			return null;
		}
		if( data < root.data ) {
			root.left = deleteDataHelper(data, root.left );
			return root;
		}
		else if( data > root.data ) {
			root.right = deleteDataHelper(data, root.right );
			return root;
		}
		else{	
			if( root.left == null && root.right == null ) {
				return null;        // root deleted
			}
			else if( root.left != null && root.right == null ) {
				return root.left;   //now root.left is new root
			}
			else if( root.left == null && root.right != null ) {
				return root.right;  // now root.right is new root
			}
			else {
				//here we will find min node of right subtree
				//iteratively as it could replace the root node 
				BinaryTreeNode<Integer> minNode = root.right;
				while( minNode.left != null ) {  //sbse min data left m hi hoga  jo ki
					minNode = minNode.left;      //right subtree ka sbse left data hoga
				}
				root.data = minNode.data;
				//now jo right ka node root bna h usse delete krna
				//hoga right subtree
				root.right = deleteDataHelper( minNode.data, root.right );
				return root;
			}
		}
		
	}
//===========================================================================	
	public boolean hasData( int data ) {				//time complexity-O(h)
		
		return hasDataHelper( data, root );		
	}
	private boolean hasDataHelper(int data, BinaryTreeNode<Integer> root) {

		if( root == null ) {
			return false;
		}
		if( root.data == data ) {
			return true;
		}
		else if( root.data > data ) {
			return hasDataHelper( data, root.left );
		}
		else{
			return hasDataHelper( data, root.right );
		}
	}
//===========================================================================	
	public void printTree() {					//time complexity-O(n)
		printTree( root );
	}
	 private void printTree(BinaryTreeNode<Integer> root) {

		if (root == null) {
			return;
		}
		String toBePrinted = root.data + " : ";
		if (root.left != null) {
			toBePrinted += "L" + root.left.data + ", ";
		}
		if (root.right != null) {
			toBePrinted += "R" + root.right.data;
		}
		System.out.println(toBePrinted);
		printTree(root.left);
		printTree(root.right);
	}
//===========================================================================	 
}