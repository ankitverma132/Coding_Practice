package com;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {		
	Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int i=1;
        int temp;
        
        while(i<=N)
        {  
          int j=1;
          temp=i;
          while(j<=i)
          {           
              System.out.print(temp);
              temp=temp+1;
              j=j+1;
          }    
           i=i+1;
           System.out.println();
       }	
	}
}