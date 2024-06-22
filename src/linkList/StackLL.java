package linkList;

public class StackLL {
	IntNode top;

	public void setTop(IntNode h) {
		top = h;
	}

	public IntNode getTop() {
		return top;
	}
	
	public void Push(int data) {
		IntNode new_node = new IntNode(data);
		if (top == null) {
			top = new_node;
			return;
		}
		top.setNext(new_node);
		return;
	}
	/*
	 * public int deleteLast() { int d = -999; IntNode deletable; if (top == null)
	 * return d; if(itr.getNext()==null) return deleteFirst(); deletable =
	 * itr.getNext(); d = deletable.getData(); itr.setNext(null); deletable = null;
	 * return d; }
	 */
}
