import java.util.*;
import java.io.*;

public class MyDeque<E> {
	private E[] data;
	private int size, start, end;
	@SuppressWarnings("unchecked")
	public MyDeque(int initialCapacity) {
		size = 0;
		start = 0;
		end = 0;
		data = (E[])new Object[initialCapacity];
	}
	@SuppressWarnings("unchecked") 
	public MyDeque(){
		size = 0;
		start = 0;
		end = 0;
		data = (E[])new Object[10];
	}
	public int size(){ 
		return size;
	}
	public String toString(){ 
		String r = "{";
		if (size == 0) { //empty
			return r + "}";
		}
		if (start <= end) { //normal conditions
			for (int i = start; i <= end; i++) {
				if (data[i] != null) {	
					r = r + data[i] + " ";
				}
			}
		}
		else { // start > end, needs to loop around
			for (int j = start; j != end+1; j++) {
				if (data[j] != null) {
					r = r + data[j] + " ";
				}
				if (j == data.length-1) {
					j = 0;
				}
			}
		}
		return r + "}";
	}

	@SuppressWarnings("unchecked")
	private void resize() {
		E[] resizedArray = (E[])new Object[data.length*2+1];
		int i = 0;
		for (E s:data) {
			resizedArray[i] = data[i];
			i++;
		}
		data = resizedArray;
	}


	public void addFirst(E element) throws NullPointerException {
		if (element.equals(null)) {
			throw new NullPointerException("Element is null.");
		}
		if (size == data.length) {
			resize();
			start = data.length-1;
			end = size-1;
		}
		else if (size >= 0) {
			if (start == 0) {
				start = data.length-1;
			}
			else {
				start--;
			}
		}
		size++;
		data[start] = element;
	}

	public void addLast(E element) throws NullPointerException{
		if (element.equals(null)) {
			throw new NullPointerException("Element is null.");
		}
		if (size >= 0) {
			if (size == data.length) {
				resize();
				start = 0;
				end = size;
			}
			else {
				end++;
			}
		}
		else if (end == data.length-1) {
			end = 0;
		}
		size++;
		data[end] = element;
	}

	public E removeFirst() throws NoSuchElementException {
		if (size == 0) {
			throw new NoSuchElementException("Deque is empty");
		}
		E bye = data[start];
		data[start] = null; //removal
		size--; //size goes down
		if (size == 0) { //account for empty deque
			start = 0; 
			end = 0; 
		}
		else if (start < data.length-1) {
			start++; //go up one
		}
		else {
			start = 0; //loop to front if start is at end of array
		}
		return bye;
	}

	public E removeLast() throws NoSuchElementException {
		if (size == 0) {
			throw new NoSuchElementException("Deque is empty");
		}
		E bye = data[end];
		data[end] = null;
		size--;
		if (size == 0) { //account for empty deque
			start = 0; 
			end = 0; 
		}
		if (end > 0) {
			end--;
		}
		else {
			end = data.length-1;
		}
		end--;
		return bye;
	}

	public E getFirst() throws NoSuchElementException {
		if (size == 0) {
			throw new NoSuchElementException("Deque is empty");
		}
		return data[start];
	}

	public E getLast() throws NoSuchElementException {
		if (size == 0) {
			throw new NoSuchElementException("Deque is empty");
		}
		else if (end == 0) {
			return data[data.length-1];
		}
		return data[end-1];
	}
}