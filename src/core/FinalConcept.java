package core;

/* public class FinalConcept {

	public static void main(String[] args)
    {
        // Non final variable
        int a = 5;
 
        // final variable
        final int b = 6;
 
        // modifying the non final variable : Allowed
        a++;
 
        // modifying the final variable : 
        // Immediately gives Compile Time error.
        // b++;
        
        System.out.println("The value of a is " +a+"The value of b is"+b);
    }
    
*/
	
/* 	final class RR {
	    public static void main(String[] args)
	    {
	        int a = 10;
	    }
	}
	// here gets Compile time error that
	// we can't extend RR as it is final.
	class KK extends RR {
	    // more code here with main method
	}  */


/* class QQ {
    final void rr() {}
    public static void main(String[] args)
    {
    }
}
 
class MM extends QQ {
 
    // Here we get compile time error
    // since can't extend rr since it is final.
    void rr() {}
} */

//Java program to illustrate final keyword
/* final class G {

 // by default it is final.
 void h() {}

 // by default it is not final.
 static int j = 30;

public static void main(String[] args)
 {
     // See modified contents of variable j.
     j = 36;
     System.out.println(j);
 }
} */

