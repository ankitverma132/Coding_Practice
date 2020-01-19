package com;
import java.util.Scanner;
public class P543210 {
	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i=1;
        while(i<=N)
        {
            int temp=N-i+1;
            int j=1;
            while(j<=(N-i+1))
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
