package ex21_07;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> {
	private ArrayList<E> stack = new ArrayList<E>();
	
	public boolean empty(){
		return stack.isEmpty();
	}
	
	public E push(E element){
		stack.add(element);
		return element;
	}
	
	public E pop(){
		if(empty()){
			throw new EmptyStackException();
		}
		E element = stack.get(stack.size() - 1);
		stack.remove(stack.size() - 1);
		return element;
	}
	
	public E peek(){
		if(empty()){
			throw new EmptyStackException();
		}
		return stack.get(stack.size() - 1);
	}
	
	public int search(Object element){
		int index = stack.indexOf(element);
		return index == -1 ? index : index + 1;
	}
	
}
