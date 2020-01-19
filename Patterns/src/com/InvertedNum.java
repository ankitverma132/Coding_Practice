package com;
import java.util.Scanner;
public class InvertedNum {

	public static void main(String[] args) {	
	Scanner sc=new Scanner(System.in);
     int N=sc.nextInt();       
     int i=1;
     int temp=N;   
     while(i<=N)
     {
         int j=1;
         while(j<=(N-i+1))
         {
             System.out.print(temp);
             j++;
         }
         System.out.println();
         i++; 
         temp--;
     }
   } 
}
