package com;
import java.util.Scanner;
public class Hard {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();      
        if(n%2==0)
         {     	       	
            int i=1;
            while(i<=n) 
             {  
        	     int m=0;
                 while(i<=(n/2))
                 {       
                     int r=m*n+1;
                     int j=1;
                     while(j<=n)
                     {
                         System.out.print(r + " ");
                         j++;
                         r++;
                     }
                     System.out.println();
                         m=m+2;
                          i++;
                  }           
                  int q=n-1;
                  while(i>(n/2) && i<=n)
                  {                    
                      int k=(q*n)+1;     
                      int j=1;
                      while(j<=n)
                      {
                         System.out.print(k + " ");
                            k++;
                            j++;
                      }
                      System.out.println();
                        i++;
                        q-=2; 
                   }   	
               }
            }
        else
        {         
            int i=1;
            while(i<=n) 
            {  
                int m=0;
               while(i<=(n/2)+1)
               {       
                   int r=m*n+1;
                   int j=1;
                  while(j<=n)
                  {
                      System.out.print(r + " ");
                         j++;
                         r++;
                  }
                  System.out.println();
                  m+=2;
                  i++;
               } 
                m=n-2;
               while(i>(n/2)+1 && i<=n)
               {                    
                    int k=(m*n)+1;     
                    int j=1;
                    while(j<=n)
                    {
                       System.out.print(k + " ");
                       k++;
                       j++;
                    }
                     System.out.println();
                        i++;
                        m-=2; 
                }
         	}        	
        }     
	 }   
  }