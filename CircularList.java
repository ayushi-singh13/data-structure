import java.util.Scanner;
class Node{
 int data;
 Node next;
 Node(int d){
  data=d;
  }
}
class LinkList{
  Node start;
  Node last;
  void insertAtFirst(int d){
   Node n1=new Node(d);
    if(start==null){
      start=n1;
      last=n1;
      n1.next=start;
      
    }
    else{
     n1.next=start;
     start=n1;
     last.next=n1;
   }
 }
   void insertAfter(int d,int p){
    Node ptr;
    Node n1=new Node( d);
    ptr=start;
    if(start==null){
      start=n1;
      last=n1;
      last.next=start;
    }
   else{
     while(ptr.data!=p)
      ptr=ptr.next;
     
     n1.next=ptr.next;
     ptr.next=n1;
   }
  }
  void insertLast(int d){
   Node n1=new Node(d);
   last.next=n1;
   n1.next=start;
   last=n1;
  }
  void deleteFirst(){
   start=start.next;
   last.next=start;
   }
  void deletekey(int k){
   Node ptr;
   Node ptr2;
   ptr=start;
   ptr2=start; 
   while(ptr.data!=k){
     ptr2=ptr;
     ptr=ptr.next;
   }
   if(ptr==start)
     deleteFirst();
    
    else
   ptr2.next=ptr.next;
   
   }
  void display(){
    Node ptr;
    ptr=start;
    System.out.print(ptr.data+"->");
    ptr=ptr.next;
    while(ptr!=start){
     System.out.print(ptr.data+"->");
     ptr=ptr.next;
    }
   }
}
class CircularList{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);

LinkList List=new LinkList();
while(true )

{
System.out.println("Menu");

System.out.println("1.Insert At Beginning");

System.out.println("2.Insert After key");

System.out.println("3.Delete First ");

System.out.println("4.Delete key ");

System.out.println("5.Display");

System.out.println("6.Exit");

System.out.println("Enter Choice ");

int ch=sc.nextInt();
switch(ch)

{
case 1 :

System.out.println("Enter a No");

int a=sc.nextInt();

List.insertAtFirst(a);

break;

case 2 :

System.out.println("Enter a No");

int b=sc.nextInt();

System.out.println("key");

int c=sc.nextInt();

List.insertAfter(b,c);

break;

case 3 :

List.deleteFirst(); 

break;

case 4 :

System.out.println("Enter key");

int p=sc.nextInt();

 List.deletekey(p);

 break;

 case 5:

 List.display();

 break;

 case  6 : 

 System.exit(0);

 default :System.out.println("Invalid Choice ");

}

}
}
}