package ab224sh_assign4.stack;

import java.util.*;

public class StackInt implements Stack
{
	private int size = 0;
	private int length = 4;
	private Object[] values;

	public StackInt()
	{
		values = new Object[length];
	}

	private void resize()
	{
		length += 4;
		Object[] temp = new Object[length];
		for (int i = 0; i < size; i++)
			temp[i] = values[i];
		values = temp;
	}

	public boolean isEmpty()
	{
		if (size == 0)
			return true;
		return false;
	}

	public void push(Object x)
	{
		if (size == length)
			resize();
		values[size++] = x;

	}

	public Object peek()
	{
		if(isEmpty()) throw new EmptyStackException();
		return values[size - 1];
	}

	public Object pop()
	{
		if(isEmpty()) throw new EmptyStackException();
		return values[--size];
	}

	public int size()
	{
		return size;
	}

	public Iterator<Object> iterator()
	{
		return new StackIterator(values, size);
	}

}
