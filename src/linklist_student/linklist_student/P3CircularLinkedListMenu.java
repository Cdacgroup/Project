package Short;

import java.util.Scanner;

class Node {
	Pen pen;
	Node next;

	Node(Pen pen) {
		this.pen = pen;
		this.next = null;
	}
}

class CircularLinkedList {
	private Node last;

	public CircularLinkedList() {
		last = null;
	}

	public void insert_first(Pen pen) {
		Node newNode = new Node(pen);
		if (last == null) {
			last = newNode;
			last.next = last;
		} else {
			newNode.next = last.next;
			last.next = newNode;
		}
	}
	public void insert_last(Pen pen) {
		Node newNode = new Node(pen);
		if (last == null) {
			last = newNode;
			last.next = last;
		} else {
			newNode.next = last.next;
			last.next = newNode;
			last = newNode;
		}
	}

	public void delete_by_id(int pen_id) {
		if (last == null) {
			System.out.println("List is empty.");
			return;
		}

		Node current = last.next;
		Node previous = last;

		do {
			if (current.pen.getPen_id() == pen_id) {
				if (current == last.next && current == last) { 
					last = null;
				} else {
					previous.next = current.next;
					if (current == last) {
						last = previous;
					}
				}
				System.out.println("Pen with ID " + pen_id + " deleted.");
				return;
			}
			previous = current;
			current = current.next;
		} while (current != last.next);

		System.out.println("Pen with ID " + pen_id + " not found.");
	}

	public void printLinkedList() {
		if (last == null) {
			System.out.println("List is empty.");
			return;
		}

		Node temp = last.next;
		do {
			System.out.println(temp.pen);
			temp = temp.next;
		} while (temp != last.next);
	}
}

public class PenCircularLinkedListMenu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CircularLinkedList list = new CircularLinkedList();

		while (true) {
			System.out.println("\nMenu:");
			System.out.println("1. Insert First");
			System.out.println("2. Insert Last");
			System.out.println("3. Delete by ID");
			System.out.println("4. Print Linked List");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter Pen ID: ");
				int id1 = scanner.nextInt();
				scanner.nextLine(); // 
				System.out.print("Enter Pen Type: ");
				String type1 = scanner.nextLine();
				System.out.print("Enter Pen Price: ");
				double price1 = scanner.nextDouble();
				list.insert_first(new Pen(id1, type1, price1));
				break;
			case 2:
				System.out.print("Enter Pen ID: ");
				int id2 = scanner.nextInt();
				scanner.nextLine(); 
				System.out.print("Enter Pen Type: ");
				String type2 = scanner.nextLine();
				System.out.print("Enter Pen Price: ");
				double price2 = scanner.nextDouble();
				list.insert_last(new Pen(id2, type2, price2));
				break;
			case 3:
				System.out.print("Enter Pen ID to delete: ");
				int id3 = scanner.nextInt();
				list.delete_by_id(id3);
				break;
			case 4:
				list.printLinkedList();
				break;
			case 5:
				System.out.println("Exiting...");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
