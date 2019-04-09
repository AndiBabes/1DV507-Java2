package ab224sh_assign3.count_words;

public class Word implements Comparable<Word>
{
	private String txt;

	public String toString()
	{
		return txt;
	}
	
	public void setWord(String text)
	{
		txt=text.toLowerCase();
	}

	public Word(String word)
	{
		txt = word.toLowerCase();
	}

	public int hashCode()
	{
		return txt.hashCode();
	}

	public boolean equals(Object o)
	{
		if (o instanceof Word)
			if (((Word) o).toString().equals(txt)) 
				return true;
		return false;
	}

	@Override
	public int compareTo(Word word)
	{
		return txt.compareTo(word.toString());
	}

}
