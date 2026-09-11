package java8LambdaExpressions;

@FunctionalInterface
interface BookingCab{
	public void bookCab(String source, String destination);
}

class OlaCab implements BookingCab{
	public void bookCab(String source, String destination) {
		System.out.println("Ola cab is booked from "+source+" to "+destination);
	}
}

public class Demo2 {	
	public static void main(String args[]) {
		BookingCab cab = new OlaCab();
		cab.bookCab("HYD", "BVRT");
		
		//Lambda Expression with functional interface
		BookingCab obj = (String src, String dest) -> {System.out.println("Ola cab is booked from "+src+" to "+dest);};
		obj.bookCab("SC", "TPTY");
	}
}
