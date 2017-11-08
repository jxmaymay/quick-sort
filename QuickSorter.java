
public class QuickSorter {

	public static void quickSort(int[] arr, int lo, int hi) {
		if (lo < hi) {
			int pivotIndex = partition(arr, lo, hi);
			quickSort(arr, lo, pivotIndex -1);
			quickSort(arr, pivotIndex + 1, hi);
		}
	}
	
	public static int partition(int[] arr, int lo, int hi) {
		int pivIndex = 0;
		int i = 1;
		int j = arr.length - 1;
		
		while (i != j) {
			if (arr[i] < arr[pivIndex]) {
				i++;
			} else {
				if (arr[j] > arr[pivIndex]) {
					j++;
				}
			}
		}
		
		int swap = arr[i];
		arr[i] = arr[pivIndex];
		arr[pivIndex] = swap;
		pivIndex = i;
		
		return pivIndex;
	}
	
}
