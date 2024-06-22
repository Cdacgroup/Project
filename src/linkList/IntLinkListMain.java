package linkList;

import java.util.Scanner;

public class IntLinkListMain {
	public static void main(String[] args) {
		IntLinkList l = new IntLinkList();
		Scanner s = new Scanner(System.in);
		int ch = 0, data = 0, pos = 0;
		do {

			System.out.println("********LinkList Operations*******");
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
			System.out.println("11.findMiddle");
			System.out.println("12.reverse");
			System.out.println("13.Count nodes");
			System.out.println("14.reverse Using Recursion");
			System.out.println("16.check Palindrome");
			System.out.println("15.Exit");
			System.out.println("Enter your choice....!");
			ch = s.nextInt();
			if (ch > 0 && ch < 7) {
				System.out.println("Enter value:");
				data = s.nextInt();
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
				int delete = l.deleteFirst();
				if (delete == -999)
					System.out.println("List is Empty");
				else
					System.out.println(delete + " .....deleted!");
				break;
			case 8:
				delete = l.deleteLast();
				if (delete == -999)
					System.out.println("List is Empty");
				else
					System.out.println(delete + " .....deleted!");
				break;
			case 9:
				System.out.println("Enter pos:");
				pos = s.nextInt();
				delete = l.deleteByPos(pos);
				if (delete == -999)
					System.out.println("List is Empty");
				else
					System.out.println(delete + " .....deleted!");
				break;
			case 10:
				System.out.println(l);
				break;
			case 11:
				System.out.println(l);
				System.out.println("\nmiddle node=" + l.findMiddle().getData());
				break;
			case 12:
				l.reverse();
				break;
			case 13:
				System.out.println("no of Nodes =" + l.count());
				break;
			case 14:
				System.out.println(l);
				l.setHead(l.reverseR(l.getHead()));
				System.out.println(l);
				break;
			case 15:

				break;
			case 16:
				if(l.isPalindrome(l.getHead(),l.findMiddle()))
				{
					System.out.println("Palindrome");
					System.out.println(l);
				}
				else {
					System.out.println("Not Palindrom");
					System.out.println(l);
				}
				break;
			default:
				System.out.println("Wrong Choice......!");
				break;
			}

		} while (ch != 15);
	}

}
