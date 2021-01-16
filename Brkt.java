//checks if given string has balanced brackets using stack

import java.util.*;
class stk{
 char arr[]=new char[100];
 char item;  
 int size;
 int top=-1;
 stk(int s){
   size=s;
   top=-1;
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
   return 0;
  }
  else{
   item=arr[top];
   top--;
   return item;
  }
 }
 char topel(){
  return arr[top];
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

class Brkt{
  public static boolean Match(char c,char d){
        if (c == '[' && d == ']')
            return true;
        if (c == '{' && d == '}')
            return true;
        if (c == '(' && d == ')')
            return true;
        return false;
    }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter string");
    String str=new String();
    str=sc.next();
    int len=str.length();
     stk s1=new stk(len);
     
    for(int i=0;i<len;i++){
      char next=str.charAt(i);
      if(next=='(' || next=='[' || next=='{')
          s1.push(next);
      if(next==')' || next=='}' || next==']')
       {
          if(s1.isEmpty()==true){
             System.out.println(i+1);
             break;
           }
       char cr=s1.pop();
          if(Match(cr,next)==false){
             System.out.println(i+1);
             break;
           }
          
        }
     }
   if(s1.isEmpty()==true){
     System.out.println("success");
   }
  else
   System.out.println("false");
  
}
}
            
          
         
     
