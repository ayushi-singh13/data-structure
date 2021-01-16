import java.util.Scanner;

 class Node{
  int data;
  Node next;
  Node(int d){
    data=d;
  }
}

class LinkList

{

 Node start;
public void insertAtFirst(int k)

{

Node n=new Node(k);

if(start==null)

{

  start=n;
  

}

else

{

n.next=start;

start=n;

}

}


public void insertAtLast(int k)

{

Node t=start;

Node n=new Node(k);

if(start==null)

{
 start=n;
}

while(t.next!=null){
  t=t.next;
}
t.next=n;
n.next=null;
 

}

public void insertAtPos(int k,int p)

{

Node n=new Node(k);
Node ptr;
ptr=start;
while(ptr.data!=p)
{
ptr=ptr.next;
}

n.next=ptr.next;
ptr.next=n;

}

public void deleteFirst()

{



if(start==null)

	System.out.println("List Is Empty");

else

{

start=start.next;

}

}

public void deleteLast()

{

	Node t;

	t=start;
        Node prev;
       prev=start;

	if(start.next==null)

		{ start=null;}

	else{

while(t.next!=null)

{
prev=t;
t=t.next;

}
prev.next=null;



}


}



public void deletePos(int p)

{

	Node t,t2;

if(start==null)

{System.out.println("List is Empty");}


else
{

    t=start;
    t2=start;
while(t.data!=p){
  t2=t;
  t=t.next;
}
t2.next=t.next;
}
	               
}



public void display()

{

	Node t;

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

public void middle(){
   Node f=start;
   Node s=start;
  
   while(f!=null && f.next!=null){
    
     s=s.next;
     f=f.next.next;
   }
   System.out.println("middle element is :" + s.data);
 }





}



public class midel

{

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

System.out.println("8.Find middle");

System.out.println("9.Exit");





System.out.println("Enter Choice ");

int ch=sc.nextInt();

switch(ch){

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

List.insertAtPos(b,c);

break;



case 3:

System.out.println("Enter a No");

int d=sc.nextInt();

List.insertAtLast(d);

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
 
 case 8 :
 List.middle();
 
 break;

 case  9 : 

 System.exit(0);

 default :System.out.println("Invalid Choice ");



}



}

}

}

