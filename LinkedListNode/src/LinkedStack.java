import java.util.EmptyStackException;

public class LinkedStack<T> implements StackInterface<T> {

	Node head;
	private T[] stack;    // array of stack entries
    private int topIndex; // index of top entry
    private static final int DEFAULT_INITIAL_CAPACITY = 50;
	
    public LinkedStack() {
	this(DEFAULT_INITIAL_CAPACITY);
    } // end default constructor
	
    public LinkedStack(int initialCapacity) {
	stack = (T[]) new Object[initialCapacity];
	topIndex = 1;
    } // end constructor
	public void push(T item) {
		if (head == null) {
			// The stack is empty
			Node newNode = new Node(item, null);
			head = newNode;
		} else {
			// Stack is not empty, create a new node at the top of the stack
			// The new item's next link goes to the "old" head
			Node newNode = new Node(item, head);
			
			// Now we can re-assign the link to the new head
			head = newNode;
		}
	}

	public T pop() {
		if (!isEmpty()) {
			throw new EmptyStackException();
		}
		T top = head.data;
		head = head.next;
		topIndex--;
		return top;
	}

	public T peek() {
		T top = null;
		
		if (!isEmpty())
		    top = stack[topIndex];
			
		return top;
	}
	 public boolean isEmpty()
	    {
		return topIndex < 0;
	    } // end isEmpty
	
	public int length() {
        Node n = head; 
        int length = 0;
        while (n != null) 
        { 
            length++; 
            n = n.next; 
        }
        return length;
	}
	
	@Override
	public String toString() {
		
		String retStr = "Contents:\n";
		
		
		Node current = head;
		while(current != null) {
			retStr += current.getData() + "\n";
			current = current.getNext();
		}
		return retStr;
	}
	
	/* This function prints contents of linked list starting from head */
	// Adapted from https://www.geeksforgeeks.org/linked-list-set-1-introduction/
	// Included for testing purposes
    public void printList() 
    { 
        Node n = head; 
        while (n != null) 
        { 
            System.out.print(n.data+" \n"); 
            n = n.next; 
        } 
    }
	
	// Nested class Node
	private class Node {
		T data;
		Node next;
		
		// Constructor for inner class Node
		Node(T data, Node next) {
			this.data = data;
			this.next = next;
		}
		
		// Setters & Getters for inner class Node
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
	}

}
