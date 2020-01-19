package com;
import java.util.Scanner;
public class P4321 {
	public static void main(String[] args)
	{	
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	int i=1;	
    while(i<=N)
    {
    	int temp=N;
    	int j=1;
    	while(j<=N)
    	{
    		System.out.print(temp + " ");
    		temp=temp-1;
    		j=j+1;
    	}
    	System.out.println();
        i=i+1;
    }
   }	
}