import java.util.Scanner;

 class Node
{
  int data;
  Node next;
  Node(int d){
    data=d;
  }
}
class LinkList{
 Node start;
 Node tail;
public void insertAtFirst(int k){
Node n=new Node(k);
if(start==null){
  start=n;
  tail=n;
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
tail.next=n;
tail=n;
}

public void deleteFirst()

{

if(start==null)

	System.out.println("queue Is Empty");
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

public void display()

{
  Node t;
  if(start==null)
    {   System.out.println("List Is Empty");}
 else
 {
   t=start;

while(t.next!=null){
System.out.print(t.data+" ");
t=t.next;
}
System.out.print(t.data+"\n");
}

}

}
 class Dequeue

{

public static void main(String []args)

{

Scanner sc=new Scanner(System.in);

LinkList List=new LinkList();
while(true )

{
System.out.println("Menu");

System.out.println("1.Insert At Beginning");

System.out.println("2.Insert at Last");

System.out.println("3.Delete First ");

System.out.println("4.Delete Last");

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

case 2:

System.out.println("Enter a No");

int d=sc.nextInt();

List.insertAtLast(d);

break;

case 3 :

List.deleteFirst(); 

break;

case 4:

List.deleteLast(); 

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