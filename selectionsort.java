import java.util.*;

class selectionsort{
  
  public static void main(String args[]){
  
   Scanner sc=new Scanner(System.in);
   System.out.println("enter array size");
   int s=sc.nextInt();
   int arr[]=new int[100];
  
   System.out.println("enter array elements");
   for(int i=0;i<s;i++){
     arr[i]=sc.nextInt();
   }
    System.out.println("...........Sorting elements.............");
    for(int i=0;i<s-1;i++){
      int min=i;
      for(int j=i+1;j<s;j++)
        if(arr[j]<arr[min])
          min=j;
      
      int temp=arr[min];
      arr[min]=arr[i];
      arr[i]=temp;
     }
   
    System.out.println("sorted elements are:");
    for(int i=0;i<s;i++){
       System.out.println(arr[i]);
    }
   }
  }
      