package core;

public class Finally {

}
/* //A Java program to demonstrate finally.
class Geek {
 // A method that throws an exception and has finally.
 // This method will be called inside try-catch.
 static void A()
 {
     try {
         System.out.println("inside A");
         throw new RuntimeException("demo");
     }
     finally
     {
         System.out.println("A's finally");
     }
 }

 // This method also calls finally. This method
 // will be called outside try-catch.
 static void B()
 {
     try {
         System.out.println("inside B");
         return;
     }
     finally
     {
         System.out.println("B's finally");
     }
 }

 public static void main(String args[])
 {
     try {
         A();
     }
     catch (Exception e) {
         System.out.println("Exception caught");
     }
     B();
 }
} */

/* //Java program to illustrate finally in
//Case where exceptions do not
//occur in the program
class B {
 public static void main(String[] args)
 {
     int k = 55;
     try {
         System.out.println("In try block");
         int z = k / 55;
     }

     catch (ArithmeticException e) {
         System.out.println("In catch block");
         System.out.println("Dividing by zero but caught");
     }

     finally
     {
         System.out.println("Executes whether exception occurs or not");
     }
 }
} */
/* //Java program to illustrate finally in
//Case where exceptions occur
//and match in the program
class C {
 public static void main(String[] args)
 {
     int k = 66;
     try {
         System.out.println("In try block");
         int z = k / 0;
         // Carefully see flow doesn't come here
         System.out.println("Flow doesn't came here");
     }

     catch (ArithmeticException e) {
         System.out.println("In catch block");
         System.out.println("Dividing by zero but caught");
     }

     finally
     {
         System.out.println("Executes whether an exception occurs or not");
     }
 }
} */

/* //Java program to illustrate finally in
//Case where exceptions occur
//and do not match any case in the program
class D {
 public static void main(String[] args)
 {
     int k = 15;
     try {
         System.out.println("In try block");
         int z = k / 0;
     }

     catch (NullPointerException e) {
         System.out.println("In catch block");
         System.out.println("Dividing by zero but caught");
     }

     finally
     {
         System.out.println("Executes whether an exception occurs or not");
     }
 }
} */


/* //Java program to illustrate finally in

//case where finally doesnt get executed
class E{
public static void main(String[] args){
 try{
   System.out.println("In try block");
   System.exit(0);
 }
 catch(ArithmeticException e){
   System.out.println("In catch block");
 }
 finally{
   System.out.println("finally block");
 }
}
} */