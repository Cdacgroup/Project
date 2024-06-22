package sorting;

import java.util.Scanner;

public class Sorting1 {

	public static void bubbleSort(int arr[]) {
		int i, j, temp, flag, cnt = 1;
		
		for (i = arr.length - 1; i > 0; i--) {
			flag = 0;
			for (j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}

			}
			if (flag == 0)
				break;
			System.out.println("\n\tpass=" + (cnt++));
			display(arr);
		}
	}

	public static void display(int arr[]) {
		for (int i : arr)
			System.out.print(" " + i);
	}

	public static void selectionSort(int arr[]) {
		int i, j, temp, min, cnt = 1;
		for (i = 0; i < arr.length - 1; i++) {
			min = i;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min])
					min = j;
			}
			if (min != i) {
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
			System.out.println("\n\tpass=" + (cnt++));
			display(arr);
		}
	}

	public static void insertionSort(int arr[]) {
		int i, j, k,cnt=1;
		for (i = 1; i < arr.length; i++) {
			k = arr[i];
			for (j = i - 1; j >= 0 && k < arr[j]; j--)
				arr[j + 1] = arr[j];
				
			System.out.println("\n\tpass=" + (cnt++));
			display(arr);
			arr[j + 1] = k;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = { 60, 90, 40, 70, 50, 10, 80 };
		//int arr1[] = {  40, 70, 80, 90, 100 };
		int ch = 0;
		do {
			System.out.println("\n1.Bubble sort");
			System.out.println("2.Selection sort");
			System.out.println("3.Insertion sort");
			System.out.println("enter choice");
			ch = s.nextInt();
			System.out.println("Orignal list");
			for (int i : arr)
				System.out.print(" " + i);
			switch (ch) {
			case 1:
				bubbleSort(arr);
				System.out.println("\nAfter bubble sort sorting list");
				for (int i : arr)
					System.out.print(" " + i);
				break;
			case 2:

				selectionSort(arr);
				System.out.println("\nAfter selection sort sorting list");
				for (int i : arr)
					System.out.print(" " + i);
				break;
			case 3:

				insertionSort(arr);
				System.out.println("\nAfter insertion sort sorting list");
				for (int i : arr)
					System.out.print(" " + i);
				break;

			}

		} while (ch != 4);
	}
}
