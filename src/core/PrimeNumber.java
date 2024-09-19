package core;

public class PrimeNumber {

	
	
	public static void main(String args[])
	{
	  
		int num=15,temp=0;
		
	  for(int i=2;i<=num/2;i++)
	  {
	  	if(num%i==0)
	  	{
	  	   temp=temp+1;
	  	}
	  }
	  if(temp>0)//if(temp==0)-prime  number
	  {
	  	System.out.println("not prime");
	  }
	  else
	  System.out.print("prime number");
	
}
}

