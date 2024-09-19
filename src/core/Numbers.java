package core;

public class Numbers {

	int num = 10;
	
	public int test() {
		
		if(num>12)
		{
			System.out.println("The number is greater than 12");
		}
		else
		{
			System.out.println("The number is less than 12");
		}
		return num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Numbers n = new Numbers();
		n.test();

	}

}
