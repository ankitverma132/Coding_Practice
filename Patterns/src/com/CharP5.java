package com;
import java.util.Scanner;
public class CharP5 {
	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i=1;
        while(i<=N)
        {
        	char temp=(char)('A'+N-i);
            int j=1;
            while(j<=i)
            {           	
                System.out.print(temp);
                temp=(char)(temp+1);
                j++;
            }
            i++;
            System.out.println();
        }
	}

}

