package String;

public class SpecialCharcterRemove 
{
	public static void main(String[] args) 
	{
		String str="Aniket@";
		
		String n=" ";
		
		for(int i=0;i<str.length();i++)
		{
			char a=str.charAt(i);
			
		for(char b='a';b<='z';b++)
		{
			if(a==b)
			{
				n=n+a;
			}
		}
		System.out.println
		(n);
		}
	}

}
