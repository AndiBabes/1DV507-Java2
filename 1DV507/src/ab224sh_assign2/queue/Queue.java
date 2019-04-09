package ab224sh_assign2.queue;

import java.util.Iterator;

/**
 * An interface representing a simple object queue. This interface defines the
 * required functionality for all <code>Queue</code> implementations. It
 * provides support for accessing at the beginning (dequeue, first) and the end
 * (enqueue, last) of the queue. It contains basic support for sequential access
 * of the whole content (i.e., iterators).
 * <p/>
 * Currently available <code>Queue</code> implementations in the
 * <code>ab224sh_assign1.queue</code> package are:
 * <ul>
 * <li>{@link ab224sh_assign2.queue.LinkedQueue}</li>
 * </ul>
 * 
 * @author Andi - PC
 *
 */
public interface Queue
{
	/**
	 * Returns the number of objects currently stored in the queue.
	 *
	 * @return number of elements
	 */
	public int size(); 

	/**
	 * Determines whether the queue is empty or not.
	 * 
	 * @return <code> true </code> if the queue is empty, and <code> false</code>
	 *         otherwise
	 */
	public boolean isEmpty(); 

	/**
	 * Adds parameter <code> element </code> at the end of the queue.
	 * 
	 * @param element the object to be added to the queue
	 */
	public void enqueue(Object element); 

	/**
	 * Removes and returns the first element in the queue.
	 * 
	 * @return the value of the first element in the queue
	 */
	public Object dequeue(); 

	/**
	 * Returns the first element without removing it.
	 * 
	 * @return the value of the first element
	 */
	public Object first(); 

	/**
	 * Returns the last element.
	 * 
	 * @return the value of the last element
	 */
	public Object last();

	/**
	 * Returns a string representation of the content.
	 * 
	 * @return a string representation of the content
	 */
	public String toString(); 

	/**
	 * Returns an iterator to access the queue sequentially.
	 * 
	 * @return a queue iterator
	 */
	public Iterator<Object> iterator(); 
}
