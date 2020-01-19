package com;
import java.util.Scanner;
public class InvertStar {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int i=1;
    while(i<=N)
    {
      int space=1;
      while(space<=(i-1))
      {
    	  System.out.print(" ");
    	  space++;
      }
      int j=1;
      while(j<=(N-i+1))
      {
    	  System.out.print("*");
    	  j++;
      }
      System.out.println();
      i++;
    }
  }
}