
/**
 * @author Jin An
 * Delaware Technical Community College
 *
 * This interface defines a general ADT that can hold an unspecified number of items
 * @param <T> Class type of objects that will be stored in this container ADT
 */
public interface ArrayContainerInterface<T> {
	
	/**
	 * This method adds objects into container
	 * @param item
	 */
	public void add(T item);

	/**
	 * This method checks if the container is full - in other words, if more items cannot be added
	 * @return true if it is full, false otherwise
	 */
	public boolean isFull();
	
	@Override
	public String toString();
}