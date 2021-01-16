import java.util.*;

class mergesort{
 
  
 void partition(int arr[], int l, int r) 
    {  if (l < r) 
        { 
        int p = arr[r];  
        int i = (l-1); 
        for (int j=l; j<r; j++) 
        { 
            
            if (arr[j] < p) 
            { 
                i++; 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
       
        int temp = arr[i+1]; 
        arr[i+1] = arr[r]; 
        arr[r] = temp;
            sort(arr, l, p-1); 
            sort(arr, p+1, r); 
        } 
    } 
    
     
  public static void main(String args[]){
   
   Scanner sc=new Scanner(System.in);
   System.out.println("enter array size");
   int s=sc.nextInt();
   int arr[]=new int[s];
   System.out.println("enter array elements");
   for(int i=0;i<s;i++){
    arr[i]=sc.nextInt();
   }
  
   System.out.println("sorted elements are:");
    for(int i=0;i<s;i++){
       System.out.println(arr[i]);
    }
 }
}
      