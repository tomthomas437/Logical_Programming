package com.logical;
import java.util.Scanner;

public class PerfectNumber {
	public static void main(String args[])    
	{  
	long n;
	long sum=0;  
	Scanner sc=new Scanner(System.in);         
	System.out.print("Enter the number: ");  
	n=sc.nextLong();  
	int i=1;    
	while(i <= n/2)  {  
	if(n % i == 0)  {    
	sum = sum + i;  } 
	i++;  
	}  
	System.out.println(" The given num is " + n + " and sum of factors is " + sum );  
	if(sum==n)  {   
	System.out.println(n+" is a perfect number."); } 
	else    
	System.out.println(n+" is not a perfect number.");   
	}  
}
