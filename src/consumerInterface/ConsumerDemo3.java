package consumerInterface;

import java.util.function.Consumer;

//Consumer Chaining: It is possible with andThen() method

public class ConsumerDemo3 {

	public static void main(String[] args) {
		Consumer<String> c1 = (s) -> System.out.println(s + " is QA automation Engineer");
		Consumer<String> c2 = (s) -> System.out.println(s + " will get 13LPA");
		Consumer<String> c3 = (s) -> System.out.println(s + " will be place in a good company");

		// c1.accept("Milk");
		// c2.accept("Manikanta");
		// c3.accept("Manikanta");

		// or

		c1.andThen(c2).andThen(c3).accept("Manikanta");
		System.out.println("*****************");
		Consumer<String> c4 = c1.andThen(c2).andThen(c3);
		c4.accept("Manikanta");

	}

}
