import java.util.*;

class binarysearch{
 
  
  
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
   int min=0;
   int max=s-1;
   int temp;
   int mid=min+(max-min)/2;
     for(int i=0;i<s-1;i++){
      
      for(int j=0;j<s-i-1;j++){
        if(arr[j+1]<arr[j]){
      
        temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
      }
     }
   }

    for(int i=min;i<=max;i++){
      mid=min+(max-min)/2;
 
      if(key==arr[mid]){
        found=true;
        pos=mid;
        break;     
      }
     else if(key<arr[mid])
       max=mid-1;
     else if(key>arr[mid])
       min=mid+1;
   }
  
  if(found==true){
   pos=pos+1;
   System.out.println("element found at index "+ pos);
  }
  else
   System.out.println("element not found");
   
   }
  }
      