package com;
import java.util.Scanner;
public class diamond {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();    
	    int i=1;
	    while(i<=2*N) {
	    	while(i<=N)
	    	{
	    		int space=1;
	    		while(space<i)
	    		{
	    			System.out.print(" ");
	    			space++;
	    		}
	    		int j=1;
	    		while(j<=(N-i+1))
	    		{
	    			System.out.print("* ");
	    			j++;	    			
	    		}
	    	System.out.println();
	        i++;
	    	}
	    	int k=N-1;
	    	int n=1;
	    	while(i>N && i<=2*N)
	    	{
	    		int space=1;    		
	    		while(space<=k)
	    		{
	    			System.out.print(" ");
	    			space++;
	    		}
	    		int m=1;	    		
	    		while(m<=n)
	    		{
	    			System.out.print("* ");
	    			m++;	    			
	    		} 
	         System.out.println();
	    	 i++;
	    	 k--;
	    	 n++;	    	 
	    	}  		    		    
	    }	
	}
}