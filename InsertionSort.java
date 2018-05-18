import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		insertionSort(new int[]{2, 9, 4, 8, 1, 6});
	}
	
	public static int[] insertionSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			for(int j = i - 1; j >= 0 && temp < arr[j]; j--) {
				arr[j + 1] = arr[j];
				arr[j] = temp;
			}
		}
		return arr;
	}
	
}
