import java.util.Scanner;
class stk{
 int arr[]=new int[100];
 int item;  
 int size;
 int top=-1;
 stk(int s){
   size=s;
   top=-1;
 }
 void push(int d){
  if(top==size-1){
    System.out.println("stack overflow");
  }
  else{
   top++;
   item=d;
   arr[top]=item;
  }
 }
 void pop(){
  if(top==-1){
   System.out.println("stack underflow");
  }
  else{
   item=arr[top];
   top--;
  }
 }
 void remove(int x){
  for(int i = top-x+1 ; i<=top ;i++)
    arr[i]=arr[i+1];
 }
 void topel(){
  System.out.println(arr[top]);
 }
 void display(){
   System.out.println("stack elements");
  for(int i=top;i>=0;i--){
    System.out.println(arr[i]);
   }
  }
 boolean isEmpty() {
    if (top==-1) {
        return true;
    } else {
        return false;
    }
  }
  boolean isFull() {
    if (top==size-1) {
        return true;
    } else {
        return false;
    }
  }
}
 class Stack{
  
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter stack size");
  int s=sc.nextInt();
  stk s1=new stk(s);
  int n=1;
  while(n==1){
  System.out.print("enter choice\n1.push\n2.pop\n3.display top element\n4.display stack elements\n5.is stack empty\n6. is stack full\n7.remove mth element\n");
  int ch=sc.nextInt();
  switch(ch){
  case 1: System.out.println("enter element to be pushed");
          int el=sc.nextInt();
          s1.push(el);
          break;
  case 2 : s1.pop();
          break;
  case 3: s1.topel();
          break;
  case 4: s1.display();
          break;
  case 5: if(s1.isEmpty()==true)
            System.out.println("stack is empty");
           else
            System.out.println("stack is not empty");
          break;
  case 6: if(s1.isFull()==true)
            System.out.println("stack is full");
           else
            System.out.println("stack is not full");
          break;

  case 7: System.out.println("enter positon");
          int el=sc.nextInt();
         s1.remove(el);
  default: System.out.println("invalid choice");
           break;
  }
  System.out.println("to continue press 1");
   n=sc.nextInt();
  }
 }
}  
  
  
   
  