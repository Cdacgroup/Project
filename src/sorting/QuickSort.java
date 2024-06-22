package sorting;

public class QuickSort {
	public static void quick_sort(int arr[],int low,int high)
	{
		int p;
		if(low>=high) return;
		p=partition(arr,low,high);
		quick_sort(arr, low, p-1);
		quick_sort(arr, p+1, high);
	}
	public static int partition(int arr[],int low,int high)
	{
		int left,right,pivot,t;
		pivot=arr[low];
		left=low;
		right=high;
		while(left<=high)
		{
			while(arr[left]<=pivot && left<high)
				left++;
			while(arr[right]>pivot)
				right--;
			if(left<right)
			{
				t=arr[left];
				arr[left]=arr[right];
				arr[right]=t;
				left++;
				right--;
				
			}else {left++;}
		}
		arr[low]=arr[right];
		arr[right]=pivot;
		return right;
	}
	public static void main(String[] args) {
		int arr[] = { 60, 90, 40, 70, 50, 10, 80 };
		System.out.println("Orignal list");
		for (int i : arr)
			System.out.print(" " + i);
		quick_sort(arr, 0, arr.length-1);
		System.out.println("\nAfter list");
		for (int i : arr)
			System.out.print(" " + i);
	}
}
