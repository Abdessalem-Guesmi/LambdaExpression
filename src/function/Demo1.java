package function;

import java.util.function.Function;

/*
 * Function<T,R>  T: parametre, R: return type---->return some type
 * apply()
 */
public class Demo1 {

	public static void main(String[] args) {
		Function<Integer, Integer> f1 = n -> n * n;

		System.out.println(f1.apply(5));

	}

}
