package ab224sh_assign4.stack;

import java.util.Iterator;

public interface Stack
{
	int size();

	boolean isEmpty();

	void push(Object element);

	Object pop();

	Object peek();

	Iterator<Object> iterator();
}
