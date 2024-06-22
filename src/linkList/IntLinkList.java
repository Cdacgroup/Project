package linkList;

import linklist_student.StudentNode;

public class IntLinkList {
	IntNode head;

	public IntLinkList() {
		head = null;
	}

	public void setHead(IntNode h) {
		head = h;
	}

	public IntNode getHead() {
		return head;
	}

	public void insertFirst(int data) {
		IntNode new_node = new IntNode(data);
		if (head == null) {
			head = new_node;
			return;
		}
		new_node.setNext(head);
		head = new_node;
	}

	public void insertLast(int data) {
		IntNode new_node = new IntNode(data);
		if (head == null) {
			head = new_node;
			return;
		}
		IntNode itr = head;
		while (itr.getNext() != null) {

			itr = itr.getNext();
		}
		itr.setNext(new_node);
	}

	public void insertByPos(int data, int pos) {
		IntNode new_node = new IntNode(data);
		if (pos == 1) {
			insertFirst(data);
			return;
		}
		if (head == null) {
			head = new_node;
			return;
		}

		IntNode itr = head;
		for (int i = 1; i < pos - 1 && itr.getNext() != null; i++, itr = itr.getNext())
			;
		new_node.setNext(itr.getNext());
		itr.setNext(new_node);
		return;
	}

	public void insertBefore(int data, int before) {
		IntNode new_node = new IntNode(data);
		if (head == null) {
			head = new_node;
			return;
		}
		if (head.getData() == before) {
			new_node.setNext(head);
			head.setNext(new_node);
			return;
		}
		IntNode itr = head;
		while (itr.getNext() != null && before > itr.getNext().getData())
			itr = itr.getNext();
		if (itr.getNext() != null) {
			new_node.setNext(itr.getNext());
			itr.setNext(new_node);
			return;
		} else {
			System.out.println("value not id list");
			return;
		}
	}

	public void insertAfter(int data, int After) {
		IntNode new_node = new IntNode(data);
		if (head == null) {
			head = new_node;
			return;
		}
		if (head.getData() == After) {
			new_node.setNext(head);
			head.setNext(new_node);
			return;
		}
		IntNode itr = head;
		while (itr != null && After > itr.getData())
			itr = itr.getNext();
		if (itr != null) {
			new_node.setNext(itr.getNext());
			itr.setNext(new_node);
			return;
		} else {
			System.out.println("value not id list");
			return;
		}
	}

	public void insertSorted(int data) {
		IntNode new_node = new IntNode(data);
		if (head == null || data < head.getData()) {
			new_node.setNext(head);
			head = new_node;
			return;
		}
		IntNode itr = head;
		while (itr.getNext() != null && data > itr.getNext().getData())
			itr = itr.getNext();
		new_node.setNext(itr.getNext());
		itr.setNext(new_node);
	}

	public int deleteFirst() {
		int d = -999;
		IntNode deletable;
		if (head == null)
			return d;
		d = head.getData();
		deletable = head;
		head = head.getNext();
		deletable = null;
		return d;
	}

	public int deleteLast() {
		int d = -999;
		IntNode deletable;
		if (head == null)
			return d;
		
		IntNode itr = head;
		while (itr.getNext()!= null)
			itr = itr.getNext();
		if(itr.getNext()==null)
			return deleteFirst();
		deletable = itr.getNext();
		d = deletable.getData();
		itr.setNext(null);
		deletable = null;
		return d;
	}

	public int deleteByPos(int pos) {
		int d = -999;
		IntNode deletable;
		if (head == null)
			return d;
		if (pos == 1) {
			return deleteFirst();
		}
		IntNode itr = head;
		for (int i = 1; i < pos - 1 && itr.getNext() != null; i++, itr = itr.getNext())
			;
		if (itr.getNext() != null) {
			d = itr.getNext().getData();
			deletable = itr.getNext();
			itr.setNext(itr.getNext().getNext());
			deletable = null;
			return d;
		} else {
			System.out.println("Invalid position");
			return d;
		}
	}

	public void reverse() {
		if (head == null)
			return;
		System.out.println("\tOrignal List:\n" + this);
		IntNode prev = null, next, itr = head;
		while (itr != null) {
			next = itr.getNext();
			itr.setNext(prev);
			prev = itr;
			itr = next;
		}
		head = prev;
		System.out.println("\tAfter Reverse List:\n" + this);
		return;
	}

	public IntNode findMiddle() {
		IntNode slow = head, fast = head, prev = head;
		if (head == null)
			return null;
		while (fast != null && fast.getNext() != null) {
			prev = slow;
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		// return slow;
		return prev;
	}

	public int count() {
		int i = 0;
		if (head == null)
			return i;

		IntNode itr = head;
		while (itr != null) {
			itr = itr.getNext();
			i++;
		}
		return i;
	}

	public IntNode reverseR(IntNode head) {
		IntNode temp;
		if (head.getNext() == null)
			return head;
		temp = reverseR(head.getNext());
		head.getNext().setNext(head);
		head.setNext(null);
		return temp;
	}

	public boolean isPalindrome(IntNode h1, IntNode temp) {
		IntNode h2, store = null;

		if ((count()) % 2 == 0)
			h2 = reverseR(temp.getNext());
		else
			h2 = reverseR(temp.getNext().getNext());

		// System.out.println(temp.getData()+" temp");
		store = temp.getNext();
		temp.setNext(null);
		IntNode head2 = h2;
		while (h1 != null && h2 != null) {
			//System.out.println(h1.getData() + "  " + h2.getData());
			if (h1.getData() == h2.getData()) {
				h1 = h1.getNext();
				h2 = h2.getNext();

			} else {
				h2 = reverseR(head2);
				temp.setNext(store);

				return false;
			}

		}

		if (h1 == null && h2 == null) {
			h2 = reverseR(head2);
			temp.setNext(store);
			return true;
		}
		return false;
	}

	public String toString() {
		if (head == null)
			return " List is empty";
		String str = "List : ";
		IntNode itr = head;
		while (itr != null) {
			str = str + "->" + itr.getData() + " ";
			itr = itr.getNext();
		}
		return str;
	}

}
