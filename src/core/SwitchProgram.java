package core;

public class SwitchProgram {
	
	  public String prog = "abc";
	  
	  public void testSwitch()
	  {

	    // switch statement to check size
	    switch (prog) {
	      case "java":
	        System.out.println("The program selected is " +prog);
	        break;

	        // matching case
	      case "c":
	        System.out.println("The program selected is " +prog);
	        break;

	      case "sql":
	        System.out.println("The program selected is " +prog);
	        break;
	        
	        
	      case "python":
		    System.out.println("The program selected is " +prog);
		    break;
		        
	      case "ruby":
		     System.out.println("The program selected is " +prog);
		     break;
	        

	      default:
	        System.out.println("No program is selected");
	        break;
	    }
	  }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwitchProgram sw = new SwitchProgram();
		sw.testSwitch();

	}

}
