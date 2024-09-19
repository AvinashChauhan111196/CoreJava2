package core;

public class ConcateParameterized {

	public String concate(String fname,String lname)
	{
		
		String full = fname+" "+lname;
		System.out.println("The concatination is " + full);
		return full;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcateParameterized cp = new ConcateParameterized();
		cp.concate("Avi", "Chauhan");
	}

}
