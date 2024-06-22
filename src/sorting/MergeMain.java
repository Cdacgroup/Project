package sorting;

public class MergeMain {
	public static void main(String[] args) {

		/*
		 * int arr1[] = { 10, 50, 70, 90 }; int arr2[] = { 20, 30, 40, 60, 70, 100 };
		 * int size = arr1.length + arr2.length; int tar[] = new int[size];
		 * System.out.println("arr1"); Merge.display(arr1);
		 * System.out.println("\narr2"); Merge.display(arr2);
		 * System.out.println("\ntar"); Merge.display(tar); Merge.merge_ver1(arr1, arr2,
		 * tar); System.out.println("\ntar"); Merge.display(tar);
		 */

	/*	int arr[] = { 10, 30, 40, 50, 60, 20, 40, 70, 90, 100 };
		int tar1[] = new int[arr.length];
		System.out.println("arr");
		Merge.display(arr);
		Merge.merge_ver2(arr, tar1, 0, 5, 5, arr.length);
		System.out.println("\ntar");
		Merge.display(tar1);
		*/
		int arr[] = { 50,40,80,10,90,60 };
		Merge.display(arr);
		System.out.println("\nsorting");
		Merge.merge_sort(arr, 0, arr.length-1);
		Merge.display(arr);
		
	}

}
