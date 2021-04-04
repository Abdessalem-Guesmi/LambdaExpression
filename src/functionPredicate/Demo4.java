package functionPredicate;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String name;
	int salary;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}

// inthis example i will use depricate and Function lambda expressions
public class Demo4 {

	public static void main(String[] args) {
		ArrayList<Employ> employList = new ArrayList<>();
		employList.add(new Employ("ahmed", 5000));
		employList.add(new Employ("Mohamed", 8000));
		employList.add(new Employ("Mostafa", 4500));
		employList.add(new Employ("Rafik", 2500));
		employList.add(new Employ("Adel", 7000));
		employList.add(new Employ("Nadhem", 6000));
		// i will see the name of Employes where bonus greates 500
		Function<Employ, Integer> empl = e -> {
			int sal = e.salary;
			if (sal < 4000)
				return (sal * 5 / 100);
			else if (sal <= 5000)
				return (sal * 10 / 100);
			else if (sal <= 6000)
				return (sal * 15 / 100);
			else
				return (sal * 20 / 100);
		};

		Predicate<Integer> pre = b -> b >= 500;
		for (Employ e : employList) {
			int bonus = empl.apply(e);
			if (pre.test(bonus)) {
				System.out.println("salary for " + e.name + " " + e.salary);
				System.out.println("the bonus for " + e.name + " is: " + bonus);
			}
		}

	}

}
