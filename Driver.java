import java.util.*;

public class Driver {

	public static void main(String[] args) {
		MyDeque<Integer> d1 = new MyDeque<>(100);
	    System.out.print(d1+" "); System.out.println(d1.size());//{}, 0
	    for (int i = 10; i < 21; i++) {
	    	d1.addLast(i);
	    }
	    for (int i = 9; i > 0; i--) {
	    	d1.addFirst(i);
	    }
	    System.out.print(d1+" "); System.out.println(d1.size());

	    for (int i = 0; i < 20; i++) {
	    	d1.removeFirst();
	    }
	    System.out.print(d1+" "); System.out.println(d1.size());
    	//ONLY REMOVE LAST SEEMS TO MESS UP, RESIZING ISSUES TBD
	}
}