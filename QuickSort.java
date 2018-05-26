import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] a = new int[] {7, 2, 1, 6, 8, 5, 3, 4};
		System.out.println("Before sorting: \n" + Arrays.toString(a));
		
		quickSort(a);
		System.out.println("After sorting: \n" + Arrays.toString(a));
		
		
	}
	
	public static void quickSort(int[] list) {
		quickSort(list, 0, list.length-1);
	}
	
	public static void quickSort(int[] list, int first, int last) {
		if(first < last) {
			int pivotIndex = partition(list, first, last);
			quickSort(list, first, pivotIndex - 1);
			quickSort(list, pivotIndex + 1, last);
			
		}
	}
	
	public static int partition(int[] list, int start, int end) {
		int pivot = list[end];
		int pIndex = start;
		
		for(int i = start; i < end; i++) {
			if(list[i] <= pivot) {
				swap(list, i, pIndex);
				pIndex++;
			}
		}

		swap(list, pIndex, end);
		
		return pIndex;
	
	}
	
	public static int[] swap(int[] list, int i, int p) {
		int temp = list[i];
		list[i] = list[p];
		list[p] = temp;
		return list;
	}
	
	
	
}
