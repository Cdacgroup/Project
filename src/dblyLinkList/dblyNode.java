package dblyLinkList;

public class dblyNode {
	private int data;
	private dblyNode prev,next;
	
	public dblyNode() {}
	public dblyNode(int d)
	{
		data=d;
		prev=next=null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public dblyNode getPrev() {
		return prev;
	}
	public void setPrev(dblyNode prev) {
		this.prev = prev;
	}
	public dblyNode getNext() {
		return next;
	}
	public void setNext(dblyNode next) {
		this.next = next;
	}

	
}
