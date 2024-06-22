package linkList;

public class CircularLLMain {
	public static void main(String[] args) {
		CircularLL l=new CircularLL();
		l.insertFirst(10);
		l.insertLast(20);
		//l.insertLast(30);
		
		System.out.println(l);
		System.out.println(l.deleteLast());
		//l.deleteLast();
		System.out.println(l);
		
	}

}
