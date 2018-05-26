import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
	//	int[] a = new int[] {4,2,1, 9, 0};
		int[] a = new int[] {4, 2, 5, 3};
		System.out.println("before sorting " + Arrays.toString(a));
		getMergeSort(a);
		System.out.println("after sorting " + Arrays.toString(a));
	}
	
	public static void getMergeSort(int[] arr) {
		if(arr.length < 2) {
			return;
		}
		int mid = arr.length/2; // 8
		int[] l = new int[mid]; // 4; 0 .. 3
		int[] r = new int[arr.length - mid]; // 4; 4 ... 7;
		for(int i = 0; i < mid; i++) {
			l[i] = arr[i];
		}
		for(int i = mid; i < arr.length; i++) {
			r[i - mid] = arr[i];
		}
		
		getMergeSort(l);
		getMergeSort(r);
		
		merge(l, r, arr);
		
	}
	
	public static void merge(int[] left, int[] right, int[] arr) {
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;
		
		while(current1 < left.length && current2 < right.length) {
			if(left[current1] < right[current2]) {
				arr[current3] = left[current1];
				current1++;
				current3++;
			} else {
				arr[current3] = right[current2];
				current2++;
				current3++;
			}
		}
		while(current1 < left.length) {
			arr[current3] = left[current1];
			current1++;
			current3++;
		}
		
		while(current2 < right.length) {
			arr[current3] = right[current2];
			current2++;
			current3++;
		}
	}
	
	
	
}
