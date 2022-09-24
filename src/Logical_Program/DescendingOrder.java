package Logical_Program;

public class DescendingOrder
{

	public static void main(String[] args)
	{
      int []a=new int[]{1,2,3,4,5,6,7,8};

            int temp=0;
         System.out.print("Elements of original Array");

      for(int i=0;i<a.length;i++)
         {
	System.out.println(a[i]+"");	
           }
             for(int i=0;i<a.length;i++)
              {
	        for(int j=0;j<a.length;j++)
           	{
	        	if(a[i]<a[j]) 
	       	{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;	
		}
	}
}
System.out.println();
System.out.print("Element of Array sorted in Descending order");
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]+" ");	
}
}
}