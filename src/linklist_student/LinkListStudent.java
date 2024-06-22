package linklist_student;

import linkList.IntNode;

public class LinkListStudent {
	StudentNode head;

	public LinkListStudent()
	{
		head=null;
	}

	public void insertFirst(Student data) {
		StudentNode new_node = new StudentNode(data);
		if (head == null) {
			head = new_node;
			return;
		}
		new_node.setNext(head);
		head = new_node;
	}
	
	public void insertLast(Student data) {
		StudentNode new_node = new StudentNode(data);
		if (head == null) {
			head = new_node;
			return;
		}
		StudentNode itr = head;
		while (itr.getNext() != null) {

			itr = itr.getNext();
		}
		itr.setNext(new_node);
	}

	public void insertByPos(Student data, int pos) {
		StudentNode new_node = new StudentNode(data);
		if (pos == 1) {
			insertFirst(data);
			return;
		}
		if (head == null) {
			head = new_node;
			return;
		}

		StudentNode itr = head;
		for (int i = 1; i < pos - 1 && itr.getNext() != null; i++, itr = itr.getNext());
		new_node.setNext(itr.getNext());
		itr.setNext(new_node);
		return;
	}
	public void insertBefore(Student data,int before){
		StudentNode new_node = new StudentNode(data);
		if (head == null) {
			head = new_node;
			return;
		}
		if(head.getS().getRoll()==before)
		{
			new_node.setNext(head);
			head.setNext(new_node);
			return;
		}
		StudentNode itr=head;
		while(itr.getNext()!=null && before>itr.getNext().getS().getRoll())
			itr=itr.getNext();
		if(itr.getNext()!=null)
		{
			new_node.setNext(itr.getNext());
			itr.setNext(new_node);
			return;
		}else
		{
			System.out.println("value not id list");
			return;
		}
	}
	
	public void insertAfter(Student data,int After){
		StudentNode new_node = new StudentNode(data);
		if (head == null) {
			head = new_node;
			return;
		}
		if(head.getS().getRoll()==After)
		{
			new_node.setNext(head);
			head.setNext(new_node);
			return;
		}
		StudentNode itr=head;
		while(itr!=null && After>itr.getS().getRoll())
			itr=itr.getNext();
		if(itr!=null)
		{
			new_node.setNext(itr.getNext());
			itr.setNext(new_node);
			return;
		}else
		{
			System.out.println("value not id list");
			return;
		}
	}
	
	public void insertSorted(Student data) {
		StudentNode new_node = new StudentNode(data);
		if (head == null ||(data.getRoll())<(head.getS().getRoll())) {
			new_node.setNext(head);
			head=new_node;
			return;
		}
		StudentNode itr=head;
		while(itr.getNext()!=null && (data.getRoll())>(head.getS().getRoll()))
			itr=itr.getNext();
		new_node.setNext(itr.getNext());
		itr.setNext(new_node);
	}
	
	public Student deleteFirst()
	{
		Student d=null;
		StudentNode deletable;
		if(head==null)
			return d;
		d=head.getS();
		deletable=head;
		head=head.getNext();
		deletable=null;
		return d;
	}
	
	public Student deleteLast()
	{
		Student d=null;
		StudentNode deletable;
		if(head==null)
			return d;
		StudentNode itr =head;
		while(itr.getNext().getNext()!=null)
			itr=itr.getNext();
		deletable=itr.getNext();
		d=deletable.getS();
		itr.setNext(null);
		deletable=null;
		return d;		
	}
	public Student deleteByPos(int pos)
	{
		Student d=null;
		StudentNode deletable;
		if(head==null)
			return d;
		if(pos==1)
		{
			return deleteFirst();
		}
		StudentNode itr =head;
		for(int i=1;i<pos-1 && itr.getNext()!=null;i++,itr=itr.getNext());
		if(itr.getNext()!=null)
		{
		d=itr.getNext().getS();
		deletable=itr.getNext();
		itr.setNext(itr.getNext().getNext());
		deletable=null;
			return d;
		}
		else
			{System.out.println("Invalid position");
			return d;}
	}
	public int count()
	{
		int i=0;
		if(head==null)
			return i;
		
		StudentNode itr=head;
		while(itr!=null)
		{
			itr=itr.getNext();
			i++;
		}
		return i;
	}
	
	public String toString() {
		if (head == null)
			return " List is empty";
		String str = "List : ";
		StudentNode itr = head;
		while (itr != null) {
			str = str + "->" + itr.getS() + " ";
			itr = itr.getNext();
		}
		return str;
	}

}
