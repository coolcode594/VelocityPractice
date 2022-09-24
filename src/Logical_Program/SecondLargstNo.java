package Logical_Program;

public class SecondLargstNo

{
 public static void main(String[] args) 
 {
	 int a[]= {1,4,5,6,7,8,9,10};
	 int temp;
	 int size =a.length;
	 
	 System.out.println("Array size is "+size); //7
	 
	 for(int i=0;i<size;i++) //internal checking
	 {
		 for(int j=i+1;j<size;j++) //outside checking
		 {
			 if(a[i]>a[j])
			 {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			 }
		 }
	 }
	 System.out.println();
	 
	 System.out.println("Elements of array in Ascending order");
	 for(int i=0;i<size;i++)
	 {
		 System.out.print(a[i]+" ");
	 }
	 System.out.println();
	 System.out.println("Second largest number"+a[size-2]);
}
}
