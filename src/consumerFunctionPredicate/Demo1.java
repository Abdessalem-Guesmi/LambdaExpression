package consumerFunctionPredicate;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employe {
	String name;
	int salary;

	public Employe(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}

public class Demo1 {

	public static void main(String[] args) {
		ArrayList<Employe> listEmp = new ArrayList<>();
		listEmp.add(new Employe("Marc", 5000));
		listEmp.add(new Employe("Frank", 3000));
		listEmp.add(new Employe("Mostafa", 8000));
		listEmp.add(new Employe("Jamila", 7500));
		listEmp.add(new Employe("Ramzi", 4500));

		Function<Employe, Integer> f = e -> e.salary * 10 / 100;
		Predicate<Integer> p = n -> n >= 500;
		Consumer<Employe> c1 = s -> {
			System.out.print("the employe " + s.name);
			System.out.println(" have a salary :" + s.salary);
		};
		Consumer<Integer> c2 = b -> System.out.println(" have a bonus : " + b);

		for (Employe e : listEmp) {
			int bonus = f.apply(e); // calculate bonus
			if (p.test(bonus)) { // invoked Predicate
				c1.accept(e); // invoked Consumer
				c2.accept(bonus);

			}
		}
	}

}
