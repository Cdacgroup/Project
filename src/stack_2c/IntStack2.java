
package stack_2c;

public class IntStack2 {
	private int topA;
	private int topB;
	private int[] arr;

	public IntStack2() {
		topA = -1;
		topB = 5;
		arr = new int[5];

	}

	public boolean isFull() {
		if ((topB - topA) == 1)
			return true;
		else
			return false;
	}

	public boolean isEmptyA() {
		if (topA == -1)
			return true;
		else
			return false;
	}

	public boolean isEmptyB() {
		if (topB == 5)
			return true;
		else
			return false;
	}
	public void pushA(int data)
	{
		if(isFull())
		{
			System.out.println("Stack is full");
			return;
		}
		topA++;
		arr[topA]=data;
	}
	public void pushB(int data)
	{
		if(isFull())
		{
			System.out.println("Stack is full");
			return;
		}
		topB--;
		arr[topB]=data;
	}
	public int popA()
	{
		int d=-999;
		if(isEmptyA())
			return d;
		d=arr[topA];
		topA--;
		return d;
	}
	public int popB()
	{
		int d=-999;
		if(isEmptyB())
			return d;
		d=arr[topB];
		topB++;
		return d;
	}
	public int peekA()
	{
		int d=-999;
		if(isEmptyA())
			return d;
		d=arr[topA];
		return d;
	}
	public int peekB()
	{
		int d=-999;
		if(isEmptyB())
			return d;
		d=arr[topB];
		return d;
	}
}
