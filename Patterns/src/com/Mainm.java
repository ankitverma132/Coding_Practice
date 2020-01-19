package com;
public class Mainm {
	public static void main(String[] args) {
		diamondOfStars(13);
	}
	public static void diamondOfStars(int n) {		
        int i=1;
        int k=(n+1)/2;
        while(i<=n)
        {          
           while(i<=k)
            {
    	      int space=1;
    	      while(space<=(k-i))
    	       {
    		    System.out.print(" "); 
                space++;
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
            int temp=1;
            int l=n-2;
            while(i>k && i<=n)
             {             
              int space=1;            
              while(space<=temp)
               {
                   System.out.print(" ");
                   space=space+1;                   
               } 
               int m=1;
    	       while(m<=l)
    	       {
    		    System.out.print("*");
    		    m=m+1;
    	       }              
             System.out.println();
             i=i+1;
             temp+=1;
             l-=2;;                  
          }
      }
	}
}