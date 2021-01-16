import java.util.*;

class bubblesort{
  
  public static void main(String args[]){
  
   Scanner sc=new Scanner(System.in);
   System.out.println("enter array size");
   int s=sc.nextInt();
   int arr[]=new int[100];
   int temp;
   System.out.println("enter array elements");
   for(int i=0;i<s;i++){
     arr[i]=sc.nextInt();
   }
    System.out.println("...........Sorting elements.............");
    for(int i=0;i<s-1;i++){
      
      for(int j=0;j<s-i-1;j++){
        if(arr[j+1]<arr[j]){
      
        temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
      }
     }
   }
   
    System.out.println("sorted elements are:");
    for(int i=0;i<s;i++){
       System.out.println(arr[i]);
    }
   }
  }
      