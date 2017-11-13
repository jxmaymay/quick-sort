import static org.junit.Assert.*;

import org.junit.Test;

public class QuickSorterTest {
	@Test
	public final void testPartition() {
		int[] arr = {1, 5, 8, 3, 19, -1};
		QuickSorter.quickSort(arr, 0, 5);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		assertTrue(arr[0] == -1 && arr[1] == 1 && arr[2] == 3
				&& arr[3] == 5 && arr[4] == 8 && arr[5] == 9);
	}

}
