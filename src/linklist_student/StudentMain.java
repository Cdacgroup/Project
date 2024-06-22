package linklist_student;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		LinkListStudent l=new LinkListStudent();
		Student data=null;
		Scanner s = new Scanner(System.in);
		int ch = 0, pos = 0;
		do {

			System.out.println("********LinkLIst Student Operations*******");
			System.out.println("1.InsertFirst");
			System.out.println("2.InsertLast");
			System.out.println("3.InsertByPosition");
			System.out.println("4.InsertBefore");
			System.out.println("5.InsertAfter");
			System.out.println("6.InsertSorted");
			System.out.println("7.DeleteFirst");
			System.out.println("8.DeleteLast");
			System.out.println("9.DeleteByPos");
			System.out.println("10.display");
			System.out.println("11.Count Nodes");
			System.out.println("12.Exit");
			System.out.println("Enter your choice....!");
			ch = s.nextInt();
			if (ch > 0 && ch < 7) {
				System.out.println("Enter roll:");
				int roll = s.nextInt();
				System.out.println("Enter name:");
				String name = s.next();
				data=new Student(roll,name);
			}
			switch (ch) {
			case 1:
				l.insertFirst(data);
				break;
			case 2:
				l.insertLast(data);
				break;
			case 3:
				System.out.println("Enter pos:");
				pos = s.nextInt();
				l.insertByPos(data, pos);
				break;
			case 4:
				System.out.println("Enter before:");
				pos = s.nextInt();
				l.insertBefore(data, pos);
				break;
			case 5:
				System.out.println("Enter After:");
				pos = s.nextInt();
				l.insertAfter(data, pos);
				break;
			case 6:
				l.insertSorted(data);
				break;
			case 7:
				Student delete=l.deleteFirst();
				if(delete==null)
					System.out.println("List is Empty");
				else
					System.out.println(delete+" .....deleted!");
				break;
			case 8:
				delete=l.deleteLast();
				if(delete==null)
					System.out.println("List is Empty");
				else
					System.out.println(delete+" .....deleted!");
				break;
			case 9:
				System.out.println("Enter pos:");
				pos = s.nextInt();
				delete=l.deleteByPos(pos);
				if(delete==null)
					System.out.println("List is Empty");
				else
					System.out.println(delete+" .....deleted!");
				break;
			case 10:
				System.out.println(l);
				break;
			case 11:
				System.out.println("no of Nodes in List = "+l.count());
				break;
				
			default:
				System.out.println("Wrong Choice......!");
				break;
			}

		} while (ch != 12);
	}

}
