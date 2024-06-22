package BST;

import java.util.Scanner;

public class BST_recMain {
	public static void main(String[] args) {
		BST_rec b=new BST_rec();
		Scanner s=new Scanner(System.in);
		int data,ch=0,pos=0;
		do {
			System.out.println("\n********BST**********");
			System.out.println("1.create BST List ");
			System.out.println("2.insert");
			System.out.println("3.preOrder");
			System.out.println("4.inOrder");
			System.out.println("5.postOrder");
			System.out.println("6.Search");
			System.out.println("7.MIN");
			System.out.println("8.MAX");
			System.out.println("9.Delete");
			System.out.println("Enter choice");
			ch=s.nextInt();
			switch(ch)
			{
			case 1: 
				System.out.println("Enter size");
				int size=s.nextInt();
				for(int i=1;i<=size;i++)
				{
					System.out.println("Enter value "+i+" node");
					 data=s.nextInt();
					//b.insert(data);
				}
				break;
			case 2: 
				System.out.println("Enter value");
				 data=s.nextInt();
				 //b.insert(data);
				break;
			case 3: 
			//	System.out.println("\tPreOrdede:");  b.preOrder();
				break;
			case 4: 
			//	System.out.println("\n\tINOrdede:");  b.inOrder();
				break;
			case 5: 
				//System.out.println("\n\tPostOrdede:");  b.postOrder();
				break;
			case 6: 
				System.out.println("Enter value");
				 data=s.nextInt(); 
				 //b.search(data);
				break;
			//case 7:System.out.println("min="+b.min()); break;
			//case 8:System.out.println("max="+b.max()); break;
			case 9: System.out.println("Enter value");
			 data=s.nextInt();
			// b.delete(data);
			 break;
			}
		}while(ch!=11);
		
		  
		 	}

}
