package ab224sh_assign2.queue;

import java.util.Iterator;

/**
 * A class representing a linked implementation of the <code> Queue </code>
 * interface, created with the "head-and-tail" approach.
 * 
 * @author Andi - PC
 *
 */
public class LinkedQueue implements Queue
{
	private int size;
	private Node head = null;
	private Node tail = null;

	/**
	 * The constructor of the class, creating a new empty queue. It sets the field
	 * <code> size </code> to 0, as the queue contains no elements initially.
	 * 
	 */
	public LinkedQueue()
	{
		size = 0;
	}

	@Override
	public int size()
	{
		return size;
	}

	@Override
	public boolean isEmpty()
	{
		return size == 0;
	}

	@Override
	public void enqueue(Object element)
	{
		Node nw = new Node(element);
		if (isEmpty())
			head = nw;
		else
			tail.next = nw;
		tail = nw;
		size++;
	}

	@Override
	public Object dequeue()
	{
		if (isEmpty())
			throw new IndexOutOfBoundsException("the queue is empty");
		Object value = head.value;
		head = head.next;
		size--;
		return value;
	}

	@Override
	public Object first()
	{
		if (isEmpty())
			throw new IndexOutOfBoundsException("the queue is empty");
		return head.value;
	}

	@Override
	public Object last()
	{
		if (isEmpty())
			throw new IndexOutOfBoundsException("the queue is empty");
		return tail.value;
	}

	@Override
	public String toString()
	{
		StringBuilder txt = new StringBuilder();
		Iterator<Object> it = iterator();
		while (it.hasNext())
		{
			Object value = it.next();
			txt.append(value);
			txt.append(" ");
		}
		return txt.toString();
	}

	@Override
	public Iterator<Object> iterator()
	{
		return new QueueIterator();
	}

	private class Node
	{
		public Object value;
		public Node next = null;

		public Node(Object value)
		{
			this.value = value;
		}
	}

	private class QueueIterator implements Iterator<Object>
	{
		private Node nextElement;

		public QueueIterator()
		{
			nextElement = head;
		}

		public boolean hasNext()
		{
			return nextElement != null;
		}

		public Object next()
		{
			Object value = nextElement.value;
			nextElement = nextElement.next;
			return value;
		}

	}
}
