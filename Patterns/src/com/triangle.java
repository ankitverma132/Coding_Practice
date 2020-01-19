package com;

import java.util.Scanner;
public class triangle {
	public static void main(String[] args) {     
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i=1;
        while(i<=N)
        {
                int space=1;
                while(space<=(N-i))
                {
                    System.out.print(" ");
                    space++;
                }             
               int j=1;              
               while(j<=(2*i-1))
               {
                   int temp=i;
                   while(j<=i)
                     {
                      System.out.print(temp);
                      temp++; 
                      j++; 
                     }
                    int k=2*i-2; 
                    while(j>i && j<=(2*i-1))
                     {
                       System.out.print(k); 
                       k--;
                       j++; 
                     }              
               }
             System.out.println();
            i++;
        }
   	}
}