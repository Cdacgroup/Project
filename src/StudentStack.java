
public class StudentStack {
	
	private int top;
	private Student[] arr;

	public StudentStack() {
		top = -1;
		arr = new Student[3];
	}

	public StudentStack(int size) {
		top = -1;
		arr = new Student[size];
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
	public void push(Student data)
	{
		if(isFull())
		{
			System.out.println("stack overflow..!");
			return;
		}
		top++;
		arr[top]=data;
	}
	public Student pop()
	{
		Student d=null;
		if(isEmpty())
			return d;
		d=arr[top];
		top--;
		return d;
	}
	public Student peek()
	{
		Student d=null;
		if(isEmpty())
			return d;
		d=arr[top];
		return d;
	}

}
