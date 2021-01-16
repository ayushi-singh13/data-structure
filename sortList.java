
import java.util.*;

 class Node{

 int data;
 Node next;

 Node(int d){

   data=d;
 }
}


class LinkList{

  Node start;
 public Node insertAtFirst(Node start,int k){
   Node n=new Node(k);
   if(start==null){
     start=n;
   }
    else{
      n.next=start;
      start=n;
   }
return start;
}

public Node deleteFirst(Node start){
  if(start==null)
     System.out.println("List Is Empty");
else{
   start=start.next;
}
return start;
}


public void display(Node start){
    Node t;
    if(start==null){   System.out.println("List Is Empty");
    }
    else{
       t=start;
       while(t.next!=null){
          System.out.print(t.data+"->");
          t=t.next;
       }
    System.out.print(t.data+"\n");
}
}

public Node mergeNode(Node n1 , Node n2){
  
  Node ptr=null;
  if(n1==null)
    return n2;
    if(n2==null)
    return n1;
  if(n1.data<=n2.data){
    ptr=n1;
    ptr.next=mergeNode(n1.next,n2);
  }
  else{
    ptr=n2;
    ptr.next=mergeNode(n1,n2.next);
  }
    return ptr;
}



public Node sort(Node start){
 if(start==null || start.next==null)
   return start;
 Node mid=getmid(start);
 Node head1=start;
 Node head2=mid.next;
 mid.next=null;
 Node merged= mergeNode(sort(head1),sort(head2));
 return merged;
}

public Node getmid(Node start){
if(start==null)
  return start;
 Node ptr=start;
 Node ptr1=start;
  while(ptr1.next!=null && ptr1.next.next!=null){
    ptr=ptr.next;
    ptr1=ptr1.next.next;
   
 }
  return ptr;
}
}

 class sortList{

public static void main(String []args){

Scanner sc=new Scanner(System.in);

LinkList List=new LinkList();
Node head=null;

while(true ){

 System.out.println("Menu");

 System.out.println("1.Insert At Beginning");

 System.out.println("2.Delete First ");

 System.out.println("3.sort list");

 System.out.println("4.Display");

 System.out.println("5.Exit");

 System.out.println(".Enter Choice ");

 int ch=sc.nextInt();

switch(ch){
case 1 :

System.out.println("Enter a No");

int a=sc.nextInt();

head=List.insertAtFirst(head,a);

break;

case 2 :

head=List.deleteFirst(head); 

break;


case 3:

System.out.println("sorting list");

 head=List.sort(head);

 break;

 case 4 :

 List.display(head);

 break;

 case  5:

 System.exit(0);

 default :System.out.println("Invalid Choice ");
}
}

}

}



