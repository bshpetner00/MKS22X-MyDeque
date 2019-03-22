import java.util.*;
import java.io.*;

public class MyDeque<E> {
	private E[] data;
	private int size, start, end;
	@SuppressWarnings("unchecked")
	public MyDeque(int initialCapacity) {
		size = initialCapacity;
		start = 0;
		end = 0;
		data = (E[])new Object[initialCapacity];
	}
	@SuppressWarnings("unchecked") 
	public MyDeque(){
		size = 10;
		start = 0;
		end = 0;
		data = (E[])new Object[10];
	}
	public int size(){ 
		return size;
	}
	public String toString(){ 
		String r = "{";
		for (int i = 0; i < data.length; i++) {
			r = r + data[i] + " ";
		}
		return r + "}";
	}

	public void resize(E[]data) {
		//use for add
	}

	public void addFirst(E element) throws NullPointerException {
		if (element.equals(null)) {
			throw new NullPointerException("Element is null.");
		}
	}

	public void addLast(E element) throws NullPointerException{
		if (element.equals(null)) {
			throw new NullPointerException("Element is null.");
		}
	}

	public E removeFirst() throws NoSuchElementException {
		if (data.length == 0) {
			throw new NoSuchElementException("Deque is empty");
		}
		E bye = data[start];
		data[start] = null;
		size--;
		start++;
		return bye;
	}

	public E removeLast() throws NoSuchElementException {
		if (data.length == 0) {
			throw new NoSuchElementException("Deque is empty");
		}
		E bye = data[end];
		data[end] = null;
		size--;
		end--;
		return bye;
	}

	public E getFirst() throws NoSuchElementException {
		if (data.length == 0) {
			throw new NoSuchElementException("Deque is empty");
		}
		return data[start];
	}

	public E getLast() throws NoSuchElementException {
		if (data.length == 0) {
			throw new NoSuchElementException("Deque is empty");
		}
		return data[end];
	}
}