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

class Test 
{ 
	
	static int Precedence(char ch) 
	{ 
		
		
		if((ch=='+')||(ch=='-'))
			return 1; 
	
		else if((ch=='*')||(ch=='/')) 
			return 2; 
	
		else if(ch=='^') 
			return 3; 
		else
                       return -1; 
	} 

	static String infixToPostfix(String exp) 
	{ 
		 
		String result = new String(""); 
		
		int len=exp.length();
		stk s1 = new stk(len); 
		
		for (int i = 0; i<exp.length(); ++i) 
		{ 
			char c = exp.charAt(i); 
			
			 
			if (Character.isLetterOrDigit(c)) 
				result += c; 
			
			
			else if (c == '(') 
				s1.push(c); 
			
			else if (c == ')') 
			{ 
				while (!s1.isEmpty() && s1.peek() != '(') 
					result += s1.pop(); 
				
				if (!s1.isEmpty() && s1.peek() != '(') 
					return "invalid expression";
                                        				 
				else
					s1.pop(); 
                       
			} 
			else  
			{ 
				while (!s1.isEmpty() && Precedence(c) <= Precedence(s1.peek())){ 
					if(s1.peek() == '(') 
						return "Invalid Expression"; 
					result += s1.pop(); 
			} 
				s1.push(c); 
			} 
	
		} 
	
		
		while (!s1.isEmpty()){ 
			if(s1.peek() == '(') 
				return "Invalid Expression"; 
			result += s1.pop(); 
		} 
		return result; 
	} 
	
	
	public static void main(String[] args) 
	{ 
                Scanner sc=new Scanner(System.in);
                System.out.println("enter a string");
		String exp = new String();
                exp=sc.next();
		System.out.println(infixToPostfix(exp)); 
	} 
} 
