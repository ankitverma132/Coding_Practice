package com;
import java.util.Scanner;
public class reverseNum {
	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i=1;
        while(i<=N)
        {
            int temp=i;
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
