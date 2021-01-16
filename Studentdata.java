import java.util.Scanner;
class student{
   int roll_no;
   String name;
   int marks;
   student next;
   
   student(int a,String n,  int m){
     roll_no=a;
     name=n;  
     marks=m;
   }
}
class LinkList

{

 student start;



public void insertAtLast(int a,String n,  int m)

{

student t=start;

student st=new student(a,n,m);

if(start==null)

{
 start=st;
}

while(t.next!=null){
  t=t.next;
}
t.next=st;
st.next=null;
 

}



public void insert(int a,String n,  int m)

{
student ptr;
 ptr=start;
student st=new student(a,n,m);


 
 if(start==null){
   start=st;
  }
 else if(a<start.roll_no){
   st.next=start;
   start=st;
 }

 else {

 

while(a<ptr.roll_no)
{
 if(a>ptr.roll_no){
   insertAtLast(a,n,m);
   }
  
ptr=ptr.next;
}

st.next=ptr.next;
ptr.next=st;
}

}


public void deletePos(int p)

{

	student t,t2;
        int num=1;

if(start==null)

{System.out.println("List is Empty");}



else
{

    t=start;
    t2=start; 
    if(start.roll_no==p)   
      start=start.next;
while(t.roll_no!=p){
   
  t2=t;
  t=t.next;
  num++;
}
t2.next=t.next;
}
	               
}



public void display()

{

	student t;

if(start==null)

	{   System.out.println("List Is Empty");}

else

{

	t=start;

while(t.next!=null){
System.out.println(t.roll_no+" "+ t.name+" "+t.marks );

t=t.next;
}
System.out.println(t.roll_no+" "+ t.name+" "+t.marks);




}

}

}
public class Studentdata

{

public static void main(String []args)

{

Scanner sc=new Scanner(System.in);

LinkList List=new LinkList();





while(true )

{







System.out.println("Menu");

System.out.println("1.Insert student data At position");

System.out.println("2.Delete student data  ");

System.out.println("3.Display");

System.out.println("4.Exit");





System.out.println("Enter Choice ");

int ch=sc.nextInt();



switch(ch)

{


case 1 :

System.out.println("Enter details");

int b1=sc.nextInt();
String p1=new String();
 p1=sc.next();

int c1=sc.nextInt();



List.insert(b1,p1,c1);

break;

case 2 :

System.out.println("Enter position");

int pos1=sc.nextInt();

 List.deletePos(pos1);

 break;

 case 3 :

 List.display();

 break;

 case  4 : 

 System.exit(0);

 default :System.out.println("Invalid Choice ");



}



}

}

}




       