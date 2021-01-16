import java.util.*;

class linearsearch{
 
  
  
  public static void main(String args[]){
   int arr[]=new int[100];
   Scanner sc=new Scanner(System.in);
   System.out.println("enter array size");
   int s=sc.nextInt();
   System.out.println("enter array elements");
   for(int i=0;i<s;i++){
    arr[i]=sc.nextInt();
   }
   System.out.println("enter element to be searched");
   int key=sc.nextInt();
   boolean found=false;
   int pos=0;
   for(int i=0;i<s;i++){
     
      if(arr[i]==key){
       found=true;
        pos=i+1;
       break;
      
      }
     }
  if(found==true)
   System.out.println("element found at "+ pos +" index");
  else
   System.out.println("element not found");
   
   }
  }
      