import java.util.*;
import java.io.*;

public class Calculator {
	public static double eval(String s) {
		String[] arguments = s.split(" ");
		MyDeque<Double> deque = new MyDeque(arguments.length);
		for (int i = 0; i < arguments.length; i++) {
			if (arguments[i] == "+") {
				double o = deque.removeLast();
				double k = deque.removeLast();
				deque.addLast(o+k);
			}
			else if (arguments[i] == "-") {
				double o = deque.removeLast();
				double k = deque.removeLast();
				deque.addLast(k-o);
			}
			else if (arguments[i] == "*") {
				double o = deque.removeLast();
				double k = deque.removeLast();
				deque.addLast(o*k);
			}
			else if (arguments[i] == "/") {
				double o = deque.removeLast();
				double k = deque.removeLast();
				deque.addLast(k/o);
			}
			else if (arguments[i] == "%") {
				double o = deque.removeLast();
				double k = deque.removeLast();
				deque.addLast(k%o);
			}
			else {
				deque.addLast(Double.parseDouble(arguments[i]));
			}
		}
		return deque.removeLast();
	}
}