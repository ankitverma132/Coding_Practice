package com;
import java.util.Scanner;
public class ConjectIt {  //Ghatiya ques, Answer will be YES always

	public static void main(String[] args) {
				
		Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();        
     
        for(int i=1;i<=T;i++)
        {   
           int c=0;
           int N = sc.nextInt();
           while(N!=1) {
           if(N%2==0)
           {
        	  N=N/2; 
         	  c++;
           }	
           else
           {
        	   N=3*N+1;   
        	   c++;
           }
           if(c==Integer.MAX_VALUE)
           {
        	 break;  
           }
           }
           if(c==Integer.MAX_VALUE)
           {
        	System.out.println("NO");  
           }
           else
           {System.out.println("YES"); }          
	    }
        sc.close();     
  }
}
