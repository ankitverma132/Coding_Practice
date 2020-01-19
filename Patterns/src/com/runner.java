package com;
import java.util.Scanner;
public class runner {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();     
       
        int i,j;
        for(i=1;i<=N;i++)
          {      
              int p=N;
              for(j=1;j<=N;j++)
                  {       
                      if(j==(N-i+1))
                       {
                          System.out.print("*"); 
                             p--;
                       }
                      else
                       {
                          System.out.print(p);
                             p--;                   
                       }              
                   }
               System.out.println();
           }   
      }	
}