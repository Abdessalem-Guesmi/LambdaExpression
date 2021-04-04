package supplier;

import java.util.ArrayList;
import java.util.function.Supplier;

class Empl {
	String name;
	int age;

	public Empl(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Empl() {
		super();
		// TODO Auto-generated constructor stub
	}

}

public class Demo2 {

	public static void main(String[] args) {
		ArrayList<Empl> emp = new ArrayList<>();
		emp.add(new Empl("Firas", 25));
		emp.add(new Empl("Morad", 30));
		emp.add(new Empl("Mestiri", 35));
		Supplier<Integer> s = () -> emp.size();

		System.out.println(s.get());

	}

}
