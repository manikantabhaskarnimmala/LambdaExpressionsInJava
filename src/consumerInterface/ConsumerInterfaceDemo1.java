package consumerInterface;

/*
 * Consumer Interface:
Consumer<T> is a functional interface from the java.util.function package.
It is used when we want to take one input and perform some operation on it, but return nothing. 

It is having an abstract method called accept();

Consumer<T> c = value -> {
    // operation
		};

It’s abstract method void accept(T t);
Consumer accepts a value but does not return a value. 

 */
import java.util.function.Consumer;

public class ConsumerInterfaceDemo1 {

	public static void main(String[] args) {

		Consumer<String> c = s -> {
			System.out.println(s);
		};
		c.accept("Manikanta");

	}

}
