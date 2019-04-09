package ab224sh_assign4.stack;

import java.util.*;

public class StackMain
{

	public static void printStack(StackInt stack)
	{
		Iterator<Object> it = stack.iterator();
		while (it.hasNext())
		{
			Object o = it.next();
			System.out.print(o + " ");
		}
		System.out.println("");

	}

	public static void main(String[] args)
	{
		StackInt stack = new StackInt();
		System.out.println("stack is empty: "+stack.isEmpty());
		for (int i = 1; i <= 10; i++) 		// adding the numbers in [1,10] to the stack
			stack.push(i);
		System.out.print("initial stack: ");
		printStack(stack);
		System.out.print("removing: ");
		try
		{
			for (int i = 0; i < 3; i++) 	// removing 3 elements
				System.out.print(stack.pop() + " ");
			System.out.print("\nelement on top: ");
			System.out.println(stack.peek());
		} catch (EmptyStackException e)
		{
			e.printStackTrace();
		}
		System.out.print("stack now: ");
		printStack(stack);
		System.out.println("no of elements in stack: "+stack.size());
		for(int i=1;i<4;i++)  			//adding [1,3]
			stack.push(i);
		System.out.print("stack now: ");
		printStack(stack);
		System.out.println("no of elements in stack: "+stack.size());
		System.out.println("stack is empty: "+stack.isEmpty());

	}

}
