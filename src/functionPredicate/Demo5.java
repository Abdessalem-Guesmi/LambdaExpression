package functionPredicate;

import java.util.function.Function;

/*
 * chainning Function
 * andThen()
 * compose()
 */

public class Demo5 {

	public static void main(String[] args) {
		Function<Integer, Integer> f1 = n -> n * 3;
		Function<Integer, Integer> f2 = n -> n * n;
		System.out.println(f1.andThen(f2).apply(2));
		// -----------------f2.apply(f1)--------------------

		// -----------------f1=6, f2.apply(6)= 6*6 = 36-----

		System.out.println(f1.compose(f2).apply(2));
		// -----------------f1.apply(f2)--------------------

		// -----------------f2=4, f1.apply(4)= 4*3 = 12-----

	}

}
