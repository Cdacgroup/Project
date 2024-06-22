package sorting;

public class SortBySalary {
	
	public static void bubble_sort(Employee []emp)
	{
		int i,j,flag;
		double sal;
		for(i=emp.length-1;i>0;i--)
		{
			flag=0;
			for(j=0;j<i;j++)
			{
				if(emp[j].getSalary()>emp[j+1].getSalary())
				{
					sal=emp[j].getSalary();
					emp[j].setSalary(emp[j+1].getSalary());
					emp[j+1].setSalary(sal);
					flag=1;
				}
			}
			if(flag==0)
				break;
		}
	}
	public static void main(String[] args) {
		Employee e[]=new Employee[6];
		e[0]=new Employee(1,"anil",60.00);
		e[1]=new Employee(1,"anil",90.00);
		e[2]=new Employee(1,"anil",40.00);
		e[3]=new Employee(1,"anil",70.00);
		e[4]=new Employee(1,"anil",50.00);
		e[5]=new Employee(1,"anil",10.00);
		System.out.println("orignal list");
		for(Employee ee:e)
			System.out.println(ee);
		System.out.println("Sorted list");
		bubble_sort(e);
		for(Employee ee:e)
			System.out.println(ee);
	}

}
