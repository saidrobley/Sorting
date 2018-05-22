import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		bubbleSort(new int[]{2, 9, 4, 8, 1, 6});
		
	}
	
	public static int[] bubbleSort(int[] arr ) {
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < arr.length - i; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+ 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		return arr;
		
	}
	
}
