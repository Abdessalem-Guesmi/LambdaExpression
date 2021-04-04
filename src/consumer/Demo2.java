package consumer;

import java.util.function.Consumer;

//Consumer chaining
public class Demo2 {

	public static void main(String[] args) {

		Consumer<String> c1 = s1 -> System.out.println(s1 + "string 1");
		Consumer<String> c2 = s2 -> System.out.println(s2 + "string 2");
		Consumer<String> c3 = s3 -> System.out.println(s3 + "string 3");
		Consumer<String> c4 = c1.andThen(c2).andThen(c3);
		c4.accept("hello ");
	}

}
