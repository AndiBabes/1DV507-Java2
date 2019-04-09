package ab224sh_assign2.queue;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class LinkedQueueTest
{
	static LinkedQueue sut = new LinkedQueue();

	public static void clearQueue()
	{
		sut = new LinkedQueue();
	}

	@Test
	public void testIsEmpty()
	{
		clearQueue();
		assertEquals(true, sut.isEmpty());
		sut.enqueue(1);
		assertEquals(false, sut.isEmpty());
	}

	@Test
	public void testSize()
	{
		clearQueue();
		assertEquals(0, sut.size());
		for (int i = 0; i < 4; i++)
		{
			sut.enqueue(1);
			assertEquals(i + 1, sut.size());
		}
	}

	@Test
	public void testDequeue()
	{
		clearQueue();
		assertThrows(IndexOutOfBoundsException.class, () -> sut.dequeue(), "the queue is empty");
		for (int i = 0; i < 4; i++)
		{
			sut.enqueue(i);
		}
		for (int i = 0; i < 4; i++)
		{
			assertEquals(i, sut.dequeue());

		}
	}

	@Test
	public void testToString()
	{
		clearQueue();
		assertEquals("", sut.toString());
		StringBuilder text = new StringBuilder();
		for (int i = 0; i < 4; i++)
		{
			sut.enqueue(i);
			text.append(i + " ");
			assertEquals(text.toString(), sut.toString());

		}
	}

	@Test
	public void testLast()
	{
		clearQueue();
		assertThrows(IndexOutOfBoundsException.class, () -> sut.last(), "the queue is empty");
		for (int i = 0; i < 4; i++)
		{
			sut.enqueue(i);
			assertEquals(i, sut.last());
		}
	}

	@Test
	public void testFirst()
	{
		clearQueue();
		assertThrows(IndexOutOfBoundsException.class, () -> sut.first(), "the queue is empty");
		for (int i = 0; i < 4; i++)
		{
			sut.enqueue(i);
		}
		for (int i = 0; i < 4; i++)
		{
			assertEquals(i, sut.first());
			sut.dequeue();
		}
	}

}
