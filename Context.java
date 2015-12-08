public class Context {
	private SortStrategy strategy;

	public Context(SortStrategy strategy) {
		this.strategy = strategy;
	}

	public void Sort(int[] number) {
		strategy.Sort(number);
	}

}
