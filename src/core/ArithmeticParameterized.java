package core;

public class ArithmeticParameterized {

	
	int cal;
	
	public int mult(int a,int b) {
		
		cal = a*b;
		System.out.println("Multiplication of number is " +cal);
		return cal;
	}

	public int div(int a,int b) {
		
		cal = a/b;
		System.out.println("Division of number is " +cal);
		return cal;
	}

	public int sub(int a,int b) {
		
		cal = a-b;
		System.out.println("Subtraction of number is " +cal);
		return cal;
	}

	public int add(int a,int b) {
	
		cal = a+b;
		System.out.println("Addition of number is " +cal);
		return cal;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArithmeticParameterized a = new ArithmeticParameterized();
		a.add(10, 5);
		a.sub(10, 02);
		a.mult(2, 5);
		a.div(10, 2);

	}

}
