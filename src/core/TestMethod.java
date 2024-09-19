package core;

public class TestMethod {

	public void testPublic()
	{
		System.out.println("This is public method");
		
	}
		
	private void testPrivate()
	{
		System.out.println("This is private method");
	}
	
	protected void testProtected()
	{
		System.out.println("This is protected method");
	}
	
	
	public static void main(String args[])
	{
		
		TestMethod tm = new TestMethod();
		tm.testPrivate();
		tm.testProtected();
		tm.testPublic();
	}
}
