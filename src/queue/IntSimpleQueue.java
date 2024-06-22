package queue;

public class IntSimpleQueue {
	private int front,rear;
	private int []arr;
	
	public IntSimpleQueue()
	{
		front =rear=-1;
		arr=new int[3];
	}
	private boolean isEmpty()
	{
		if(front==-1 || front-rear==1)
			return true;
		return false;
	}
	private boolean isFull()
	{
		if(rear==arr.length-1)
			return true;
		return false;
	}
	public void insert(int data)
	{
		if(isFull())
		{
			System.out.println("queue is full");
			return;
		}
		if(front==-1)
			front=0;
		rear=rear+1;
		arr[rear]=data;
		return;
	}
	public int remove()
	{
		int d=-999;
		if(isEmpty())
			return d;
		d=arr[front];
		front=front+1;
		System.out.println(front+" remove");
		return d;
	}
	public int peek()
	{
		int d=-999;
		if(isEmpty())
			return d;
		d=arr[front];
		System.out.println(front+"  front");
		return d;
	}
	public void display()
	{
		for(int i=front;i<arr.length;i++)
		{
			System.out.println(" "+arr[i]);
		}
	}
}

