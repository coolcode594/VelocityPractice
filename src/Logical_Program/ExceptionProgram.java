package Logical_Program;

public class ExceptionProgram 
{
	public static void main(String[] args) 
	{
		int a=10;
	     int b=0;
	     int []r= {1,2,3,4,5};
	     
	    
	     
	     System.out.println("operation started");
	     int result;
	     try
	     {
	    	int c=a/b;
	    	 System.out.println(r[5]);
	     }
	     catch(ArithmeticException d)
	     {
	      System.out.println("the value of B is zero"); 
	        b=2;
	        result=a/b;
	        System.out.println("result is"+result);
	     }
	     catch(ArrayIndexOutOfBoundsException s)
	     {
	    	 System.out.println("given index is out of array size"+r[4]);
	    	 System.out.println("exception catched");
	     }
	     catch(Exception s)
	     {
	    	System.out.println("exception catched");
	    	s.printStackTrace();
	    	s.getMessage();
	    	s.toString();
	     }
//	     finally
//	     {
//	    	System.out.println("batch 21 may"); 
//	     }
	}

}
