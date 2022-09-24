package Logical_Program;

public class PrimeArray 
{
 public static void main(String[] args)
 {
	int a[]= {1,2,5,7,8};
	int flag=0;
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=2;j<a[i];j++)
		{
			if(a[i]%j==0)
			{
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println(a[i]);
		}
	}
	
}
}
