import java.util.Scanner;
 
public class Matrix
{
    
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows and columns in matrix1 and matrix2");
        
       int r1=sc.nextInt();
       int c1=sc.nextInt();
       int r2=sc.nextInt();
       int c2=sc.nextInt();
        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];
        int[][] c = new int[r1][c2];
        System.out.println("Enter the elements of 1st martix row wise \n");
        for (int i = 0; i < r1; i++)
        {
            for (int j = 0; j < c1; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of 2nd martix row wise \n");
        for (int i = 0; i < r2; i++)
        {
            for (int j = 0; j < c2; j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
        if(r2==c1)
        {
         System.out.println("Multiplying the matrices...");
          for (int i = 0; i < r1; i++)
          {
             for (int j = 0; j < c2; j++)
             {
                for (int k = 0; k < r2; k++)
                {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
              }
           }
           System.out.println("The product is:");
          for (int i = 0; i < r1; i++)
          {
            for (int j = 0; j < c2; j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
         }
        } 
         else
             System.out.println("multiplication not possible");      
    }
}