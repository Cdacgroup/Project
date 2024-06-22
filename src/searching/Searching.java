package searching;

import java.util.Scanner;

public class Searching {
	
	public int lsearch(int arr[],int s)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==s)
			{
				return i;
			}
		}
		return-999;
	}
	public int binarySearch(int arr[],int key)
	{
		int low=0,high=arr.length-1;
		int mid=(low+high)/2; 
		while(arr[mid]!=key)
		{
			if(key<arr[mid])
				high=mid-1;
			else
				low=mid+1;
			mid=(low+high)/2;
		}
		if(arr[mid]==key)
			return mid;
		else
			return -999;	
	}
	
	public static void main(String[] args) {
		Searching obj=new Searching();
		Scanner s=new Scanner(System.in);
		int arr[]= {20,50,60,70,80,660,661,709};
		int ch=0;
		do {
			System.out.println("1.Sequential search");
			System.out.println("2.Binary search");
			System.out.println("enter choice");
			ch=s.nextInt();
			System.out.println("enter element to find");
			int ele=s.nextInt();
			switch(ch)
			{
			case 1:	ele=obj.lsearch(arr, ele); 
				if(ele==-999)
					System.out.println("Element not found");
				else
					System.out.println(arr[ele]+" at position "+(ele+1));
			break;
			case 2:
				ele=obj.binarySearch(arr, ele); 
				if(ele==-999)
					System.out.println("Element not found");
				else
					System.out.println(arr[ele]+" at position "+(ele+1));
				break;
			
			}
			
		}while(ch!=3);
		
	}
}
