package queue;

public class CircularQueue {

	private int front,rear;
	private int []arr;
	
	public CircularQueue()
	{
		front =rear=-1;
		arr=new int[3];
	}
	private boolean isEmpty()
	{
		if(front==-1)
			return true;
		return false;
	}
	private boolean isFull()
	{
		if(rear==arr.length-1 && front==0 || rear==front-1)
			return true;
		return false;
	}
	public void insert(int data)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
			return;
		}
		if(front==-1)
			front=0;
		if(rear==arr.length-1)
			rear=0;
		else 
			rear++;
		arr[rear]=data;
	}
	public int remove()
	{
		int d=-999;
		if(isEmpty())
			return d;
		d=arr[front];
		if(front==arr.length-1)
			front=0;
		else if(front==rear)
			front=rear=-1;
		else
			front++;
		return d;
		
	}
}
