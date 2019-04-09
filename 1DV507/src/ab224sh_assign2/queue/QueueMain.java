package ab224sh_assign2.queue;

import java.util.Iterator;

public class QueueMain
{

	public static void main(String[] args)
	{
		LinkedQueue queue = new LinkedQueue();
		for (int i = 0; i < 11; i++)
			queue.enqueue(i);
		System.out.println("size: " + queue.size());
		System.out.println("elements: " + queue.toString());
		System.out.println("last element: "+queue.last());
		System.out.println("first element: "+queue.first());
		for(int i=0;i<4;i++)
			queue.dequeue();
		System.out.println("first element after we remove 4 elements: "+queue.first());
		System.out.print("the elements in the queue now: ");
		Iterator<Object> it= queue.iterator();
		while(it.hasNext())
			System.out.print(it.next() + " ");
		System.out.println();
		System.out.println("the queue is empty: " + queue.isEmpty());
	}

}
