import java.util.*;

class mergesort{
 
  
  public  static void msort(int a[],int l,int r){
     
     if(l<r){
       int m=(l+r)/2;
       msort(a,l,m);
       msort(a,m+1,r);
       merge(a,l,m,r);
    }
  }
  public  static void merge(int a[],int l,int m,int r){
    
    int n1=m-l+1;
    int n2=r-m;
    int L[]=new int[n1];
    int R[]=new int[n2];
    for (int i=0; i<n1; ++i) 
       L[i] = a[l + i]; 
    for (int j=0; j<n2; ++j) 
       R[j] = a[m + 1+ j]; 
   int i=0;
   int j=0;
  int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                a[k] = L[i]; 
                i++; 
            } 
            else
            { 
                a[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        
        while (i < n1) 
        { 
            a[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        
        while (j < n2) 
        { 
            a[k] = R[j]; 
            j++; 
            k++; 
        } 
 }
    
     
  public static void main(String args[]){
   
   Scanner sc=new Scanner(System.in);
   System.out.println("enter array size");
   int s=sc.nextInt();
   int arr[]=new int[100];
   System.out.println("enter array elements");
   for(int i=0;i<s;i++){
    arr[i]=sc.nextInt();
   }
  msort(arr,0,s-1);
   System.out.println("sorted array:");
    for(int i=0;i<s;i++){
       System.out.println(arr[i]);
    }
 }
}
      