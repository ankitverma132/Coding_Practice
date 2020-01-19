package com;
import java.util.Scanner;
public class Quora {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();    
	    int i=1;
	    while(i<=2*N-1)
	    {
	    	while(i<=N)
	    	{
	    		int j=1;
	    		while(j<=2*i)
	    		{
	    			int t=1;
	    			int k=1;
	    			while(t<=i)
	    			{
	    				System.out.print(k);
	    				k++;	
	    				t++;
	    				j++;
	    			}
	    		    k=i;
	    		    t=1;
	    			while(t>i && t<=2*i)
	    			{
	    				System.out.print(k);
	    				k--;
	    				t++;
	    				j++;
	    			}	    				    			
	    		}
	    		System.out.println();
	    		i++;
	    	}
	    	int m=1;
	    	while(i>N && i<=2*N-1)
	    	{	    	
	    		int j=1;
	    		int l=1;
	    		while(j<=N-m)
	    		{
	    		  	System.out.print(l);
	    		  	l++;	
	    		  	j++;
	    		}
	    		l=N-m;
	    	    j=1;
	    		while(j<=N-m)
	    		{
	    			System.out.print(l);
	    		  	l--;
	    		  	j++;
	    		}
	    		System.out.println();
	    		i++;
	    		m++;
	    	}
	    }
	}
}