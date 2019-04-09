package ab224sh_assign3.count_words;

import java.util.Iterator;
import java.util.NavigableMap;

public class TreeWordSet implements WordSet
{
	private BST root = null;
	int size = 0;

	public void add(Word w)
	{
		if (root == null)
		{
			root = new BST(w);
			size++;
		} else
			root.add(w);
	}

	public int size()
	{
		return size;
	}

	public boolean contains(Word w)
	{

		return contains(root, w);
	}

	private boolean contains(BST bst, Word w)
	{
		if (bst.value.equals(w))
			return true;
		else if (bst.value.compareTo(w) < 0 && bst.left != null)
			return contains(bst.left, w);
		else if (bst.value.compareTo(w) > 0 && bst.right != null)
			return contains(bst.right, w);
		return false;
	}

	private class BST
	{
		Word value;
		BST left = null;
		BST right = null;

		BST(Word val)
		{
			value = val;
		}

		void add(Word w)
		{
			if (w.compareTo(value) < 0)
				if (left == null)
				{
					left = new BST(w);
					size++;
				} else
					left.add(w);
			else if (w.compareTo(value) > 0)
				if (right == null)
				{
					right = new BST(w);
					size++;
				} else
					right.add(w);
		}
	}

	private transient NavigableMap<Word, Object> m;

	public Iterator<Word> iterator()
	{
		return m.navigableKeySet().iterator();
	}

}
