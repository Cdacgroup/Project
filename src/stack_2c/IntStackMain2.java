package stack_2c;
import java.util.Scanner;

public class IntStackMain2 {

	public static void main(String[] args) {
		IntStack2 st = new IntStack2();
		Scanner s = new Scanner(System.in);
		int ch1 = 0,ch2=0, data;
		do {
			
			System.out.println("1.StackA ");
			System.out.println("2.StackB ");
			System.out.println("3.exit");
			System.out.println("Enter your choice");
			ch1=s.nextInt();
			if(ch1==1) {
				do {
					System.out.println("********Stack Operations*******");
					System.out.println("1.PUSH");
					System.out.println("2.POP");
					System.out.println("3.PEEK");
					System.out.println("4.Exit");
					System.out.println("Enter your choice....!");
					ch2 = s.nextInt();
					switch (ch2) {
					case 1:
						System.out.println("Enter value:");
						data = s.nextInt();
						st.pushA(data);
						break;
					case 2:
						int status = st.popA();
						if (status == -999)
							System.out.println("Stack is Underflow");
						else
							System.out.println(status + " popped....!");
						break;
					case 3:
						int peek = st.peekA();
						if (peek == -999)
							System.out.println("Stack is empty");
						else
							System.out.println("Peek element =" + peek);
						break;
					case 4:
						break;
					default:
						System.out.println("Wrong Choice......!");
						break;
					}

				} while (ch2!= 4);
				
			}else
			{
				do {
					System.out.println("********Stack Operations*******");
					System.out.println("1.PUSH");
					System.out.println("2.POP");
					System.out.println("3.PEEK");
					System.out.println("4.Exit");
					System.out.println("Enter your choice....!");
					ch2 = s.nextInt();
					switch (ch2) {
					case 1:
						System.out.println("Enter value:");
						data = s.nextInt();
						st.pushB(data);
						break;
					case 2:
						int status = st.popB();
						if (status == -999)
							System.out.println("Stack is Underflow");
						else
							System.out.println(status + " popped....!");
						break;
					case 3:
						int peek = st.peekB();
						if (peek == -999)
							System.out.println("Stack is empty");
						else
							System.out.println("Peek element =" + peek);
						break;
					case 4:
						break;
					default:
						System.out.println("Wrong Choice......!");
						break;
					}

				} while (ch2!= 4);
			}
		}while(ch1!=3);
	}

}
