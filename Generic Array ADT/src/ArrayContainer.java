public class ArrayContainer<T> implements ArrayContainerInterface<T> {
	private T[] container;
	private int defaultSize = 25;
	private int numItems;
	
	public ArrayContainer() {
		
		container = (T[]) new Object[defaultSize];
		numItems =0;
	
	}
	
	@Override
	public void add(T item) {
		
		 if (defaultSize < container.length) {
	         container[defaultSize] = item;
	      }
		 ++defaultSize;

	}
	
	@Override
	public boolean isFull() {
		return false;
	}
	
	@Override
	public String toString() {
		String output = new String();
		for (T count : container)
		{
			System.out.println(container.getClass());
			output += count;
		}
   return output;  
	}

}
