
public class IntStack {
	private int top;
	private int[] arr;

	public IntStack() {
		top = -1;
		arr = new int[3];
	}

	public IntStack(int size) {
		top = -1;
		arr = new int[size];
	}
	public boolean isEmpty()
	{
		if(top==-1)
		return true;
		else return false;
	}
	public boolean isFull()
	{
		if(top==arr.length-1)
		return true;
		else return false;
	}
	public void push(int data)
	{
		if(isFull())
		{
			System.out.println("stack overflow..!");
			return;
		}
		top++;
		arr[top]=data;
	}
	public int pop()
	{
		int d=-999;
		if(isEmpty())
			return d;
		d=arr[top];
		top--;
		return d;
	}
	public int peek()
	{
		int d=-999;
		if(isEmpty())
			return d;
		d=arr[top];
		return d;
	}

}
