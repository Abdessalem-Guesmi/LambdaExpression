package function;

import java.util.function.Function;

public class Demo2 {

	public static void main(String[] args) {
		Function<String, Integer> f1 = s -> s.trim().length();
		Function<String, Integer> f2 = s -> s.length();

		System.out.println(f1.apply("moahemd hedi chekr  guesmi"));
		System.out.println(f2.apply("moahemd hedi chekr guesmi"));

	}

}
