package BinarySearchTreeBST;

class AVLNode { // creting a node class which will be used as node
	int data;
	int height;
	AVLNode left;
	AVLNode right; // avl tree, height is also required

	AVLNode(int data) {
		this.data = data;
		this.height = 1; // every new node would have height 1
	}
}

class AVLTree {
	private AVLNode root;

	public void insertData(int data) {

		root = insertHelper(root, data);
	}

	private AVLNode insertHelper(AVLNode root, int data) {

		/* 1. Perform the normal BST insertion */
		if (root == null) {
			AVLNode node = new AVLNode(data);
			return node;
		}
		if (data < root.data) {
			root.left = insertHelper(root.left, data);
		} else if (data > root.data) {
			root.right = insertHelper(root.right, data);
		}
		
		
		/* 2. Update height insertion k bad height change
		     hua hoga */
		root.height = Math.max(height(root.left), height(root.right)) + 1; 
		
		
		 /* 3. Get the balance factor of this ancestor 
        node to check whether this node became 
        unbalanced */
		int balFact = balancingFactor( root );
		
		
		
		// If this node becomes unbalanced, then there can be 4 cases
		
		//a. left left case
		if( balFact > 1 && data < root.left.data ) {
			//if left left case hai thn prfrm 
			//rightRotation
			return rightRotate( root );
		}
		
		//b. right right case
		if (balFact < -1 && data > root.right.data) {
			// if right right case hai thn prfrm
			// leftRotation
			return leftRotate(root);
		}

        //c. Left Right Case 
        if (balFact > 1 && data > root.left.data) { 
        	// if left right case hai thn
        	//phle root.left ko left rotate kro
        	//thn root ko right rotate
            root.left = leftRotate(root.left); 
            return rightRotate(root); 
        } 
        
      //d. Right left Case 
        if (balFact < -1 && data < root.left.data) { 
        	// if Right left Case e hai thn
        	//phle root.right ko right rotate kro
        	//thn root ko left rotate
            root.right = rightRotate(root.right); 
            return leftRotate(root); 
        } 
		

		return root;
	}

	// A utility function to right rotate subtree rooted with c
	private AVLNode rightRotate(AVLNode c) {

		// see textbook
		// caturing values
		AVLNode b = c.right;
		AVLNode T3 = b.right;

		// rotate right
		b.right = c;
		c.left = T3;

				// update height
		//height of c will be calculated first because
		//height ob b will depend on heigght of c
        c.height = Math.max(height(c.left), height(c.right)) + 1; 
        b.height = Math.max(height(b.left), height(b.right)) + 1; 
		
        // Return new root 
		return b;

	}
	
	// A utility function to left rotate subtree rooted with c 
    AVLNode leftRotate(AVLNode c) {
    	
    	// see textbook
    	// caturing values
    	AVLNode b = c.right; 
    	AVLNode T2 = b.left; 
  
        // Perform rotation 
        b.left = c; 
        c.right = T2; 
  
        		// Update heights 
        //height of c will be calculated first because
      	//height ob b will depend on heigght of c
        c.height = Math.max(height(c.left), height(c.right)) + 1; 
        b.height = Math.max(height(b.left), height(b.right)) + 1; 
  
        // Return new root 
        return b; 
    } 

    
	// A utility function to get the height of the tree
	int height(AVLNode root) {
		if (root == null)
			return 0;

		return root.height;
	}
	
	
	// A utility function to get balancing factor of a node
	int balancingFactor( AVLNode root ) {
		if( root == null ) {
			return 0;
		}
		return height( root.left ) - height( root.right );
	}

//==========================================================	
	public void display() {
		displayHelper(root);
	}

	private void displayHelper(AVLNode root) {

		if (root == null) {
			return;
		}

		String str = "";
		if (root.left != null) {
			str += root.left.data;
		} else {
			str += ".";
		}
		str += " => " + root.data + " <= ";
		if (root.right != null) {
			str += root.right.data;
		} else {
			str += ".";
		}
		System.out.println(str);
		displayHelper(root.left); 
		displayHelper(root.right);

	}
//=============================================================	
}
