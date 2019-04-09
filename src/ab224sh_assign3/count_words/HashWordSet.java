package ab224sh_assign3.count_words;

import java.util.Iterator;

public class HashWordSet implements WordSet
{
	private int size=0;
	private Node[] buckets = new Node[8];

	private int getBucketNumber(Word w)
	{
		int hc = w.hashCode();
		if (hc < 0)
			hc = -hc;
		return hc % buckets.length;
	}

	public int size()
	{
		return size;
	}

	public void add(Word w)
	{
		int pos = getBucketNumber(w);
		Node node = buckets[pos];
		while (node != null)
		{
			if (node.value.equals(w))
				return;
			else
				node = node.next;
		}
		node = new Node(w);
		node.next = buckets[pos];
		buckets[pos]=node;
		size++;
		if (size == buckets.length)
			rehash();
	}

	private void rehash()
	{
		Node[] temp = buckets;
		buckets = new Node[2 * temp.length];
		size = 0;
		for (Node n : temp)
		{
			if (n == null)
				continue;
			while (n != null)
			{
				add(n.value);
				n = n.next;

			}
		}
	}

	public boolean contains(Word word)
	{
		int pos = getBucketNumber(word);
		Node node = buckets[pos];
		while (node != null)
		{
			if (node.value.equals(word))
				return true;
			else
				node = node.next;
		}
		return false;
	}
	
	public Iterator<Word> iterator()
	{
		return new SetIterator();
	}

	private class SetIterator implements Iterator<Word>
	{
		private Node nextElem;
		private int pos;

		public SetIterator()
		{
			nextElem = buckets[0];
			pos = 0;

		}

		public boolean hasNext()
		{
			if (nextElem.next == null && pos == buckets.length)
				return false;
			return true;
		}

		public Word next()
		{
			Word value=nextElem.value;
			nextElem=nextElem.next;
			if(nextElem==null && pos<buckets.length)
				nextElem=buckets[++pos];
			return value;
		}

	}

	private class Node
	{
		Word value;
		Node next = null;

		public Node(Word w)
		{
			value = w;
		}

		public String toString()
		{
			return value.toString();
		}
	}
}
