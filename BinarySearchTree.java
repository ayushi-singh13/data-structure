import java.util.*;

public class BinarySearchTree {
	public static  Node root;
	public BinarySearchTree(){
		this.root = null;
	}
	
	public boolean find(int id){
		Node current = root;
		while(current!=null){
			if(current.data==id){
				return true;
			}else if(current.data>id){
				current = current.left;
			}else{
				current = current.right;
			}
		}
		return false;
	}
	public boolean delete(int id){
		Node parent = root;
		Node current = root;
		boolean isLeftChild = false;
		while(current.data!=id){
			parent = current;
			if(current.data>id){
				isLeftChild = true;
				current = current.left;
			}else{
				isLeftChild = false;
				current = current.right;
			}
			if(current ==null){
				return false;
			}
		}
		//if i am here that means we have found the node
		//Case 1: if node to be deleted has no children
		if(current.left==null && current.right==null){
			if(current==root){
				root = null;
			}
			if(isLeftChild ==true){
				parent.left = null;
			}else{
				parent.right = null;
			}
		}
		//Case 2 : if node to be deleted has only one child
		else if(current.right==null){
			if(current==root){
				root = current.left;
			}else if(isLeftChild){
				parent.left = current.left;
			}else{
				parent.right = current.left;
			}
		}
		else if(current.left==null){
			if(current==root){
				root = current.right;
			}else if(isLeftChild){
				parent.left = current.right;
			}else{
				parent.right = current.right;
			}
		}else if(current.left!=null && current.right!=null){
			
			//now we have found the minimum element in the right sub tree
			Node successor	 = getSuccessor(current);
			if(current==root){
				root = successor;
			}else if(isLeftChild){
				parent.left = successor;
			}else{
				parent.right = successor;
			}			
			successor.left = current.left;
		}		
		return true;		
	}
	
	public Node getSuccessor(Node deleleNode){
		Node successsor =null;
		Node successsorParent =null;
		Node current = deleleNode.right;
		while(current!=null){
			successsorParent = successsor;
			successsor = current;
			current = current.left;
		}
		//check if successor has the right child, it cannot have left child for sure
		// if it does have the right child, add it to the left of successorParent.
//		successsorParent
		if(successsor!=deleleNode.right){
			successsorParent.left = successsor.right;
			successsor.right = deleleNode.right;
		}
		return successsor;
	}
	public void insert(int id){
		Node newNode = new Node(id);
		if(root==null){
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while(true){
			parent = current;
			if(id<current.data){				
				current = current.left;
				if(current==null){
					parent.left = newNode;
					return;
				}
			}else{
				current = current.right;
				if(current==null){
					parent.right = newNode;
					return;
				}
			}
		}
	}
	public void inorder(Node root){
		if(root!=null){
			inorder(root.left);
			System.out.print(" " + root.data);
	                inorder(root.right);
		}
	}
      public void postorder(Node root){
  if(root!=null){
  postorder(root.left);
  postorder(root.right);
  System.out.print(root.data+" ");
 }
 }
  public void preorder(Node root){
 if(root!=null){
  System.out.print(root.data+" ");
  preorder(root.left);
  preorder(root.right);
 }
 }
	public static void main(String arg[]){
         Scanner sc=new Scanner(System.in);
         BinarySearchTree t1=new BinarySearchTree();
    
		   while(true){
     System.out.print("\nenter choice\n1.insert\n2.search\n3.delete\n4.inorder\n5.preorder\n6.postorder\n7.exit");
     int ch=sc.nextInt();
    switch(ch){
      case 1:
         System.out.println("enter node value");
         int n=sc.nextInt();
         t1.insert(n);
         break;
     case 2:
         System.out.println("enter key");
         int f=sc.nextInt();
         t1.find(f);
         break;
    case 3:
         System.out.println("enter key to be deleted");
         int del=sc.nextInt();
         t1.delete(del);
         break;
    case 4:
         t1.inorder(t1.root);
         break;
   case 5:
         t1.preorder(t1.root);
         break;
   case 6:
        t1.postorder(t1.root);
         break;
   
   }
  }
	}
}

class Node{
	int data;
	Node left;
	Node right;	
	public Node(int data){
		this.data = data;
		left = null;
		right = null;
	}
}