import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int arraySize = 10000;
		int array[] = new int[arraySize];
		Random rand = new Random();
		for (int i = 0; i < arraySize; i++)
			array[i] = rand.nextInt(arraySize);
		// --- Bubble
		long time = System.currentTimeMillis();
		Context sort = new Context(new BubbleSort());
		sort.Sort(array);
		time = System.currentTimeMillis() - time;
		System.out.println("time in BubbleSort: " + time);
		// --- Insertion
		time = System.currentTimeMillis();
		sort = new Context(new InsertionSort());
		sort.Sort(array);
		time = System.currentTimeMillis() - time;
		System.out.println("time in InsertionSort: " + time);
		// --- Quick
		time = System.currentTimeMillis();
		sort = new Context(new QuickSort());
		sort.Sort(array);
		time = System.currentTimeMillis() - time;
		System.out.println("time in QuickSort: " + time);
		// --- Heap
		time = System.currentTimeMillis();
		sort = new Context(new HeapSort());
		sort.Sort(array);
		time = System.currentTimeMillis() - time;
		System.out.println("time in HeapSort: " + time);
		// --- Merge
		time = System.currentTimeMillis();
		sort = new Context(new MergeSort());
		sort.Sort(array);
		time = System.currentTimeMillis() - time;
		System.out.println("time in MergeSort: " + time);
		// --- Counting
		time = System.currentTimeMillis();
		sort = new Context(new CountingSort());
		sort.Sort(array);
		time = System.currentTimeMillis() - time;
		System.out.println("time in CountingSort: " + time);
	}
}