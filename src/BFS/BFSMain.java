package BFS;

import java.util.Scanner;

public class BFSMain {
	public static void main(String[] args) {
		BSF_levelWise b=new BSF_levelWise();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int size=s.nextInt();
		for(int i=1;i<=size;i++)
		{
			System.out.println("Enter value "+i+" node");
			int data=s.nextInt();
			b.insert(data);
		}
		b.traverse();
		System.out.println("\nLeaf nodes");
		b.leafNode();
		b.minMax();
		
		//System.out.println("\n\tSwap");
		//b.swap(b.getRoot());
		b.traverse();
		System.out.println("\n\tMirror image");
		b.miror_image();
		b.traverse();
		System.out.println("level= "+b.levelCount());
	}

}
