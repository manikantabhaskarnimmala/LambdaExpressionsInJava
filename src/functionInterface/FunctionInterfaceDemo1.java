package functionInterface;

import java.util.function.Function;

/*
 * It has an abstract method called apply().
 *	It returns a value in any type.
*	It is used when you want to take one input and return one output. 
*	Function<T, R> is a functional interface from java.util.function package. 
*	Ex: interface Function <T, R>{
 *      public R apply(T);
	*}

*Here T → input type & R → return/output type

 */
public class FunctionInterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Integer, Integer> obj = (n) -> (n * n);
		
		System.out.println(obj.apply(10));
		System.out.println(obj.apply(50));
		System.out.println(obj.apply(30));

	}

}
