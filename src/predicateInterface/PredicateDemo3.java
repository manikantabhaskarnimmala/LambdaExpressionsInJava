package predicateInterface;

import java.util.function.Predicate;

//Joining Predicates -> AND , or, negate
// p1 -- checks number is even
//p2 -- checks greater than 50

public class PredicateDemo3 {

	public static void main(String[] args) {

		int a[] = { 5, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 100 };

		Predicate<Integer> p1 = i -> (i % 2 == 0);
		Predicate<Integer> p2 = i -> (i > 50);

		// Print even numbers
		System.out.println("Even numbers");
		for (int n : a) {
			if (p1.test(n)) {
				System.out.println(n);
			}
		}

		// AND
		System.out.println("\n Joining Predicate interfaces using AND");
		for (int n : a) {
			// if(p1.test(n) && p2.test(n)) {
			if (p1.and(p2).test(n)) {
				System.out.println(n);
			}
		}

		// OR
		System.out.println("\n Joining Predicate interfaces using OR");
		for (int n : a) {
			if (p1.or(p2).test(n)) {
				System.out.println(n);
			}
		}

		// Print odd numbers
		System.out.println("\n Odd numbers");
		for (int n : a) {
			if (p1.negate().test(n)) {
				System.out.println(n);
			}
		}

	}

}
