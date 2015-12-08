
public class BubbleSort implements SortStrategy{
	public void bubbleSort(int array[], int min, int max)
	{
		for (int i = min ; i <= max ; i++)
		{
			for (int j = max ; j > i ; j--)
			{
				if (array[j-1] > array[j])
				{
					int copy = array[j-1] ;
					array[j-1] = array[j] ;
					array[j] = copy ;
				}
			}
		}
	}

	public void Sort(int[] number) {
		bubbleSort(number, 0 , number.length-1);
	}
}
