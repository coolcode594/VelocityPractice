package Logical_Program;

public class ArmStrongWhile 
{
	public static void main(String[] args)
	{
		int i=153;
		int rem;
		int j;
		int sum=0;
		int n=i;
	
		while(n>0)
		{
			rem=n%10;  //153%10
			j=rem*rem*rem;  //j=1*1*1=1, 5*5*5=125, 3*3*3=27
			sum=sum+j; //0+1, 1+125, 126+27
			n=n/10;  // 153/10, 
				}
		if(sum==i)
		{
			System.out.println("its armstrong no");
		}
		else
		{
			System.out.println("its not armstrong no.");
		}
	}

}
