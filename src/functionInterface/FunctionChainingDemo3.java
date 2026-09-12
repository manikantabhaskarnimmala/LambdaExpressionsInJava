package functionInterface;

import java.util.function.Function;

/*
 * Function Chaining
 *   andThen() 
 *   compose()
 */

public class FunctionChainingDemo3 {

	public static void main(String[] args) {

		Function<Integer, Integer> f1 = (i) -> {
			return i * i;
		};
		Function<Integer, Integer> f2 = (i) -> {
			return i * i * i;
		};

		// andThen() :
		System.out.println(f1.andThen(f2).apply(2));
		// Here firstly 2 will be going to f1 function then it will become 4 as(2*2),
		// then this 4 will be passed into f2 then it will become 64 (4*4*4)

		// andThen() : Here first f1 will be executed with 2 as input the f1 become 4,
		// and then this 4 will be passed into f2 as input then it will become 64.

		// Here f1 will be executed first and then f2 will be executed.

		// compose();
		System.out.println(f1.compose(f2).apply(2));
		// Here f2 will be executed by taking 2 as input f2 will become 8, and then 8 is
		// passed into f1 by 8 as input f1 will become 64
		
		//Here f2 will be executed first and f1 will be executed later.

	}
}
