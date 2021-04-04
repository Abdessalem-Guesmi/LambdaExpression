package consumer;

import java.util.function.Consumer;

/*
 * cunsumer<T> parameter type 
 */
public class Demo1 {

	public static void main(String[] args) {
		Consumer<Integer> c1 = i -> System.out.println(i.doubleValue());
		c1.accept(2);

		Consumer<String> c2 = s -> System.out.println(s.length());
		c2.accept("hello friends");

		Consumer<String> c3 = s -> System.out.println(s);
		c3.accept("hello friends");
	}

}
