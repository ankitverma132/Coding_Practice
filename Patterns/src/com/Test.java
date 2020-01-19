package com;

import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(); 
        int i;
        int j;   
      for(i=1;i<=N;i++)
      {      //  this loop is used to print lines  
             for(j=1;j<=N;j++)
             {       // this loop is used to print * in a line  
                if(i==j)  
                  System.out.print("*");  
                else  
                  System.out.print("0");  
             }  
         j--;        // Making j value 4 from 5
        System.out.print("*");  
        while(j>=1){// this loop is used to print * in a line  
          if(i==j)  
           System.out.print("*");  
          else  
           System.out.print("0");  
          j--;  
      }  
      System.out.println("");  
    }   
  }	
}
