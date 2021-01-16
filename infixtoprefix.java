
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
  return 0;   
  }
  else{
   item=arr[top];
   top--;
  }
  return item;
 }
 char peek(){
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

public class infixtoprefix {

 
public static String reverseString(String str){  
    char ch[]=str.toCharArray();  
    String rev="";  
    for(int i=ch.length-1;i>=0;i--){  
        rev+=ch[i];  
    }  
    return rev;  
}  

  

 static int priority(char ch) 
	{ 
		
		
		if((ch=='+')||(ch=='-'))
			return 1; 
	
		else if((ch=='*')||(ch=='/')) 
			return 2; 
	
		else if(ch=='^') 
			return 3; 
		
                
                       return -1; 
	} 
 public  static void main(String[] args){
        
  Scanner sc = new Scanner(System.in);
 
  String str=new String();
  str=sc.next();
  String str1=new String();
  str1=reverseString(str);

  String res=new String();
  String res1=new String();
  int len = str1.length();
   stk st = new stk(len);
  for(int i=0;i<len ;i++){
      char ch,y;
      ch=str1.charAt(i);
      if(priority(ch)>0){
          while(!st.isEmpty() && priority(ch)<priority(st.peek())){
              y=st.pop();
              res=res+y;
              
          }
          st.push(ch);
      }      
      else if(ch=='('){
          st.push(ch);
      }
       
      else if(ch==')'){ 
          while(!st.isEmpty() && st.peek()!='('){
              if(st.isEmpty() && st.peek()!='('){
                  res="invalid expression";
                  break;
              }
            y=st.pop();
            res+=y;
          }
       y=st.pop();
       
               
              }      
      else{
          res+=ch;
      }    
}
  
   while(!st.isEmpty()) {
            if(st.peek()=='(')
             res = "invalid expression"; 
            res+= st.pop();
           
        }
   res1=reverseString(res);
   System.out.println(res1);
}
}
    
