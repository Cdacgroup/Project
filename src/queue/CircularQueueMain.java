package queue;

import java.util.Scanner;

public class CircularQueueMain {
	
	public static void main(String[] args) {
		CircularQueue q=new CircularQueue();
		Scanner s=new Scanner(System.in);
		int ch=0,data;
		do {
			
			System.out.println("********Circular Queue Operations*******");
			System.out.println("1.INSERT");
			System.out.println("2.REMOVE");
			System.out.println("3.PEEK");
			System.out.println("4.display");
			System.out.println("5.Exit");
			System.out.println("Enter your choice....!");
			ch = s.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter value:");
				data = s.nextInt();
				q.insert(data);
				break;
			case 2:
				int status = q.remove();
				if (status==-999)
					System.out.println("Queue is empty");
				else
					System.out.println(status + " remove....!");
				break;
			/*
			 * case 3: int peek = q.peek(); System.out.println(peek+" peek"); if (peek ==
			 * -999) System.out.println("Queue  is empty"); else
			 * System.out.println("Peek element =" + peek); break;
			 */
			case 4:
				//q.display();
				break;
			default:
				System.out.println("Wrong Choice......!");
				break;
			}
			
		}while(ch!=5);
	}

}
