import java.util.Scanner;

public class CharStackMain {
	
	public static void main(String[] args) {
		CharStack st = new CharStack();
		Scanner s = new Scanner(System.in);
		int ch = 0;
		char data='X';
		do {
			System.out.println("********Stack Operations*******");
			System.out.println("1.PUSH");
			System.out.println("2.POP");
			System.out.println("3.PEEK");
			System.out.println("4.Exit");
			System.out.println("Enter your choice....!");
			ch = s.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter value:");
				data = s.next().charAt(0);
				st.push(data);
				break;
			case 2:
				char status = st.pop();
				if (status == 'X')
					System.out.println("Stack is Underflow");
				else
					System.out.println(status + " popped....!");
				break;
			case 3:
				char peek = st.peek();
				if (peek == 'X')
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

		} while (ch != 4);
	}


}
