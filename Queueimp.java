import java.util.Scanner;

class Queue {
    private int[] data;
    private int front;
    private int rear;
    private int size;

    // Constructor to initialize the queue with a specific size
    public Queue(int s) {
        size = s;
        data = new int[size];
        front = -1;
        rear = -1;
    }

    // Enqueue an element into the queue
    public void enqueue(int item) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue overflow");
            return;
        }
        if (front == -1) { // First element to enqueue
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % size;
        }
        data[rear] = item;
    }

    // Dequeue an element from the queue
    public void dequeue() {
        if (front == -1) {
            System.out.println("Queue underflow");
            return;
        }
        if (front == rear) { // Last element to dequeue
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    // Display the elements of the queue
    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        while (i != rear) {
            System.out.print(data[i] + " ");
            i = (i + 1) % size;
        }
        System.out.println(data[i]);
    }
}

public class QueueImp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter queue size:");
        int s = sc.nextInt();
        Queue q1 = new Queue(s);
        int n = 1;

        while (n == 1) {
            System.out.println("Enter choice:\n1. Enqueue\n2. Dequeue\n3. Display");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter element to be enqueued:");
                    int el = sc.nextInt();
                    q1.enqueue(el);
                    break;
                case 2:
                    q1.dequeue();
                    break;
                case 3:
                    q1.display();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            System.out.println("\nTo continue press 1, to exit press any other key:");
            n = sc.nextInt();
        }
        sc.close();
    }
}
