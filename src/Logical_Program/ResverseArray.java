package Logical_Program;

public class ResverseArray
{
   public static void main(String[] args) //done by me tried
   {
	
	   int arr[]=new int[]  {9,8,7,4,5};
	   System.out.println("print the orignal array");
	   for(int i=0;i<arr.length;i++)
		  // for (int i = 0; i < arr.length; i++) 
	   {
		   System.out.println(arr[i]);
		   
	   }
	   System.out.println();
           System.out.println("print the reverse array");
           for(int i=arr.length-1;i>=0;i--)
        	  // for (int i = arr.length-1; i >= 0; i--)
           {
        	   System.out.print(arr[i]);
        	   
           }
   }
}
