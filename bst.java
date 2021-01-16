import java.util.*;

class treenode{
 int data;
 treenode leftchild;
 treenode rightchild;
 treenode(int k){
  data=k;
  leftchild=null;
  rightchild=null;
 }
}
 
class bst{
 public treenode root;
 public bst(){
   this.root=null;
 }

 public void insert(int id){
		treenode newNode = new treenode(id);
		if(root==null){
			root = newNode;
			
		}
                else{
		treenode current = root;
		treenode parent = null;
		while(true){
			parent = current;
			if(id<current.data){				
				current = current.leftchild;
				if(current==null){
					parent.leftchild = newNode;
					return;
				}
			}else{
				current = current.rightchild;
				if(current==null){
					parent.rightchild = newNode;
					return;
				}
			}
		}
	} 
 }
 
 public boolean search(int key){
  treenode current=root;
  while(current.data!=key){
  if(current.data==key)
      return true;
  else if(key<current.data)
     current=current.leftchild;
   else
     current=current.rightchild;
  
  }
  return false;
 }
 public void delete(int key){
  treenode current=root;
  treenode parent=root;
  boolean isleftchild=true;
  while(current.data!=key){
  parent=current;
  if(key<current.data){
   
   isleftchild=true;
   current=current.leftchild;
  }
  else{
   isleftchild=false;
   current=current.rightchild;
  }
 }
  if((current.leftchild==null) && (current.rightchild==null)){
    if(current==root)
      root=null;
    else if(isleftchild)
      parent.leftchild=null;
    else
      parent.rightchild=null;
  }
  else if(current.rightchild==null){
     if(current==root)
      root=root.leftchild;
     else if(isleftchild)
       parent.leftchild=current.leftchild;
     else
      parent.rightchild=current.leftchild;

 }
  else if(current.leftchild==null){
     if(current==root)
      root=root.rightchild;
     else if(isleftchild)
       parent.leftchild=current.rightchild;
     else
      parent.rightchild=current.rightchild;

 }
 else{
  treenode temp=current.rightchild;
  treenode sparent=null;
  treenode successor=current.rightchild;
  
  while(temp!=null){
   sparent=successor;
   successor=temp;
   temp=temp.leftchild;
  }
  if(successor!=current.rightchild){
     sparent.leftchild=successor.rightchild;
     successor.rightchild=current.rightchild;
    
  }
  if(current==root)
    current=successor;
 else if(isleftchild)
    parent.leftchild=successor;
 else
  parent.rightchild=successor;
 }
}
public void preorder(treenode root1){
 if(root1!=null){
  System.out.print(root1.data+" ");
  preorder(root1.leftchild);
  preorder(root1.rightchild);
 }
 }
public void inorder(treenode root1){
  if(root1!=null){
  inorder(root1.rightchild);
  System.out.print(root1.data+" ");
  inorder(root1.leftchild);
  }
 }
public void postorder(treenode root1){
  if(root1!=null){
  postorder(root1.leftchild);
  postorder(root1.rightchild);
  System.out.print(root1.data+" ");
 }
 }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    bst t1=new bst();
    
    
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
         t1.search(f);
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
   case 7:
        System.exit(0);
        break;
   }
  }
 }
}
