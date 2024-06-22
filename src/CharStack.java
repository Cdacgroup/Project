
public class CharStack {
	private int top;
	private char[] arr;

	public CharStack() {
		top = -1;
		arr = new char[3];
	}

	public CharStack(int size) {
		top = -1;
		arr = new char[size];
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
	public void push(char data)
	{
		if(isFull())
		{
			System.out.println("stack overflow..!");
			return;
		}
		top++;
		arr[top]=data;
	}
	public char pop()
	{
		char d='X';
		if(isEmpty())
			return d;
		d=arr[top];
		top--;
		return d;
	}
	public char peek()
	{
		char d='X';
		if(isEmpty())
			return d;
		d=arr[top];
		return d;
	}

}
