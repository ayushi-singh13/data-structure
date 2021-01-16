import java.util.scanner;
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
class SQueue{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the size of queue");
   int size=sc.nextInt();
   int temp;
   if(size%2!=0)
    temp=size+1;
   else
    temp=size;
   t=temp/2
   stk s1=new stk(t);
   stk s2=new stk(t);
   