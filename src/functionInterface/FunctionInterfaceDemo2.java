package functionInterface;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String empName;
	int empId;
	double empSalary;

	Employee(String name,  double empSalary, int empId) {
		empName = name;
		this.empId = empId;
		this.empSalary = empSalary;
	}
}

public class FunctionInterfaceDemo2 {

	public static void main(String[] args) {

		// Using Array List I am storing the values

		ArrayList<Employee> data = new ArrayList<Employee>();
		data.add(new Employee("mani", 100000, 4));
		data.add(new Employee("kiran", 10000, 2));
		data.add(new Employee("gundu", 1000, 1));

		// Creating Function Interface
		Function<Employee, Integer> obj = e -> {
			double salary = e.empSalary;
			if (salary >= 10000 && salary < 20000) {
				return (int) (salary * 10 / 100);
			} else if (salary >= 20000 && salary < 30000) {
				return (int) (salary * 20 / 100);
			} else if (salary >= 30000 && salary < 40000) {
				return (int) (salary * 30 / 100);
			} else if (salary >= 40000 && salary < 50000) {
				return (int) (salary * 40 / 100);
			} else {
				return (int) (salary * 50 / 100);
			}
		};
		
		//Predicate Interface
		Predicate<Integer> pr = (i) -> (i>1000);

		for (Employee e : data) {
//			System.out.println(e.empName+" "+ e.empSalary);
//			System.out.println("Bonus is :"+obj.apply(e));
			int bonus = obj.apply(e); //Function Interface
			if(pr.test(bonus)) { // Predicate Interface
				System.out.println(e.empName+" "+ e.empSalary);
//				System.out.println("Bonus is :"+obj.apply(e));
			}
		}

	}

}
