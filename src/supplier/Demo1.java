package supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Demo1 {
	static String message = "hello friends";

	public static void main(String[] args) {
		Supplier<String> s1 = () -> message;
		System.out.println(s1.get());

		Supplier<Date> s2 = () -> new Date();
		System.out.println(s2.get());

	}

}
