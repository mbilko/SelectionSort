public class SelectionSort {
	private int temp;

	public SelectionSort(){
	}

	/*
	 * A simple SelectionSort algorithm
	 * pre-condition: array not sorted
	 * post-condition: array sorted
	 * inputs: unsorted array
	 * outputs: sorted array
	 * special conditions: n/a
	 */
	public int[] basicSelectionSort(int[] x) {
		for (int i = 0; i < x.length; ++i) {
			for (int j = i + 1; j < x.length; ++j) {
				if(x[i] > x[j]) {
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			} // end of inner for loop
		} // end of outer for loop
		return x;
	} // end of basicSelectionSort method
}
