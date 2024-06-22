package recursion;

import java.util.Scanner;

public class Recursion {

	void fun1(int n) {
		System.out.println();
		for (int i = 1; i <= n; i++)
			System.out.print("*");// forward recursive stmt
		if (n < 0)
			return;
		fun1(n - 1);
		System.out.println();
		for (int i = 1; i <= n; i++)
			System.out.print("*");
		// System.out.println("\n"+i+" ");//backword recursive stmt

	}

	public int fact(int n) {
		if (n < 2)
			return 1;
		return n * fact(n - 1);

	}

	
	  public static int count(int n) { if(n<0) return 0;
	return n;
	  
	  }
	  
	 
	public static void main(String[] args) {
		Recursion r = new Recursion();
		Scanner s = new Scanner(System.in);
		// r.fun1(5);
		System.out.println("Enter num ");
		int num = s.nextInt();
		System.out.println("factorial " + r.fact(num));
		 System.out.println("no of digit"+Recursion.count(num));
	}

}
