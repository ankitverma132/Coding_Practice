package com;
import java.util.Scanner;
public class Sol {
	public static void main(String[] args) {		
		Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();        
        int i=1;
        while(i<=N)
        {
            int space=1;
            while(space<=(N-i))
            {
               System.out.print(" ");
               space+=1;               
            }
            int j=1;
            int temp=i;
            while(j<=i)
            {
              System.out.print(temp);  
              j=j+1; 
              temp=temp+1;
            }   
            System.out.println();
            i=i+1;
        }       
	}
}