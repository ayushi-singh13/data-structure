import java.util.*;

class insertionsort{
 
  
  
  public static void main(String args[]){
   int arr[]=new int[100];
   Scanner sc=new Scanner(System.in);
   System.out.println("enter array size");
   int s=sc.nextInt();
   System.out.println("enter array elements");
   for(int i=0;i<s;i++){
    arr[i]=sc.nextInt();
   }
   System.out.println("insertion sort");
     for (int i = 1; i < s; ++i) { 
            int temp = arr[i]; 
            int j = i - 1; 
             while (j >= 0 && arr[j] > temp) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = temp; 
        } 
   
   System.out.println("sorted elements are:");
    for(int i=0;i<s;i++){
       System.out.println(arr[i]);
    }
 }
}
      