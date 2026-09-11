package java8LambdaExpressions;

interface Bank {
	public String withdraw(int money);
}

class HDFC implements Bank {
	public String withdraw(int money) {
		System.out.println("amount withdrawn is " + money);
		return "money is withdrawn";
	}
}

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj = new HDFC();
		System.out.println(obj.withdraw(100)); //amount withdrawn is 100   		money is withdrawn

		Bank obj1 = (money) -> {
			System.out.println("amount withdrawn is " + money);
			return "money is withdrawn";
		};
		System.out.println(obj1.withdraw(100));//amount withdrawn is 100 	money is withdrawn


	}
}
