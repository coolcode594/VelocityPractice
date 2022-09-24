package Logical_Program;

public class Palindrome
{
	public static void main(String[] args)
{
		int num=454;
		int temp=num;
		int sum=0;
		int rem;
		
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+"is palindrome number");
		}
		else
		{
			System.out.println(temp+"is not palindrome number");

		}
		}
}
