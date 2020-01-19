package com;
import java.util.Scanner;
public class mirroP {
	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();       
        int i=1;
        while(i<=N)
        {
            int j=1;
            while(j<=(N-i))
            {
                System.out.print(" ");
                j++;
            }
            j=1;
            int temp=1;
            while(j<=i)
            {
                System.out.print(temp);
                temp++;
                j++;
            }
            System.out.println();
            i++;           
        }		
	}
}