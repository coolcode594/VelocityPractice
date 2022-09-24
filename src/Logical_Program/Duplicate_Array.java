package Logical_Program;

public class Duplicate_Array 
{
	public static void main(String[] args) 
	{
		int a[]=new int[] {4,8,9,5,4,7,5,7,3};
		
		System.out.println("Duplicate element in given array");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
				
				if(a[i]==a[j])
				{
					System.out.print( a[j]);
				}
				
		}
		
	}

}
