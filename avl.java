import java.util.*;

public class avl {
	public static  Node root;
	public avl(){
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
        public int max(int a, int b){
          if(a>b)
           return a;
        
          return b;
        }
        public int getheight(Node root){
           if(root==null)
             return 0;
          
          return 1+max(getheight(root.left),getheight(root.right));
       } 
      
       public Node rightrotate(Node disbal){
         Node newroot=disbal.left;

         disbal.left=disbal.left.right;
         newroot.right=disbal;

         disbal.height=getheight(disbal);
         newroot.height=getheight(newroot);

         return newroot;
       }



       public Node leftrotate(Node disbal){
        Node newroot=disbal.right;

         disbal.right=disbal.right.left;
         newroot.left=disbal;

         disbal.height=getheight(disbal);
         newroot.height=getheight(newroot);

         return newroot;
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
		Node successsorParent=null;
		Node current = deleleNode.right;
		while(current!=null){
			successsorParent = successsor;
			successsor = current;
			current = current.left;
		}
		
		if(successsor!=deleleNode.right){
			successsorParent.left = successsor.right;
			successsor.right = deleleNode.right;
		}
		return successsor;
	}
	public Node insert(Node root,int id){
		Node newNode = new Node(id);
		if(root==null){
			root = newNode;
			return root;
		}
		else if(id<root.data)
                  root.left=insert(root.left,id);
               else if(id>root.data)
                  root.right=insert(root.right,id);
              else
                 return root;


             int balance=getheight(root.left)-getheight(root.right);
             
             if(balance>1){
              if (getheight(root.left.left)>=getheight(root.left.right))
                  return rightrotate(root);
             else{
                 
                  leftrotate(root.left);
                  return rightrotate(root);
                 }   
              }
            else if(balance<-1){
              if (getheight(root.right.right)>=getheight(root.right.left))
                  leftrotate(root);
             else{
                 
                  rightrotate(root.right);
                  return leftrotate(root);
                 }   
             }
             
             root.height=max(getheight(root.left),getheight(root.right));
             return root;                   
           
             
	}
	public void inorder(Node root){
		if(root!=null){
			inorder(root.left);
			System.out.print(" " + root.data);
			inorder(root.right);
		}
	}
       public void preorder(Node root){
		if(root!=null){
			preorder(root.left);
			System.out.print(" " + root.data);
			preorder(root.right);
		}
	}
	public static void main(String arg[]){
         Scanner sc=new Scanner(System.in);
         avl t1=new avl();
    
		   while(true){
     System.out.print("\nenter choice\n1.insert\n2.search\n3.delete\n4.inorder\n5.preorder\n7.exit");
     int ch=sc.nextInt();
    switch(ch){
      case 1:
         System.out.println("enter node value");
         int n=sc.nextInt();
         t1.insert(t1.root,n);
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
   }
  }
	}
}

class Node{
	int data,height;
	Node left;
	Node right;	
	public Node(int data){
		this.data = data;
                height=1;
		left = null;
		right = null;
	}
}