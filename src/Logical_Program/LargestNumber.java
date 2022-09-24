package Logical_Program;

public class LargestNumber
{
	public static void main(String[] args)
	{
		int a[]=new int[] {7,5,6,2,5,8,9,4,1};
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("the given Array element is:");
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println(a[i]);
			 
		 }
		System.out.println("from the Array Element largest Number is:"+max);
	}
	

}
