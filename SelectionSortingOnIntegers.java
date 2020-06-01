//package com.umar.sorting;
import java.util.InputMismatchException;
//selection sort class
class SelectionSorting{
	private void integerSorting_actual(int arrayInt[]) {
		int minIndex = 0, temp = 0;
		if(arrayInt.length<1) {

		}
		else {
			for(int i=0; i<arrayInt.length; i++) {
				minIndex = i;
				for(int j = i+1; j<arrayInt.length; j++) {
					if(arrayInt[j] < arrayInt[minIndex]) 
						minIndex = j;
				}
				temp = arrayInt[i];
				arrayInt[i] = arrayInt[minIndex];
				arrayInt[minIndex] = temp;
			}
		System.out.print("\t");
		for(int i=0; i<arrayInt.length; i++) {
			System.out.print(arrayInt[i]);
			if(i==(arrayInt.length-1))
				break;
			System.out.print(", ");
		}
		}
		System.out.println();
	}
	public void integerSorting(int arrayInt[]) {
		integerSorting_actual(arrayInt);
	}
	//string
	private void stringSorting_actual(String arrayStr[]) {
		int minIndex = 0;
		String temp = null;
		if(arrayStr.length<1) {

		}
		else {
			for(int i=0; i<arrayStr.length; i++) {
				minIndex = i;
				for(int j = i+1; j<arrayStr.length; j++) {
					if(arrayStr[j].compareTo(arrayStr[minIndex]) < 0) 
						minIndex = j;
				}
				temp = arrayStr[i];
				arrayStr[i] = arrayStr[minIndex];
				arrayStr[minIndex] = temp;
			}
		System.out.print("\t");
		for(int i=0; i<arrayStr.length; i++) {
			System.out.print(arrayStr[i]);
			if(i==(arrayStr.length-1))
				break;
			System.out.print(", ");
		}
		System.out.println();
		}
	}
	public void stringSorting(String arrayStr[]) {
		stringSorting_actual(arrayStr);
	}
}

//Insertion Sort
class InsertionSorting{
	private void integerSorting_actual(int arrayInt[]) {
		int j, temp;
		if(arrayInt.length<1) {

		}
		else {
			for(int i=1; i<arrayInt.length; i++) {
				temp = arrayInt[i];
				j = i;
				while(j>0 && (arrayInt[j-1]>temp)) {
					arrayInt[j] = arrayInt[j-1];
					j = j-1;
				}
				arrayInt[j] = temp;
			}
		System.out.print("\t");
		for(int i=0; i<arrayInt.length; i++) {
			System.out.print(arrayInt[i]);
			if(i==(arrayInt.length-1))
				break;
			System.out.print(", ");
		}
		}
		System.out.println();
	}
	public void integerSorting(int arrayInt[]) {
		integerSorting_actual(arrayInt);
	}
	//string
	private void stringSorting_actual(String arrayStr[]) {
		int j;
		String temp = null;
		if(arrayStr.length<1) {

		}
		else {
			for(int i=1; i<arrayStr.length; i++) {
				temp = arrayStr[i];
				j = i;
				while(j>0 && (arrayStr[j-1].compareTo(temp) > 0)) {
					arrayStr[j] = arrayStr[j-1];
					j--;
				}
				arrayStr[j] = temp;
			}
		System.out.print("\t");
		for(int i=0; i<arrayStr.length; i++) {
			System.out.print(arrayStr[i]);
			if(i==(arrayStr.length-1))
				break;
			System.out.print(", ");
		}
		System.out.println();
		}
	}
	public void stringSorting(String arrayStr[]) {
		stringSorting_actual(arrayStr);
	}
}

//merge sort 
class MergeSort {
	private int length, ii = 0;
	private int tempMerge[] = null;
	private int arrayInt[] = null;
	private String arrayStr[] = null;
	private String strMerge[] = null;
	private void integerSorting_actual(int arrayInt[]) {
		this.arrayInt = arrayInt;
		if(arrayInt.length<1) {

		}
		else {
			//start sorting
			this.length = arrayInt.length;
			tempMerge = new int[length];
			this.divideArray(0, length-1);
			//display sorted integers
		System.out.print("\t");
		ii = 0;
		for(int i : arrayInt) {
			if(ii==0) {
				System.out.print(i);
				ii++;
				continue;
			}
			System.out.print(", "+i);
		}
		}
		System.out.println();
	}
	private void divideArray(int lowerindex, int higherindex) {
		if(lowerindex < higherindex) {
			int middle = lowerindex+(higherindex-lowerindex)/2;
			divideArray(lowerindex, middle);
			divideArray(middle+1, higherindex);
			mergeArray(lowerindex, middle, higherindex);
		}
	}
	private void mergeArray(int lowerindex, int middle, int higherindex) {
		for(int i=lowerindex; i<=higherindex; i++)
			tempMerge[i] = arrayInt[i];
		int i = lowerindex;
		int j = middle+1;
		int k = lowerindex;
		while(i<=middle && j<=higherindex) {
			if(tempMerge[i]<=tempMerge[j]) {
				arrayInt[k] = tempMerge[i];
				i++;
			}
			else{
				arrayInt[k] = tempMerge[j];
				j++; 
			}
			k++;
		}
		while(i<=middle) { //when previous while loop not execute.
			arrayInt[k] = tempMerge[i];
			k++;
			i++;
		}
	}

	public void integerSorting(int arrayInt[]) {
		integerSorting_actual(arrayInt);
	}
	//string
	private void stringSorting_actual(String arrayStr[]) {
		
		if(arrayStr.length<1) {

		}
		else {
			//sorting start
			this.arrayStr = arrayStr;
			this.length = arrayStr.length;
			strMerge = new String[length];
			divideStringArray(0, length-1);	
			//display sorted strings
		System.out.print("\t");
		ii = 0;
		for(String str : arrayStr) {
			if(ii==0) {
				System.out.print(str);
				ii++;
				continue;	
			}
			System.out.print(", "+str);
		}
		System.out.println();
		}
	}
	private void divideStringArray(int lowerindex, int higherindex) {
		if(lowerindex<higherindex) {
			int middle = lowerindex+(higherindex-lowerindex)/2;
			divideStringArray(lowerindex, middle);
			divideStringArray(middle+1, higherindex);
			mergeStringArray(lowerindex, middle, higherindex);
		}
	}
	private void mergeStringArray(int lowerindex, int middle, int higherindex) {
		for(int i = lowerindex; i<=higherindex; i++) 
			strMerge[i] = arrayStr[i];
		int i = lowerindex;
		int k = lowerindex;
		int j = middle+1;
		while(i<=middle && j<=higherindex) {
			if(strMerge[i].compareTo(strMerge[j]) <= 0) {
				arrayStr[k] = strMerge[i];
				i++;
			}
			else{
				arrayStr[k] = strMerge[j];
				j++;
			}
			k++;
		}
		while(i<=middle) {
			arrayStr[k] = strMerge[i];
			i++;
			k++;
		}
	}
	public void stringSorting(String arrayStr[]) {
		stringSorting_actual(arrayStr);
	}
}

//Quick sort
class QuickSort {
	private int length, ii;
	private int arrayInt[] = null;
	private String arrayStr[] = null;
	private void integerSorting_actual(int arrayInt[]) {
		this.arrayInt = arrayInt;
		if(arrayInt.length<1) {

		}
		else {
			//start sorting
			this.length = arrayInt.length;
			quickSortArray(arrayInt, 0, length-1);
			//display sorted integers
		System.out.print("\t");
		ii = 0;
		for(int i : arrayInt) {
			if(ii==0) {
				System.out.print(i);
				ii++;
				continue;
			}
			System.out.print(", "+i);
		}
		}
		System.out.println();
	}
	private int partition(int arrayInt[], int low, int high) {
		int pivot = arrayInt[(low+high)/2];
		while(low<=high) {
			while(arrayInt[low] < pivot) {
				low++;
			}
			while(arrayInt[high] > pivot) {
				high--;
			}
			if(low<=high) {
				int temp = arrayInt[low];
				arrayInt[low] = arrayInt[high];
				arrayInt[high] = temp;

				low++;
				high--;
			}
		}
		return low;
	}
	private void quickSortArray(int arrayInt[], int low, int high) {
		int pi = partition(arrayInt, low, high);
		if(low < pi-1) {
			quickSortArray(arrayInt, low, pi-1);
		}
		if(pi < high) {
			quickSortArray(arrayInt, pi, high);
		}
	}

	public void integerSorting(int arrayInt[]) {
		integerSorting_actual(arrayInt);
	}
	//string
	private void stringSorting_actual(String arrayStr[]) {
		this.arrayStr = arrayStr;
		if(arrayStr.length<1) {

		}
		else {
			//start sorting
			this.length = arrayStr.length;
			quickSortArray(arrayStr, 0, length-1);
			//display sorted integers
		System.out.print("\t");
		ii = 0;
		for(String i : arrayStr) {
			if(ii==0) {
				System.out.print(i);
				ii++;
				continue;
			}
			System.out.print(", "+i);
		}
		}
		System.out.println();
	}
	private int partition(String arrayStr[], int low, int high) {
		String pivot = arrayStr[(low+high)/2];
		while(low<=high) {
			while(arrayStr[low].compareTo(pivot) < 0) {
				low++;
			}
			while(arrayStr[high].compareTo(pivot) > 0) {
				high--;
			}
			if(low<=high) {
				String temp = arrayStr[low];
				arrayStr[low] = arrayStr[high];
				arrayStr[high] = temp;

				low++;
				high--;
			}
		}
		return low;
	}
	private void quickSortArray(String arrayStr[], int low, int high) {
		int pi = partition(arrayStr, low, high);
		if(low < pi-1) {
			quickSortArray(arrayStr, low, pi-1);
		}
		if(pi < high) {
			quickSortArray(arrayStr, pi, high);
		}
	}

	public void stringSorting(String arrayStr[]) {
		stringSorting_actual(arrayStr);
	}
}

//main class
public class SelectionSortingOnIntegers{
	static java.util.Scanner sc = null;
	static SelectionSorting obj = null;
	static InsertionSorting insertion = null;
	static QuickSort quicksort = null;
	static MergeSort merge = null;
	static int arr[];
	static String arrStr[];
	public static void main(String[] args) {
		obj = new SelectionSorting();
		insertion = new InsertionSorting();
		merge = new MergeSort();
		quicksort = new QuickSort();
		sc = new java.util.Scanner(System.in);
		int len = 0, ch = 0;
		String continueP = null;
		boolean runningProgram = true;
		System.out.println("\n\t This Project is Written By Mohd Umar.\n====================== Sorting Project =============================== ");
		do{
		System.out.println("Enter the Choice - : ");
		System.out.print("1. Integer \n2. String \n:: ");
		ch = sc.nextInt();
		switch(ch) {
			case 1: System.out.print("Enter the Length of integer values - :");
					len = sc.nextInt();
					arr = new int[len];
					System.out.println("Enter the values -: ");
					try{
						for(int i=0; i<len; i++)
							arr[i] = sc.nextInt();
						integerResultSorting();
					} catch(InputMismatchException mis) {
						System.out.println("\n\n\tError !.. \n\tEnter the values in the right format !..");
						System.out.println("\n============== Do You Want to Continue this Sorting Program. =============== \n:: Press 1 for Continue.\n:: Press any key except 1 for Exit.");
						sc.next();
						continueP = sc.next();
						if(continueP.equals("1"))
							runningProgram = true;
						else 
							runningProgram = false;
						break;
					}
					System.out.println("\n=============== Do You Want to Continue this Sorting Program. ================== \n:: Press 1 for Continue.\n:: Press any key except 1 for Exit.");
					continueP = sc.next();
					if(continueP.equals("1"))
						runningProgram = true;
					else 
						runningProgram = false;
					break;
			case 2: System.out.print("Enter the Length of String values - :");
					len = sc.nextInt();
					arrStr = new String[len];
					System.out.println("Enter the values without using space in words -: ");
					try{
						for(int i=0; i<len; i++) {
							arrStr[i] = sc.next();
						}
						stringResultSorting();
					} catch(InputMismatchException mis) {
						System.out.println("\n\n\tError !.. \n\tEnter the values in the right format !..");
						System.out.println("\n============== Do You Want to Continue this Sorting Program. =============== \n:: Press 1 for Continue.\n:: Press any key except 1 for Exit.");
						sc.next();
						continueP = sc.next();
						if(continueP.equals("1"))
							runningProgram = true;
						else 
							runningProgram = false;
						break;
					}
					System.out.println("\n============== Do You Want to Continue this Sorting Program. =============== \n:: Press 1 for Continue.\n:: Press any key except 1 for Exit.");
					continueP = sc.next();
					if(continueP.equals("1"))
						runningProgram = true;
					else 
						runningProgram = false;
					break;
			default : System.out.println("\n\n\tWrong Choice!..");
		}
		}while(runningProgram==true);
	}
	//choice that which type of sorting for integers
	static void integerResultSorting() {
		int sh = 0;
		System.out.println("\nEnter the Choice of Sorting Algorithm(Method) - :");
		System.out.print("\n1. Bubble Sort\n2. Selection Sort \n3. Insertion Sort\n4. Merge Sort\n5. Quick Sort\n:: ");
		if(sc!=null)
			sh = sc.nextInt();
		switch(sh) {
			case 1: System.out.println("Coming Soon !..");
					break;
			case 2: System.out.println("\n========================================= Selection Sorting Algorithm =========================================\n===================== Sorted integer values are - : ================ \n");
					obj.integerSorting(arr);
					break;
			case 3: System.out.println("\n========================================= Insertion Sorting Algorithm =========================================\n===================== Sorted integer values are - : ================ \n");
					insertion.integerSorting(arr);
					break;
			case 4: System.out.println("\n========================================= Merge Sorting Algorithm =========================================\n===================== Sorted integer values are - : ================ \n");
					merge.integerSorting(arr);
					break;
			case 5: System.out.println("\n========================================= Quick Sorting Algorithm =========================================\n===================== Sorted integer values are - : ================ \n");
					quicksort.integerSorting(arr);
					break;		
			default: System.out.println("Wrong Choice !..");
		}
	}
	//choice that which type of sorting for strings
	static void stringResultSorting() {
		int sh = 0;
		System.out.println("\nEnter the Choice of Sorting Algorithm(method) - :");
		System.out.print("\n1. Bubble Sort\n2. Selection Sort \n3. Insertion Sort \n4. Merge Sort \n5. Quick Sort\n:: ");
		if(sc!=null)
			sh = sc.nextInt();
		switch(sh) {
			case 1: System.out.println("Coming Soon !..");
					break;
			case 2: System.out.println("\n========================================= Selection Sorting Algorithm =========================================\n===================== Sorted integer values are - : ================ \n");
					obj.stringSorting(arrStr);
					break;
			case 3: System.out.println("\n========================================= Insertion Sorting Algorithm =========================================\n===================== Sorted integer values are - : ================ \n");
					insertion.stringSorting(arrStr);
					break;
			case 4: System.out.println("\n========================================= Merge Sorting Algorithm =========================================\n===================== Sorted integer values are - : ================ \n");
					merge.stringSorting(arrStr);
					break;
			case 5: System.out.println("\n========================================= Quick Sorting Algorithm =========================================\n===================== Sorted integer values are - : ================ \n");
					quicksort.stringSorting(arrStr);
					break;
			default: System.out.println("Wrong Choice !..");
		}
	}
}
