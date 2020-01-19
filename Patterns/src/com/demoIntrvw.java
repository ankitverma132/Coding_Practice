package com;
import java.util.Scanner;
public class demoIntrvw {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();    
	    int i=1;
	    while(i<=2*N)
	    {
	    	while(i<=N)
	    	{  
	    		int j=1;
	    		while(j<=2*N+1)
	    		{
	    			int m=1;
	    			while(m<=N-i+1)
	    			{
	    				System.out.print("*");
	    				m++;
	    				j++;
	    			}
	    			m=1;
	    			while(m<=2*i-1)
	    			{
	    				System.out.print(" ");
	    				m++;
	    				j++;
	    			}
	    			m=1;
	    			while(m<=N-i+1)
	    			{
	    				System.out.print("*");
	    				m++;
	    				j++;
	    			}    			
	    		}
	    		System.out.println();
	    		i++;
	    	  }
	    	int l=1;
	    	int q=2*N-1;
	    	while(i>N && i<=2*N)
	    	{ 
	    		int j=1;
	    		while(j<=2*N+1)
	    		{
	    		  int m=1;
	    		  while(m<=l)
	    		  {
	    			  System.out.print("*");
	    			  m++;
	    			  j++;
	    		  }
	    		  m=1;
	    		  while(m<=q)
	    		  {
	    			  System.out.print(" ");
	    			  m++;
	    			  j++;  
	    		  }
	    		  m=1;
	    		  while(m<=l)
	    		  {
	    			  System.out.print("*");
	    			  m++;
	    			  j++;  
	    		  }	    		
	    	   }
	    		  System.out.println();
		      		i++;
		      		q-=2;
		      		l++;
	    	}
	    }	    	
    }
}