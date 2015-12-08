public class CountingSort implements SortStrategy{
	public void Sort(int[] array) {
		if (array.length == 0) {
			return;
		}

		// Determine minimum and maximum values
		int minValue = array[0];
		int maxValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
			} else if (array[i] > maxValue) {
				maxValue = array[i];
			}
		}

		sort(array, minValue, maxValue);
	}

	public void sort(int[] array, int minValue, int maxValue) {
		int[] buckets = new int[maxValue - minValue + 1];

		for (int i = 0; i < array.length; i++) {
			buckets[array[i] - minValue]++;
		}

		int sortedIndex = 0;
		for (int i = 0; i < buckets.length; i++) {
			while (buckets[i] > 0) {
				array[sortedIndex++] = i + minValue;
				buckets[i]--;
			}
		}
	}

}
