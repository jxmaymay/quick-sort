
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
		
		while (i <= j) {
			while (arr[i] < arr[pivIndex]) {
				i++;
				}
			while (arr[j] < arr[pivIndex]) {
				j--;
			}
			if (i <= j) {
				int temp = i;
				i = j;
				j = temp;
				i++;
				j--;
			}
		}
		
		int swap = arr[i];
		arr[i] = arr[pivIndex];
		arr[pivIndex] = swap;
		pivIndex = i;
		
		return pivIndex;
	}
	
}
