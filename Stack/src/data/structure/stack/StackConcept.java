package data.structure.stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackConcept {
	
	static void pushdata(Stack st, int a)
	{
		st.push(new Integer(a));
		System.out.println("push("+ a +")");
		System.out.println("stack: " + st);
	}
	
	static void popdata(Stack st)
	{
		System.out.println("pop -> ");
		Integer a = (Integer) st.pop();
		System.out.println(a);
		System.out.println("stack: " + st);
	}
	
	public static void main(String args[])
	{
		Stack st = new Stack();
		System.out.println("stack: " + st);
		pushdata(st , 40);
		pushdata(st, 60);
		pushdata(st, 90);
		popdata(st);
		popdata(st);
		popdata(st);
		
		try
		{
			popdata(st);
		}
		catch(EmptyStackException e)
		{
			System.out.println("empty stack");
		}
	}
}
