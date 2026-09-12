package predicateInterface;

import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String args[]) {
		// Predicate takes only one parameter returns a boolean value
		// use only if you have conditional checks in program
		// Predicate Interface with Lambda Expression
		// Ex1:
		Predicate<Integer> p = (i) -> (i > 10);
		// i is the variable which takes a argument value

		// invoke the Lambda Expression by using test() method from Predicate Interface
		boolean result = p.test(20);
		System.out.println(result);
		System.out.println(p.test(30));
		System.out.println(p.test(10));

		// Ex2: here s is the variable which takes argument
		Predicate<String> obj2 = (s) -> (s.length() > 5);
		System.out.println(obj2.test("Hello World"));
		System.out.println(obj2.test("Manikanta"));
		System.out.println(obj2.test("MKB"));

		// Ex3: Print array elements if the whose length is more than 5
		String[] names = { "mani", "kiran", "gundu", "Peddagundu" };

		for (String s : names) {
			if (obj2.test(s)) {
				System.out.println(s);
			}
		}

	}

}
