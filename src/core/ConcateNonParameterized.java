package core;

public class ConcateNonParameterized {

	
	
	public String concate()
	{
		String fname = "Avinash";
		String lname = "Chauhan";
		String full = fname+" "+lname;
		System.out.println("The concatination is " + full);
		return full;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConcateNonParameterized c = new ConcateNonParameterized();
		c.concate();

	}

}
