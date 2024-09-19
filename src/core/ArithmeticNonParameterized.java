package core;


public class ArithmeticNonParameterized {

	
	
	int a = 10;
	int b = 5;
	int cal;
	
	public int mult() {
		
		cal = a*b;
		System.out.println("Multiplication of number is " +cal);
		return cal;
	}

	public int div() {
		
		cal = a/b;
		System.out.println("Division of number is " +cal);
		return cal;
	}

	public int sub() {
		
		cal = a-b;
		System.out.println("Subtraction of number is " +cal);
		return cal;
	}

	public int add() {
	
		cal = a+b;
		System.out.println("Addition of number is " +cal);
		return cal;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArithmeticNonParameterized a = new ArithmeticNonParameterized();
		a.add();
		a.sub();
		a.mult();
		a.div();
	}

}
