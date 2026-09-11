package java8LambdaExpressions;

@FunctionalInterface
interface Cab{
	public void bookCab();
}

//class Ola implements Cab{
////	public void bookCab() {
////		System.out.println("Ola is booked");
////	}
//	
//	() -> System.out.println("Ola is booked");
//}

public class LambdaExpressionDemo1 {
	
	public static void main(String args[]) {
		//Cab cab = new Ola();
		Cab cab = () -> {System.out.println("Ola is booked");};
		cab.bookCab();
	}

}
