import java.util.*;
class node{
  int data;
  node next;
  node prev;
  node(int d){
  data=d;
  next=null;
  prev=null;
  }
}
class LinkList{
 node start;
 node last;
 void insertfirst(int d){
 node n1=new node(d);
  if(start==null){
   start=n1;
   last=start;
  }
  else{
   n1.next=start;
   start.prev=n1;
   start=n1;
  }
 }
 void insertlast(int d){
  node n1=new node(d);
  if(start==null){
    start=n1;
    last=start;
  }
  else if(start==last){
   n1.prev=start;
   start.next=n1;
   last=n1;
 }
  else{
   n1.prev=last;
   last.next=n1;
   last=n1;
  }
 }
 void insertkey(int d,int p){
  node ptr;
  node n1=new node(d);
  ptr=start;
  while(ptr.data!=p){
    ptr=ptr.next;
  }
 n1.next=ptr.next;
 n1.prev=ptr;
 ptr.next.prev=n1;
 ptr.next=n1;
 
 }
public void deleteFirst()

{



if(start==null)

	System.out.println("List Is Empty");

else

{
  start.next.prev=null;
  start=start.next;

}

}

public void deleteLast()

{

	if(start.next==null)

		{ start=null;}

	else{

         last.prev.next=null;
         last=last.prev;



       }


}



public void deletePos(int p)

{

	node t;

if(start==null)

{System.out.println("List is Empty");}


else
{

    t=start;
    
while(t.data!=p){
  
  t=t.next;
}
 if(t==last){
  deleteLast();
 }
 else if(t==start){
  deleteFirst();
 }
else{
 t.prev.next=t.next;
 t.prev=null;
 t.next.prev=t.prev;
  }
 }
	               
}



public void display()

{

	node t;

if(start==null)

	{   System.out.println("List Is Empty");}

else

{

	t=start;

while(t.next!=null){
System.out.print(t.data+"->");

t=t.next;
}
System.out.print(t.data+"\n");




}

}

}

class Doublylist{

 public static void main(String []args)

{

Scanner sc=new Scanner(System.in);

LinkList List=new LinkList();





while(true )

{







System.out.println("Menu");

System.out.println("1.Insert At Beginning");

System.out.println("2.Insert After key");

System.out.println("3.Insert at Last");

System.out.println("4.Delete First ");

System.out.println("5.Delete Last");

System.out.println("6.Delete key ");

System.out.println("7.Display");

System.out.println("8.Exit");





System.out.println("Enter Choice ");

int ch=sc.nextInt();



switch(ch)

{



case 1 :

System.out.println("Enter a No");

int a=sc.nextInt();

List.insertfirst(a);

break;

case 2 :

System.out.println("Enter a No");

int b=sc.nextInt();

System.out.println("key");

int c=sc.nextInt();

List.insertkey(b,c);

break;



case 3:

System.out.println("Enter a No");

int d=sc.nextInt();

List.insertlast(d);

break;



case 4 :

List.deleteFirst(); 

break;

case 5:

List.deleteLast(); 

break;



case 6 :

System.out.println("Enter key");

int p=sc.nextInt();

 List.deletePos(p);

 break;

 case 7 :

 List.display();

 break;

 case  8 : 

 System.exit(0);

 default :System.out.println("Invalid Choice ");



}



}

}

}
