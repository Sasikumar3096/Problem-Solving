
public class BST {
	class Node{
		int data;
		Node left,right;
		public Node(int data) {
			this.data= data;
			left=right=null;
		}
		}
		Node root;
		BST(){
			root = null;
		}
		void insert(int data) {
			root = insertData(root,data);
		}
		Node insertData(Node root,int data)
		{
			if(root == null) {
				root = new Node(data);
				return root;
			}
			if(data < root.data)
				root.left = insertData(root.left,data);
			else
				if(data>root.data)
				root.right = insertData(root.right,data);
			return root;
		}
		
		 void inorder()  { 
		       inorderRec(root); 
		    } 
		  
		    // A utility function to do inorder traversal of BST 
		    void inorderRec(Node root) { 
		        if (root != null) { 
		            inorderRec(root.left); 
		            System.out.println(root.data); 
		            inorderRec(root.right); 
		        } 
		    } 
		    public static void main(String[] args) { 
		        BST tree = new BST(); 
		  
		        /* Let us create following BST 
		              50 
		           /     \ 
		          30      70 
		         /  \    /  \ 
		       20   40  60   80 */
		        tree.insert(50); 
		        tree.insert(30); 
		        tree.insert(20); 
		        tree.insert(40); 
		        tree.insert(70); 
		        tree.insert(60); 
		        tree.insert(80); 
		  
		        // print inorder traversal of the BST 
		        tree.inorder(); 
		    } 
}


