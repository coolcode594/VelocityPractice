package Logical_Program;

public class PrimeNo 
{
public static void main(String[] args) 
{
	
	int n=2;
	int flag=0;
	int m=0;

	m=n/2;

	if(n==0||n==1)
	{
	System.out.println(n+"is not prime no");
	}
	else
	{
	 for(int i=2;i<=m;i++)
	{
	if(n%2==0)
	{
	System.out.println(n+"is not prime number");
	flag=0;
	break;
	}
	}

	if(flag==0)
	{
	System.out.println(n+"is prime number");
	}}}}
