package predicateInterface;

import java.util.ArrayList;
import java.util.function.Predicate;
//Predicate takes only one parameter returns a boolean value
// use only if you have conditional checks in program
// Will see a example for objects

class Employee {
	String ename;
	int salary;
	int experience;

	Employee(String name, int sal, int exp) {
		ename = name;
		salary = sal;
		experience = exp;
	}
}

public class PredicateDemo2 {

	public static void main(String[] args) {

		// EX1
		Employee emp = new Employee("mani", 100000, 4);

		// emp obj ---> return name if exp is more than 3 and salary is more than 30000
		Predicate<Employee> pr = (e) -> (e.salary > 30000 && e.experience > 3);
		System.out.println(pr.test(emp));

		// this is one for 1 emp object

		// EX2
		ArrayList<Employee> data = new ArrayList<Employee>();
		data.add(new Employee("mani", 100000, 4));
		data.add(new Employee("kiran", 10000, 2));
		data.add(new Employee("gundu", 1000, 1));
		
		for(Employee e: data) {
			System.out.println(e.ename+" "+e.salary+" "+e.experience);
		}

		for (Employee e : data) {
			if (pr.test(e)) {
			// if (e.salary > 30000 && e.experience > 3) {
				System.out.println(e.ename + " - " + e.salary);
			}
		}

	}

}
