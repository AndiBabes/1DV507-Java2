package ab224sh_assign4.stack;

import java.util.*;

public class StackIterator implements Iterator<Object>
{
	private int nextElem;
	private final Object[] elements;
	
	public StackIterator(Object[] values, int size)
	{
		elements=values;
		nextElem=size-1;
	}
	
	public boolean hasNext()
	{
		return nextElem>=0;
	}
	
	public Object next()
	{
		return elements[nextElem--];
	}
	
}
