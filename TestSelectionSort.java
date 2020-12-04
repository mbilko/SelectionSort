public void testMixed() {
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = -7;
		arr[3] = -10;
		arr[4] = 0;

		SelectionSort temp = new SelectionSort();
		temp.basicSelectionSort(arr);

		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -7;
		Sortedarr[2] = 0;
		Sortedarr[3] = 8;
		Sortedarr[4] = 9;

		assertArrayEquals(Sortedarr, arr);
	}

	public void testDuplicates() {
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 7;
		arr[4] = 2;

		SelectionSort temp = new SelectionSort();
		temp.basicSelectionSort(arr);

		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 7;
		Sortedarr[3] = 8;
		Sortedarr[4] = 9;

		assertArrayEquals(Sortedarr, arr);
	}
}
