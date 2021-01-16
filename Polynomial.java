import java.util.*;



class Polynomial

{

	public static void main(String[] args)

	{

		Scanner sc=new Scanner(System.in);
                int ac[]=new int[20];
                int ad[]=new int[20];
                int bd[]=new int[20];
                int bc[]=new int[20];
                int m,n,i;

	 	System.out.println("enter the number of elements in 1st polynomial");
                m=sc.nextInt();
                System.out.println("enter the number of elements in 2nd polynomial");
                n=sc.nextInt();
                for(i=0;i<m;i++){
                 System.out.println("enter the degree and coefficients in polynomial1 ");
                 ad[i]=sc.nextInt();
                 ac[i]=sc.nextInt();
                }
                for(i=0;i<n;i++){
                 System.out.println("enter the degree and coefficients in polynomial2 ");
                 bd[i]=sc.nextInt();
                 bc[i]=sc.nextInt();
                }
                int big=ad[0];
                int small=ad[0];
                for(i=0;i<m;i++){
                  if(big<ad[i])
                    big=ad[i];
                 if(small>ad[i])
                    small=ad[i];
                }
               for(i=0;i<n;i++){
                  if(big<bd[i])
                    big=bd[i];
                 if(small>bd[i])
                    small=bd[i];
                }
              for(int j=big;j>=0;j--){
               int sum=0;
               for(i=0;i<m;i++){
                 if(j==ad[i])
                   sum=ac[i];
              }
              for( i=0;i<n;i++){
                 if(j==bd[i])
                   sum=sum+bc[i];
              }
             if(sum!=0)
             {
               if(small==j)
                System.out.print(sum+"x^"+j);
               else
                System.out.print(sum+"x^"+j+"+");
            }
            }
            }
            }
              


		












