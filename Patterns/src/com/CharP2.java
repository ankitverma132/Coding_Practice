package com;
import java.util.Scanner;
public class CharP2 {
	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i=1;
        while(i<=N)
        {
            int j=1;
            while(j<=N)
            {
            	char temp=(char)('A'+j-1);
                System.out.print(temp);
                j++;
            }
            i++;
            System.out.println();
        }
	}

}
