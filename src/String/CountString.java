package String;

public class CountString    //find the count each string
{
public static void main(String[] args) 
{
	
	String str="Try hrad";
	
	int count=0;
	
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i) != ' ')
			
		{
			count++;
		}
	 System.out.println("total no. of charcter in string:"+count);
	 
	}
	
}
}
