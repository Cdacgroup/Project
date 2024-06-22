package sorting;

public class Merge {

	public static void merge_ver1(int arr1[],int arr2[],int tar[])
	{
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				tar[k]=arr1[i];
				k++;
				i++;
			}
			else if(arr1[i]>arr2[j])
			{
				tar[k]=arr2[j];
				k++;
				j++;
			}
			else {
				tar[k]=arr1[i];
				k++;
				i++;
				j++;
			}
		}
		while(i<arr1.length)
		{
			tar[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length)
		{
			tar[k]=arr2[j];
			j++;
			k++;
		}	
	}
	
	public static void merge_ver2(int arr1[],int tar[],int low1,int high1,int low2,int high2)
	{
		int i=low1,j=low2,k=low1;
		while(i<=high1 && j<=high2)
		{
			if(arr1[i]<arr1[j])
			{
				tar[k]=arr1[i];
				k++;
				i++;
			}
			else if(arr1[i]>arr1[j])
			{
				tar[k]=arr1[j];
				k++;
				j++;
			}
			else {
				tar[k]=arr1[i];
				k++;
				i++;
				j++;
			}
		}
		while(i<=high1)
		{
			tar[k]=arr1[i];
			i++;
			k++;
		}
		while(j<=high2)
		{
			tar[k]=arr1[j];
			j++;
			k++;
		}	
	}
	public static void copy(int arr[],int temp[],int low,int high)
	{
		for(int i=low;i<=high;i++)
			arr[i]=temp[i];
	}
	
	public static void merge_sort(int arr[],int low,int high)
	{
		int mid;
		int temp[]=new int[arr.length];
		if(low>=high)return;                                                    
		mid=(low+high)/2;
		merge_sort(arr,low,mid); 
		merge_sort(arr,mid+1,high);
		merge_ver2(arr, temp, low,mid, mid+1, high);
		copy(arr,temp,low,high);
	}
	public static void display(int arr[])
	{
		for(int i:arr)
			System.out.print(" "+i);
	}
}
