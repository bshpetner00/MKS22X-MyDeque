import java.util.*;
import java.io.*;

public class Calculator {
	public static double eval(String s) {
		String[] arguments = s.split(" ");
		MyDeque<Double> deque = new MyDeque(arguments.length);
		for (int i = 0; i < arguments.length; i++) {
			if (ary[i].equals("+")) {
				double o = deque.removeLast();
				double k = deque.removeLast();
				deque.addLast(o+k);
			}
		}
	}

}