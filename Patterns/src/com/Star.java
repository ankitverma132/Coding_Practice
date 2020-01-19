package com;
import java.util.Scanner;
public class Star {
	public static void main(String[] args)
	{	
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	int i=1;	
    while(i<=N)
    {
    	int space=1;
    	while(space<=(N-i))
    	{
    		System.out.print(" ");
    		space=space+1;
    	}  
    	int j=1;
    	while(j<=((2*i)-1))
    	{
    		System.out.print("*");
    		j=j+1;
    	}
    	System.out.println();
        i=i+1;
    }
   }	
}