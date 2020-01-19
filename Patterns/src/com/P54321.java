package com;
import java.util.Scanner;
public class P54321 {
	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i=1;
        while(i<=N)
        {
            int temp=N;
            int j=1;
            while(j<=i)
            {
                System.out.print(temp);
                temp--;
                j++;
            }
            i++;
            System.out.println();
        }
	}

}
