package predicated;

import java.util.function.Predicate;

/*
 * Predicate<T>  T: parametre type---->return boolean
 * test()
 */
public class Demo1 {
	public static void main(String[] args) {
		int a[] = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70 };
		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 50;

		for (int i : a) {
			if (p1.and(p2).test(i)) {
				System.out.print(i + "--");
			}
		}

	}
}
