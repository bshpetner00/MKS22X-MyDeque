public class MyDeque<E> {
	private E[] data;
	private int size, start, end;
	public MyDeque(){
		data = new E[0];
	}
	public MyDeque(int initialCapacity) {
		data = new E[initialCapacity];
	}
	public int size(){ 
		return this.size;
	}
	public String toString(){ 
		String r = "{";
		for (int i = 0; i < data.length; i++) {
			r = r + data[i]; + " ";
		}
		return r + "}";
	}
	public void addFirst(E element){ }
	public void addLast(E element){ }
	public E removeFirst(){ }
	public E removeLast(){ }
	public E getFirst(){ }
	public E getLast(){ }
}