import java.util.Scanner;

class DequeueusingArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int front=-1,rear=-1;
		System.out.println(" Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		while(true)
		{
			System.out.println("\nEnter the choice: 1.InsertFirst 2. InsertLast 3. deleteFirst 4. deleteLast 5. Display");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:System.out.println("Enter the element:");
				  int x=sc.nextInt();
				  if(front==-1&& rear==-1)
				  {
				  	front=rear=0;
				  	arr[front]=x;
				  }
				  else if(front==(rear+1)%size)
				  	System.out.println("Dequeue is full.");
				  else if(front==0)
				  {
				  	front=size-1;
				  	arr[front]=x;
				  }
				  else
				  {
				  	front--;
				  	arr[front]=x;
				  }
				  break;

				case 2:
					 System.out.println("enter the element:");
				   	int y=sc.nextInt();
				   	if(front==-1&& rear==-1)
				  	{
				  		front=rear=0;
				  		arr[rear]=y;
				  	}
				  	else if(front==(rear+1)%size)
				  	System.out.println("Dequeue is full.");
				  	else if(rear==size-1)
				  	{
				  		rear=0;
				  		arr[rear]=y;
				  	}
				  	else 
				  	{
				  		rear=rear+1;
				  		arr[rear]=y;
				  	}
				   	break;
				   	
				case 3: 
					if(front==-1&&rear==-1)
						System.out.println("Dequeueis empty");
					else if(front==rear)
						front=rear=-1;
					else if(front==size-1)
						front=0;
					else
						front=front+1;
				   	break;

				case 4: 
					if(front==-1&&rear==-1)
						System.out.println("Dequeue is empty");
					else if(front==rear)
						front=rear=-1;
					else if(rear==0)
						rear=size-1;
					else
				    	rear=rear-1;
				   	break;

				case 5:  int i=front;
					if(i==-1)
						System.out.println("Dequeueis empty.");
					else
					{
						System.out.println("Elements are:");
						while(i!=rear)
						{
							System.out.println(arr[i]+" ");
							i=(i+1)%size;							}
						}
						System.out.print(arr[i]);
			   			break;
						}
			} 	 
	}      
}