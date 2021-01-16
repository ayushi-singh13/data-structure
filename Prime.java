import java.util.Scanner;

public class Prime
{
   public static void main(String args[])
   {
      int n,count;
      int flag=0;
     
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of n:");
      
      n = sc.nextInt();
     int p=2;
     int i=1; 
    while(i<=n)
    {
        flag=1;
        for(count=2;count<=p-1;count++)
        {
            if(p%count==0)  
            {
             flag=0;
             break;    
            }  
        }
            if(flag==1)
            {
                System.out.println(p) ;
             i++;
            }
        p++;
    } 
    }
}
     

      
            
         
         
         
         
   