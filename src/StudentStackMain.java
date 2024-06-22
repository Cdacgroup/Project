import java.util.Scanner;

public class StudentStackMain {
	
	public static void main(String[] args) {
		StudentStack st = new StudentStack();
		Scanner s = new Scanner(System.in);
		int ch = 0, data;
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
				System.out.println("Enter roll:");
				int roll = s.nextInt();
				System.out.println("Enter name");
				String name=s.next();
				//Student s1=new Student(roll,name);
				st.push(new Student(roll,name));
				break;
			case 2:
				Student status = st.pop();
				if (status == null)
					System.out.println("Stack is Underflow");
				else
					System.out.println(status + " popped....!");
				break;
			case 3:
				Student peek = st.peek();
				if (peek == null)
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
