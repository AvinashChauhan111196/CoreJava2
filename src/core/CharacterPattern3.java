package core;

/*
A 
B C 
D E F 
G H I J 
K L M N O 
 */


public class CharacterPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch='A';
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			
		}
	}

}
