package functionPredicate;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employ {
	String name;
	int salary;

	public Employ(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}

public class Demo3 {

	public static void main(String[] args) {
		ArrayList<Employ> employList = new ArrayList<>();
		employList.add(new Employ("ahmed", 5000));
		employList.add(new Employ("Mohamed", 8000));
		employList.add(new Employ("Mostafa", 450));
		employList.add(new Employ("Rafik", 2500));
		employList.add(new Employ("Adel", 7000));
		employList.add(new Employ("Nadhem", 6000));
		// i will see the name of emplyees where salary greates 500
		Predicate<Integer> sal = s -> s > 500;
		Function<Employ, String> empl = e -> e.name;
		for (Employ e : employList) {
			if (sal.test(e.salary)) {
				System.out.println(empl.apply(e));
			}
		}

	}

}
