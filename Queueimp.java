import java.util.*;
class queue{
 int data[];
 int item;
 int rear;
 int front;
 int size;
 queue(int s){
  size=s;
  data=new int[size];
  front=-1;
  rear=-1;
 }

    
 void enqueue(int a){
  if(((rear+1==front))||((front==0)&&(rear+1==size))){
  
     System.out.println("queue overflow");
  }
   else if((front==-1)&&(rear==-1)){
      front=0;
      rear=0;
      item=a;
      data[rear]=item; 
    }
   else{
   rear=(rear+1)%size;
   item=a;
   data[rear]=item;
  
 }
}
void dequeue(){
  if(rear==-1) {
   System.out.println("queue underflow");
 }
  else{
    if(front==rear){
      rear=-1;
      front=-1;
    }
    
    else{
    front=(front+1)%size;
    }
  }
 }
void display(){
  int i=front;
while(i!=rear){
 System.out.print(data[i]+" ");
 i=(i+1)%size;
}
System.out.print(data[i]);
		

}

}
class Queueimp{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter queue size");
    int s=sc.nextInt();
    queue q1=new queue(s);
    int n=1;
     while(n==1){
  System.out.print("enter choice\n1.enqueue\n2.dequeue\n3.display element\n");
  int ch=sc.nextInt();
  switch(ch){
  case 1: System.out.println("enter element to be pushed");
          int el=sc.nextInt();
          q1.enqueue(el);
          break;
  case 2 : q1.dequeue();
          break;
 
  case 3: q1.display();
          break;

  default: System.out.println("invalid choice");
           break;
  }
  System.out.println("\nto continue press 1");
   n=sc.nextInt();
  }
}
}
