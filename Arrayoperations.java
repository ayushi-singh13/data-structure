Import java.util.Scanner;
Public class ArrayOperation
{
	Public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Intloc,val,pos,m;

		Functions f=new functions();
		Int array[]=new int[100];
		Int array1[]=new int[100];
		Int array2[]=new int[100];
		Int n;
		System.out.println(“Enter the no elements to be inserted”);
		N=sc.nextInt();
		For(inti=0;i<n;i++)
		{
			Array[i]=sc.nextInt();
		}
Int choice=0;
		Do{
			System.out.print(“press \n 1.display \n 2.insert \n 3.Delete  \n 4.Merge”);
		 Choice=sc.nextInt();
		Switch(choice)
		{
			Case 1: f.display(array,n);
			Break;
			Case 2: {System.out.println(“Enter Location and value to be inserted”);
			Loc=sc.nextInt();
			Val=sc.nextInt();
			f.insert(array,n,loc,val);
			n++;
			f.display(array,n);
			break;}
			case 3: {
				System.out.println(“Enter The position to be deleted”);
				Pos=sc.nextInt();
				f.delete(array,n,pos);
				n--;
				f.display(array,n);
				break;
			}
			Case 4:{
				System.out.println(“Enter the no elements to be inserted”);
		M=sc.nextInt();
		For(inti=0;i<m;i++)
		{
			Array1[i]=sc.nextInt();
		}
				System.out.println(“Merged arrays are”);
				Inttotalsize=m+n;
				f.merge(array,array1,array2,n,m);
				f.display(array2,totalsize);
				}
			Default:
		}
	}
	While(choice<5);	
	}
}
Class functions
{
	Public void insert(intarr[],intsize,intlocation,int value)
	{
		//System.out.println(“Please enter the elements to be inserted”);
		For(int i=size;i>=location-1;i--)
		{
			Arr[i+1]=arr[i];
		}
		//size++;
		Arr[location-1]=value;
	}

	Public void delete(intarr[],intsize,int location2)
	{
//out.println(“Enter the element position to be deleted”);
		For(int i=location2-1;i<size;i++)
		{
			Arr[i]=arr[i+1];
		}
		//size--;
	}

	Public void display(intarr[],int size)
	{
		//System.out.println(“Array Elements are”);
		For(inti=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}
	Public void merge(int arr1[],int arr2[],int arr3[],int size1,int size2)
	{	inti,j,p;
		For(i=0;i<size1;i++)
		{
			Arr3[i]=arr1[i];
		}
		P=i;

		For(j=0,i=p;j<size2 &&i<size1+size2 ;i++,j++)
		{
			Arr3[i]=arr2[j];
		}
	}
}