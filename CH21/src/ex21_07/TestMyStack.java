package ex21_07;

import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.Before;
import org.junit.Test;

public class TestMyStack {

	MyStack<Object> myStack;
		
	@Before
	public void makeNewStack(){
		myStack = new MyStack<Object>();
	}
	
	@Test(expected = EmptyStackException.class)
	public void popThrowsEmptyStackException() {
		myStack.pop();
	}

	@Test(expected = EmptyStackException.class)
	public void emptyThrowsEmptyStackException() {
		myStack.pop();
	}
	
	@Test
	public void testPushAndPop(){
		Object obj1 = new Object();
		Object obj2 = new Object();
		assertEquals(myStack.push(obj1), obj1);
		assertEquals(myStack.push(obj2), obj2);
		assertEquals(myStack.pop(), obj2);
		assertEquals(myStack.pop(), obj1);
	}
	
	@Test
	public void testPeek(){
		Object obj = new Object();
		myStack.push(obj);
		assertEquals(myStack.peek(), obj);
		assertEquals(myStack.peek(), obj);
		obj = new Object();
		myStack.push(obj);
		assertEquals(myStack.peek(), obj);
	}
	
	@Test
	public void testEmpty(){
		assertTrue(myStack.empty());
		myStack.push(new Object());
		assertFalse(myStack.empty());
	}

	@Test
	public void testSearch(){
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		assertEquals(myStack.search(obj1), -1);
		myStack.push(obj1);
		myStack.push(obj2);
		myStack.push(obj3);
		assertEquals(myStack.search(obj1), 1);
		assertEquals(myStack.search(obj2), 2);
		assertEquals(myStack.search(obj3), 3);		
	}
}
