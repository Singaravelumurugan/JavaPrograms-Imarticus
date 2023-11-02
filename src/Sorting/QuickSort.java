package Sorting;

import java.util.Arrays;
 class quicksortalgorithm{
	static int partition(int array[],int low, int high) {
		int pivot=array[high];
		int i=(low-1);
		for(int j=low;j<high;j++) {
			if(array[j]<=pivot) {
				i++;
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		int temp=array[i+1];
		array[i+1]=array[high];
		array[high]=temp;
		return(i+1);
	}
	static void quicksort(int array[],int low,int high) {
		if (low<high) {
			int pi=partition(array,low,high);
			quicksort(array,low,pi-1);
			quicksort(array,pi+1,high);
		}
	}	
}
public class QuickSort {
	public static void main(String[] args) {
		int [] data= {8,7,2,1,0,9,6};
		System.out.println("Unsorted Array");
		System.out.println(Arrays.toString(data));
		int size=data.length;
		quicksortalgorithm.quicksort(data, 0, size-1);
		
		System.out.println("Sorted Array in Ascending Order ");
		System.out.println(Arrays.toString(data));
	}
}
