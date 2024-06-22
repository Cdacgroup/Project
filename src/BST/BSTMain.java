package BST;

import java.util.Scanner;

public class BSTMain {
	public static void main(String[] args) {
	
		BST b=new BST();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int size=s.nextInt();
		for(int i=1;i<=size;i++)
		{
			System.out.println("Enter value "+i+" node");
			int data=s.nextInt();
			b.insert(data);
		}
		b.inOrder();
		System.out.println("Enter value ");
		int data=s.nextInt();
		b.search(data);
		
		System.out.println("min "+b.min());
		System.out.println("max "+b.max());
	}

}
