import java.util.*;
import java.lang.*;
class stk{
 char arr[];
 char item;  
 int size;
 int top=-1;
 stk(int s){
   size=s;
   top=-1;
   arr=new char[size];
 }
 void push(char d){
  if(top==size-1){
    System.out.println("stack overflow");
  }
  else{
   top++;
   item=d;
   arr[top]=item;
  }
 }
 char pop(){
  if(top==-1){
   System.out.println("stack underflow");
  }
  else{
   item=arr[top];
   top--;
  }
  return item;
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
class Reverse{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    StringBuffer str=new StringBuffer();
    System.out.println("enter the string");
    str.append(sc.nextLine());
    int len=str.length();
    char[] str1=new char[len];
    stk s1=new stk(len) ;
    for(int i=0;i<len;i++){
     s1.push(str.charAt(i));
    }
    for(int i=0;i<len;i++){
     char ch=s1.pop();
     str.setCharAt(i,ch);
     }
   System.out.println("reversed string is "+str);
   
   
  }
 }