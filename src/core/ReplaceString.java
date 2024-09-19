package core;

public class ReplaceString {
	
	String st="avinash";
	char[] ch = st.toCharArray();
	
	
	
	public void check(String str)
	{
		for(int i =0;i<ch.length;i++)
		{
			if(ch[i]=='a')
			{
				ch[i]='*';
			}
			
		}
		System.out.println(ch);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		ReplaceString c = new ReplaceString();
		c.check("avinash");
		
		
		
		
		
	}

}
