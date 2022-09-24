package String;

public class ReverseSamePlace //reverse the string same place
{ 
	public static void main(String[] args) 
	{
		String str="Kunal Shirke";
		
		String arr[]=str.split(" ");
		
		String revs="";
		for(int i=0;i<arr.length;i++)
		{
			String a=arr[i];
			
			String revs1=" ";
			for(int j=a.length()-1;j>=0;j--)
			{
		         revs1=revs1+a.charAt(j);
				
			}
			revs=revs+revs1;
		}
	System.out.println(revs);
	}
	

}
