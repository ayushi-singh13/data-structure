import java.util.*;
class Node{
  int data;
  int priority;
  Node next;
  Node(int d,int p){
   data=d;
   priority=p;
   next=null;
 } 
}
class PriorityQueue{
  Node start;
  void enqueue(int d,int p){
    Node n1=new Node(d,p);
    Node ptr=start;
    if(start==null)
     start=n1;
    else{
      if(n1.priority>start.priority){
       n1.next=start;
       start=n1;
      }
      else{
       while((ptr.next!=null)&&(ptr.next.priority>n1.priority)){
          ptr=ptr.next;
         }
        
        n1.next=ptr.next;
        ptr.next=n1;
       }
     }
 }
   void pop(){
    if(start==null)
     System.out.println("empty");
    else
     start=start.next;
    
  }
  void display(){
   Node t;
   if(start==null) 
    System.out.println("queue Is Empty");
   else{
      t=start;
      while(t.next!=null){
        System.out.println(t.data);
        t=t.next;
       }
   System.out.print(t.data+"\n");
   }
  }
}
class Prqueue{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   PriorityQueue q1=new PriorityQueue();
    int n=1;
     while(n==1){
  System.out.print("enter choice\n1.enqueue\n2.dequeue\n3.display element\n");
  int ch=sc.nextInt();
  switch(ch){
  case 1: System.out.println("enter element and its priority");
          int el=sc.nextInt();
          int pr=sc.nextInt();
          q1.enqueue(el,pr);
          break;
  case 2 : q1.pop();
          break;
 
  case 3: q1.display();
          break;

  default: System.out.println("invalid choice");
           break;
  }
  System.out.println("to continue press 1");
   n=sc.nextInt();
  }
}
}
   
  
       