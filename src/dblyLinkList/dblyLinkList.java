package dblyLinkList;

import java.util.Scanner;

public class dblyLinkList {
	private dblyNode head;
	private Scanner s = new Scanner(System.in);
	public dblyLinkList() {
	}
	
	public dblyNode getHead() {
		return head;
	}

	public void setHead(dblyNode head) {
		this.head = head;
	}

	public void createList(int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter value "+i+" node...");
			int data=s.nextInt();
			insertLast(data);
		}
	}
	public void addToEmpty(int data)
	{
		if(head==null)
		{
			insertFirst(data);
			return;
		}
	}
	public void insertFirst(int data) {
		dblyNode new_node = new dblyNode(data);
		if (head == null) {
			head = new_node;
			return;
		}
		head.setPrev(new_node);
		new_node.setNext(head);
		head = new_node;
		return;
	}

	public void insertLast(int data) {
		dblyNode new_node = new dblyNode(data);
		if (head == null) {
			head = new_node;
			return;
		}
		dblyNode itr = head;
		while (itr.getNext() != null)
			itr = itr.getNext();
		itr.setNext(new_node);
		new_node.setPrev(itr);
		return;
	}

	public void insertByPos(int data, int pos) {
		dblyNode new_node = new dblyNode(data);
		if (head == null) {
			head = new_node;
			return;
		}
		if (pos == 1) {
			insertFirst(data);
			return;
		}
		int i;
		dblyNode itr = head;
		for (i = 1; i < pos - 1; i++) {
			itr = itr.getNext();
			if (itr == null)
				return;
		}
		new_node.setPrev(itr);
		new_node.setNext(itr.getNext());
		itr.setNext(new_node);
		return;
	}
	public int deleteFirst()
	{
		int d=-999;
		dblyNode deletable;
		if(head==null)
			return d;
		deletable=head;
		d=deletable.getData();
		head=head.getNext();
		head.setPrev(null);
		deletable=null;
		return d;
	}
	public int deleteLast()
	{
		int d=-999;
		dblyNode deletable;
		if(head==null)
			return d;
		deletable=head;
		while(deletable.getNext()!=null)
			deletable=deletable.getNext();
		d=deletable.getData();
		deletable.getPrev().setNext(null);
		deletable=null;
		return d;
		
	}
	public int deleteByPos(int pos)
	{
		int d=-999;
		dblyNode deletable;
		if(head==null)
			return d;
		if(pos==1)
			return deleteFirst();
		int i;
		dblyNode itr=head;
		for(i=1;i<pos;i++)
		{
			itr=itr.getNext();
			if(itr==null)return d;
		}
		itr.getPrev().setNext(itr.getNext());
		if(itr.getNext()!=null)
		itr.getNext().setPrev(itr.getPrev());
		d=itr.getData();
		itr=null;
		return d;
	}
	public int deleteByAdd(dblyNode itr)
	{
		int d;
		itr.getPrev().setNext(itr.getNext());
		if(itr.getNext()!=null)
		itr.getNext().setPrev(itr.getPrev());
		d=itr.getData();
		itr=null;
		return d;
		
	}
	public String toString() {
		String str = "List ";
		dblyNode itr = head;
		while (itr != null) {
			str = str + "->" + itr.getData() + " ";
			itr = itr.getNext();
		}
		return str;
	}
}
