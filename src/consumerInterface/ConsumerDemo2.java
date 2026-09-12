package consumerInterface;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String empName;
	int empId;
	int salary;

	Employee(String name, int id, int salary) {
		empName = name;
		empId = id;
		this.salary = salary;
	}
}

public class ConsumerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> empData = new ArrayList<Employee>();
		empData.add(new Employee("mani", 415, 100000));
		empData.add(new Employee("mani", 415, 100000));
		empData.add(new Employee("kiran", 416, 25000));
		empData.add(new Employee("bhaskar", 417, 45000));
		empData.add(new Employee("ravi", 418, 30000));
		empData.add(new Employee("suresh", 419, 18000));
		empData.add(new Employee("anil", 420, 55000));
		empData.add(new Employee("rahul", 421, 12000));
		empData.add(new Employee("prasad", 422, 35000));
		empData.add(new Employee("vikas", 423, 75000));
		empData.add(new Employee("arjun", 424, 50000));

		// Function Interface (apply)
		Function<Employee, Integer> fu = (e) -> (e.salary * 10) / 100; // task1
		// Predicate Interface (test)
		Predicate<Integer> pr = (b) -> (b >= 5000); // task2
		// Consumer Interface (accept)
		Consumer<Employee> c = (e) -> { // task 3
			System.out.print(e.empName + " ");
			System.out.print(e.empId + " ");
			System.out.print(e.salary + " ");
		};

		for (Employee e : empData) {
			int bonus = fu.apply(e);
			if (pr.test(bonus)) {
				c.accept(e);
				System.out.print(bonus + "\n");
			}
		}

	}

}
