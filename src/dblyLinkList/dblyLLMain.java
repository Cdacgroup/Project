package dblyLinkList;

import java.util.Scanner;

public class dblyLLMain {
	public static void main(String[] args) {
		dblyLinkList l = new dblyLinkList();

		Scanner s = new Scanner(System.in);
		int ch = 0, data = 0, pos = 0, delete = -999;
		do {

			System.out.println("********dblyLinkList Operations*******");
			System.out.println("1.CreateList");
			System.out.println("2.InsertFirst");
			System.out.println("3.InsertLast");
			System.out.println("4.InsertByPosition");
			System.out.println("5.Add To Empty");
			System.out.println("6.DeleteFirst");
			System.out.println("7.DeleteLast");
			System.out.println("8.DeleteByPos");
			System.out.println("9.DeleteBy Address");
			System.out.println("10.display");
			System.out.println("15.Exit");
			System.out.println("Enter your choice....!");
			ch = s.nextInt();
			if (ch > 1 && ch < 6) {
				System.out.println("Enter value:");
				data = s.nextInt();
			}
			switch (ch) {
			case 1:
				System.out.println("Enter no of nodes:");
				pos = s.nextInt();
				l.createList(pos);
				break;
			case 2:
				l.insertFirst(data);
				break;
			case 3:
				l.insertLast(data);
				break;
			case 4:
				System.out.println("Enter pos:");
				pos = s.nextInt();
				l.insertByPos(data, pos);
				break;
			case 5:
				l.addToEmpty(data);
				break;
			case 6:
				 delete=l.deleteFirst();
				if (delete == -999)
					System.out.println("List is Empty");
				else
					System.out.println(delete + " .....deleted!");
				break;
			case 7:
				 delete=l.deleteLast();
				if (delete == -999)
					System.out.println("List is Empty");
				else
					System.out.println(delete + " .....deleted!");
				break;
			case 8:
				System.out.println("Enter pos:");
				pos = s.nextInt();
				 delete=l.deleteByPos(pos);
				if (delete == -999)
					System.out.println("List is Empty");
				else
					System.out.println(delete + " .....deleted!");
				break;
			case 9:
				dblyNode temp=l.getHead();
				for(int i=1;i<2                               ;i++)
					temp=temp.getNext();
				System.out.println(l.deleteByAdd(temp)); 
				break;
			case 10:
				System.out.println(l);
				break;
			case 15:
				break;
			default:
				System.out.println("Wrong Choice......!");
				break;
			}

		} while (ch != 15);

	}

}
