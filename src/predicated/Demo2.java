package predicated;

import java.util.function.Predicate;

public class Demo2 {

	public static void main(String[] args) {

		Predicate<String> pred = s -> s.contains("me");

		String[] list = { "mohamed", "ahmed", "moetez", "faicel", "nabil" };
		for (String l : list) {
			if (pred.test(l)) {
				System.out.println(l);
			}
		}

	}

}
